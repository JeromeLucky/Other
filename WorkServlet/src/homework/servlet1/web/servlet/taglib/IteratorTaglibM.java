package homework.servlet1.web.servlet.taglib;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class IteratorTaglibM extends TagSupport {
					private Iterator items;
					private String var;
					private Object item;
					
					public void setItems(Collection  items){
									if(items.size()>0){
											this.items=items.iterator();
									}
					}
					
						public void setVar(String var) {
						        this.var = var;
						}
					@Override
					public int doAfterBody() throws JspException {
						if(items.hasNext()){
								item=items.next();
								saveItems();
								return EVAL_BODY_AGAIN;
						}else{
								return SKIP_BODY;
						}
					}
					@Override
					public int doStartTag() throws JspException {
							if(items.hasNext()){
									item=items.next();
									saveItems();
									return EVAL_BODY_AGAIN;  //再次遍历
									
							}else{
									return  SKIP_BODY;  // 跳过
							}
					}
					
					private void saveItems(){
							if(item==null)
							{
									pageContext.removeAttribute(var, PageContext.PAGE_SCOPE);
							}else{
									pageContext.setAttribute(var, item);
									
							}
					}
}	