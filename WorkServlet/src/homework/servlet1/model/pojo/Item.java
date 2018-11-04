package homework.servlet1.model.pojo;

public class Item {
		private String id ;
		private String goodsName;
		private String  goodsId;
		private  Double number;

	public Item(String id, String goodsName,String goodsId ,Double number) {
		super();
		this.id = id;
		this.goodsName=goodsName;
		this.goodsId=goodsId;
		this.number=number;

	}
	public Item() {

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

	public Double getNumber() {
		return number;
	}
	public void setNumber(Double number) {
		this.number = number;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
			
}
