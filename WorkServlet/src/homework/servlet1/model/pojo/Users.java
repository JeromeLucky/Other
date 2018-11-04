package homework.servlet1.model.pojo;



public class Users implements java.io.Serializable {
	private Integer stuId  ;
	private String stuName ;
	private String  infoId ;
	private String major;
	private String school ;
		
	
	public Users(Integer stuId, String stuName, String infoId, String major, String school) {
	
		this.stuId = stuId;
		this.stuName = stuName;
		this.infoId = infoId;
		this.major = major;
		this.school = school;
	}
	public Users() {
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getInfoId() {
		return infoId;
	}
	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
			
}
