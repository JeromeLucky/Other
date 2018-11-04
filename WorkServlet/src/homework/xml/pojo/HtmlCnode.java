package homework.xml.pojo;

public class HtmlCnode implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4517145906183746913L;
	private String name;
	private String paname;
	private String pavalue;
	private Integer pid;
	
	public HtmlCnode(){}
	public HtmlCnode(String name,String paname , String pavalue ,Integer pid){
			this.name=name;
			this.paname=paname;
			this.pavalue=pavalue;
			this.pid=pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPaname() {
		return paname;
	}
	public void setPaname(String paname) {
		this.paname = paname;
	}
	public String getPavalue() {
		return pavalue;
	}
	public void setPavalue(String pavalue) {
		this.pavalue = pavalue;
	}
	
}
