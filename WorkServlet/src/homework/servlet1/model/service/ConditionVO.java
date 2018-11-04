package homework.servlet1.model.service;

public class ConditionVO implements java.io.Serializable{
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			private  String name;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public ConditionVO(String name) {
				super();
				this.name = name;
			}

			public ConditionVO() {
				super();
				// TODO Auto-generated constructor stub
			}

		
			
}
