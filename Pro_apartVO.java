
public class Pro_apartVO extends PropertyVO{
	//아파트 필드
	private String roomsu;
	private String total;
	
	//생성자
	public Pro_apartVO(){
	}
	public Pro_apartVO(String type, String address, int price, String roomsu, String total){
		super(type, address, price);
		this.roomsu = roomsu;
		this.total = total;
	}
	
	//toString 오버라이드
	public String toString(){
		return super.toString()+", 방수 : "+roomsu+"개, 전세 : "+total+"억";
	}
	
	//setter와 getter
	public String getRoomsu() {
		return roomsu;
	}
	public void setRoomsu(String roomsu) {
		this.roomsu = roomsu;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
