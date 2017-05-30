
public class PropertyVO {
	//부동산 필드
	private String type;
	private String address;
	private int price;
	
	//생성자
	public PropertyVO(){
	}
	public PropertyVO(String type, String address, int price){
		this.type = type;
		this.address = address;
		this.price = price;
	}
	
	//toString 오버라이드
	public String toString(){
		return "분류 : "+type+", 주소 : "+address+", 가격 : "+price+"억";
	}
	
	//setter와 getter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
