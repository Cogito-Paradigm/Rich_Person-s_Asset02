
public class Pro_landVO extends PropertyVO{
	//토지 필드
	private String area;
	private String tree;
	
	//생성자
	public Pro_landVO(){
	}
	public Pro_landVO(String type, String address, int price, String area, String tree){
		super(type, address, price);
		this.area = area;
		this.tree = tree;
	}
	
	//toString 오버라이드
	public String toString(){
		return super.toString()+", 면적 : "+area+"평, 나무수 : "+tree+"그루";
	}
	
	//setter와 getter
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTree() {
		return tree;
	}
	public void setTree(String tree) {
		this.tree = tree;
	}
}
