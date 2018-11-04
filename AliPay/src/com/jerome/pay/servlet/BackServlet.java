package com.jerome.pay.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.jerome.pay.config.AlipayConfig;
@WebServlet("/back")
public class BackServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Map<String,String> params = new HashMap<String,String>();
			Map<String,String[]> requestParams = req.getParameterMap();
			for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
				String name = (String) iter.next();
				String[] values = (String[]) requestParams.get(name);
				String valueStr = "";
				for (int i = 0; i < values.length; i++) {
					valueStr = (i == values.length - 1) ? valueStr + values[i]
							: valueStr + values[i] + ",";
				}
				//����������δ����ڳ�������ʱʹ��
				valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
				params.put(name, valueStr);
			}
			
			boolean signVerified = false;
			try {
				signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type);
			} catch (AlipayApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //����SDK��֤ǩ��

			//�������������д���ĳ������´�������ο�������
			if(signVerified) {
				//�̻�������
				String out_trade_no = new String(req.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
			
				//֧�������׺�
				String trade_no = new String(req.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
			
				//������
				String total_amount = new String(req.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
				
				resp.getWriter().println("trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount);
			}else {
				resp.getWriter().println("��ǩʧ��");
			}
		}
		
}
