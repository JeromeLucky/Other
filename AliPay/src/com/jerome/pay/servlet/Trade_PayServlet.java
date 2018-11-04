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
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type); //获得初始化的AlipayClient
	    AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
	    	/*	AlipayTradeAppPayModel model=new AlipayTradeAppPayModel();//可以用于存储参数 传递给requeset
	  			alipayRequest.setBizModel(model);*/
	    
	  //商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = new String(req.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
		//付款金额，必填
		String total_amount = new String(req.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
		//订单名称，必填
		String subject = new String(req.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
		//商品描述，可空
		String body = new String(req.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
	    
	    
	    alipayRequest.setReturnUrl(AlipayConfig.return_url);
	    alipayRequest.setNotifyUrl(AlipayConfig.notify_url);//在公共参数中设置回跳和通知地址
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
	        "  }");//填充业务参数*/
	    String form="";
	/*    AlipayTradePagePayResponse response=null;
	    //使用 sdk Excute
	    try {
			response=alipayClient.sdkExecute(alipayRequest);
			 form = response.getBody(); //调用SDK生成表单
		} catch (AlipayApiException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	
	       try {
			form = alipayClient.pageExecute(alipayRequest).getBody();
	       } catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       } //调用SDK生成表单
	    	
	
	   
	    resp.setContentType("text/html;charset=utf-8");
	    resp.getWriter().write(form);//直接将完整的表单html输出到页面
	    resp.getWriter().flush();
	    resp.getWriter().close();
	
	}
}
