package homework.xml.pojo;

public class XMLCnode implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4517145906183746913L;
	private String name;
	private String text;
	private Integer pid;
	
	public XMLCnode(){}
	public XMLCnode(String name,String text ,Integer pid){
		this.name=name;
		this.text=text;
		this.pid=pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
}
