package homework.servlet1.model.pojo;

public class Info implements  java.io.Serializable {
		@Override
	public String toString() {
		return value ;
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
		private int id;
		private String value;
		public Info(int id, String value) {
			super();
			this.id = id;
			this.value = value;
		}
		public Info() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
