package model;

public class DrinkVO {
	private int num;
	private String name;
	private int price;
	private int stock;

	DrinkVO(int num,String name,int price,int stock){
		this.num=num;
		this.name=name;
		this.price=price;
		this.stock=stock;
		System.out.println(this.name+" 음료 생성 완료되었습니다!");
	}


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}


}
