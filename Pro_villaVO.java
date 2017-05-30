
public class Pro_villaVO extends PropertyVO{
	//빌라 필드
	private String roomsu;
	private String area;
	private String floor;
	
	//생성자
	public Pro_villaVO(){
	}
	public Pro_villaVO(String type, String address, int price, String roomsu, String area, String floor){
		super(type, address, price);
		this.roomsu = roomsu;
		this.area = area;
		this.floor = floor;
	}
	
	//toString 오버라이드
	public String toString(){
		return super.toString()+", 방수 : "+roomsu+"개, 면적 : "+area+"평, 층수 : "+floor+"층";
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
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
}
