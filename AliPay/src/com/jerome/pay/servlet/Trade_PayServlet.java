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
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.alipay.api.response.AlipayTradePayResponse;
import com.jerome.pay.config.AlipayConfig;
@WebServlet("/do/pay")
public class Trade_PayServlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type); //��ó�ʼ����AlipayClient
	    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//����API��Ӧ��request
	    	/*	AlipayTradeAppPayModel model=new AlipayTradeAppPayModel();//�������ڴ洢���� ���ݸ�requeset
	  			alipayRequest.setBizModel(model);*/
	    
	  //�̻������ţ��̻���վ����ϵͳ��Ψһ�����ţ�����
		String out_trade_no = new String(req.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
		//���������
		String total_amount = new String(req.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
		//�������ƣ�����
		String subject = new String(req.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
		//��Ʒ�������ɿ�
		String body = new String(req.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
	    
	    
	    alipayRequest.setReturnUrl(AlipayConfig.return_url);
	    alipayRequest.setNotifyUrl(AlipayConfig.notify_url);//�ڹ������������û�����֪ͨ��ַ
	    alipayRequest.setBizContent("{" +
	        "    \"out_trade_no\":\""+out_trade_no+"\"," +
	        "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
	        "   \"total_amount\":\""+ total_amount +"\"," +
	        "   \"subject\":\""+ subject +"\"," +
	        "  \"body\":\""+ body +"\","+ 
	    
	       "\"timeout_express\":\"10m\","+     
	       "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
	        "    \"extend_params\":{" +
	       "    \"sys_service_provider_id\":\"2088511833207846\"" +
	        "    }"+
	        "  }");//���ҵ�����*/
	    String form="";
	/*    AlipayTradePagePayResponse response=null;
	    //ʹ�� sdk Excute
	    try {
			response=alipayClient.sdkExecute(alipayRequest);
			 form = response.getBody(); //����SDK���ɱ�
		} catch (AlipayApiException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	
	       try {
			form = alipayClient.pageExecute(alipayRequest).getBody();
	       } catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       } //����SDK���ɱ�
	    	
	
	   
	    resp.setContentType("text/html;charset=utf-8");
	    resp.getWriter().write(form);//ֱ�ӽ������ı�html�����ҳ��
	    resp.getWriter().flush();
	    resp.getWriter().close();
	
	}
}
