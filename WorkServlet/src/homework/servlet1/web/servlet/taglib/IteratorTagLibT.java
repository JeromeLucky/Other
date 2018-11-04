package homework.servlet1.web.servlet.taglib;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * �Զ����������ǩ��
 * @author wlx
 *
 */
public class IteratorTagLibT extends  TagSupport
{
	//�������ļ���
	private Iterator  items;
	//�����ҳ�淶Χ�ڵļ�����Ԫ��������
	private String var;
	//�����е�һ��Ԫ��
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
			//�Ӽ����ж�ȡһ��Ԫ��
			item = items.next();
			//��Ԫ�ش����ҳ�淶Χ��
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
		//��������л���Ԫ��,�ͽ�Ԫ�ش����ҳ�淶Χ��,���ظ�ִ�иñ�ǩ����
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
	 * ���Ԫ�ز�Ϊnull,�ͽ�������ҳ�淶Χ��
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
