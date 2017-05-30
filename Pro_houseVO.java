public class Pro_houseVO extends PropertyVO{
	//주택 필드
	private String roomsu;
	private String area;
	
	//생성자
	public Pro_houseVO(){
	}
	public Pro_houseVO(String type, String address, int price, String roomsu, String area){
		super(type, address, price);
		this.roomsu = roomsu;
		this.area = area;
	}
	
	//toString 오버라이드
	public String toString(){
		return super.toString()+", 방수 : "+roomsu+"개, 면적 : "+area+"평";
	}
	
	//setter와 getter
	public String getRoomsu() {
		return roomsu;
	}
	public void setRoomsu(String roomsu) {
		this.roomsu = roomsu;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
