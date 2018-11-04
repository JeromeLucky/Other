package com.jerome.pay.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.jerome.pay.config.AlipayConfig;
@WebServlet("/do/refundQuery")
public class RefundQueryServlet  extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//获得初始化的AlipayClient
			AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
			
			//设置请求参数
			AlipayTradeFastpayRefundQueryRequest alipayRequest = new AlipayTradeFastpayRefundQueryRequest();
			
			//商户订单号，商户网站订单系统中唯一订单号
			String out_trade_no = new String(req.getParameter("WIDRQout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
			//支付宝交易号
			String trade_no = new String(req.getParameter("WIDRQtrade_no").getBytes("ISO-8859-1"),"UTF-8");
			//请二选一设置
			//请求退款接口时，传入的退款请求号，如果在退款请求时未传入，则该值为创建交易时的外部交易号，必填
			String out_request_no = new String(req.getParameter("WIDRQout_request_no").getBytes("ISO-8859-1"),"UTF-8");
			
			alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
					+"\"trade_no\":\""+ trade_no +"\","
					+"\"out_request_no\":\""+ out_request_no +"\"}");
			
			//请求
			String result=null;
			try {
				result = alipayClient.execute(alipayRequest).getBody();
			} catch (AlipayApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//输出
			resp.getWriter().println(result);
		}
}
