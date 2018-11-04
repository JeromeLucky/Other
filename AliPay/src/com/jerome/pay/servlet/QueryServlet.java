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
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.jerome.pay.config.AlipayConfig;
@WebServlet("/do/query")
public class QueryServlet  extends HttpServlet{
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				doPost(req, resp);
			}
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				//��ó�ʼ����AlipayClient
				AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
				//�����������
				AlipayTradeQueryRequest alipayRequest = new AlipayTradeQueryRequest();	
		
				//�̻������ţ��̻���վ����ϵͳ��Ψһ������
				String out_trade_no = new String(req.getParameter("WIDTQout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
				//֧�������׺�
				String trade_no = new String(req.getParameter("WIDTQtrade_no").getBytes("ISO-8859-1"),"UTF-8");
				//���ѡһ����
				
				alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","+"\"trade_no\":\""+ trade_no +"\"}");
			
				
				
				
			/*	AlipayTradeQueryResponse response = null;
				try {
					response = alipayClient.execute(alipayRequest);
				} catch (AlipayApiException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				if(response.isSuccess()){
				System.out.println("���óɹ�");
				} else {
				System.out.println("����ʧ��");
				}*/
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
