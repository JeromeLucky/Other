package homework.servlet1.model.pojo;

public class Goods {
	private String  id;
	private String name;
	private Float price;
	private String introduce;
	
	
	public Goods( String id,String name, Float price, String introduce) {
		super();
		this.id=id;
		this.name = name;
		this.price = price;
		this.introduce = introduce;
	}

	
	
	
	public Goods() {
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}

	
			
}
