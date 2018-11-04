package com.jerome.pay.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.jerome.pay.config.AlipayConfig;
@WebServlet("/do/refund")
public class RefundServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//��ó�ʼ����AlipayClient
			AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
			//�����������
			AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();
			
			//�̻������ţ��̻���վ����ϵͳ��Ψһ������
			String out_trade_no = new String(req.getParameter("WIDTRout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
			//֧�������׺�
			String trade_no = new String(req.getParameter("WIDTRtrade_no").getBytes("ISO-8859-1"),"UTF-8");
			//���ѡһ����
			//��Ҫ�˿�Ľ��ý��ܴ��ڶ���������
			String refund_amount = new String(req.getParameter("WIDTRrefund_amount").getBytes("ISO-8859-1"),"UTF-8");
			//�˿��ԭ��˵��
			String refund_reason = new String(req.getParameter("WIDTRrefund_reason").getBytes("ISO-8859-1"),"UTF-8");
			//��ʶһ���˿�����ͬһ�ʽ��׶���˿���Ҫ��֤Ψһ�����貿���˿��˲����ش�
			String out_request_no = new String(req.getParameter("WIDTRout_request_no").getBytes("ISO-8859-1"),"UTF-8");
			
			alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
					+ "\"trade_no\":\""+ trade_no +"\"," 
					+ "\"refund_amount\":\""+ refund_amount +"\"," 
					+ "\"refund_reason\":\""+ refund_reason +"\"," 
					+ "\"out_request_no\":\""+ out_request_no +"\"}");
			
			//����
			String result=null;
			try {
				result = alipayClient.execute(alipayRequest).getBody();
			} catch (AlipayApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//���
			resp.getWriter().println(result);
		}
		
}
