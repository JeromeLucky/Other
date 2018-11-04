package homework.xml.pojo;

public class XMlPnode implements java.io.Serializable {
	private String name;
	private Integer id;
	public XMlPnode(){};
	public XMlPnode(String name ,Integer id){
		this.name=name;
		this.id=id;
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
	
}
