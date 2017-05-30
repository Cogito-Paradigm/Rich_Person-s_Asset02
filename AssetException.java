
//예외처리를 위한 클래스
public class AssetException extends Exception{
	public AssetException(){
	}
	public AssetException(String msg){
		super(msg);
	}
	
	public String getMessage(){
		return super.getMessage()+"의 값이 없습니다.";
	}
}
