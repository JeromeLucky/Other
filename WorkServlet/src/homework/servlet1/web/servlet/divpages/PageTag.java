package homework.servlet1.web.servlet.divpages;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PageTag extends TagSupport {


	private PageVO pageVO;
	public int doStartTag() throws JspException {

			JspWriter out=this.pageContext.getOut();
			int pageSize=pageVO.getPages();
		try{
			out.print("<ul class='pagestyle'>");	
			for (int i = 0; i < pageSize; i++) {
				if(pageVO.getStart()==(i*pageVO.getPageSize())){
				out.print("<li style='background-color: #eee;'>");
			}
			else{
				out.print("<li>");
			}	
			out.print("<a href='"+pageVO.getUrl()+"?start="+i*pageVO.getPageSize()+"'>"+(i+1)+"</a></li>");
			}
				
			out.print("</ul>");
			out.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
			return this.EVAL_PAGE;
			
		
		}
	public PageVO getPageVO() {
		return pageVO;
	}
	public void setPageVO(PageVO pageVO) {
		this.pageVO = pageVO;
	}
}
