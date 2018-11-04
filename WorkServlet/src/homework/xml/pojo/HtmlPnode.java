package homework.xml.pojo;

public class HtmlPnode implements java.io.Serializable{
	private String name;
	private Integer id;
	private String paname;
	private String pavalue;
	public HtmlPnode(){};
	public HtmlPnode(String name ,Integer id,String paname,String pavalue ){
		this.name=name;
		this.id=id;
		this.paname=paname;
		this.pavalue=pavalue;
	}
	public String getName() {
		return name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
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
