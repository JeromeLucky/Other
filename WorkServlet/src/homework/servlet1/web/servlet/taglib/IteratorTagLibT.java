package homework.servlet1.web.servlet.taglib;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 自定义迭代器标签库
 * @author wlx
 *
 */
public class IteratorTagLibT extends  TagSupport
{
	//待迭代的集合
	private Iterator  items;
	//存放在页面范围内的集合中元素属性名
	private String var;
	//集合中的一个元素
	private Object item;
	
	public  void  setItems(Collection  items)
	{
		if(items.size() > 0)
		{
			this.items = items.iterator();
		}
	}
	
	
	public  void setVar(String var)
	{
		this.var = var;
	}
	
	
	@Override
	public int doStartTag() throws JspException 
	{
		if(items.hasNext())
		{
			//从集合中读取一个元素
			item = items.next();
			//将元素存放在页面范围内
			saveItem();
			return  EVAL_BODY_INCLUDE;
			
		}
		else
		{
			return SKIP_BODY;
		}
	}
	
	@Override
	public int doAfterBody() throws JspException 
	{
		//如果集合中还有元素,就将元素存放在页面范围内,再重复执行该标签主体
		if(items.hasNext())
		{
			item = items.next();
			saveItem();
			return  EVAL_BODY_AGAIN;
		}
		else
		{
			return SKIP_BODY;
		}
	}
	
	/**
	 * 如果元素不为null,就将其存放在页面范围内
	 */
	private void saveItem()
	{
		if(item == null)
		{
			pageContext.removeAttribute(var, PageContext.PAGE_SCOPE);
		}
		else
		{
			pageContext.setAttribute(var, item);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
