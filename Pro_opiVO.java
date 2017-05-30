
public class Pro_opiVO extends PropertyVO{
	//오피스텔 필드
	private String area;
	private String month;
	
	//생성자
	public Pro_opiVO(){
	}
	public Pro_opiVO(String type, String address, int price, String area, String month){
		super(type, address, price);
		this.area = area;
		this.month = month;
	}
	
	//toString 오버라이드
	public String toString(){
		return super.toString()+", 면적 : "+area+"평, 월세 : "+month+"만";
	}
	
	//setter와 getter
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
}
