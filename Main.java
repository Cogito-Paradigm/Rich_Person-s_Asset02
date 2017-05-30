
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		//부자 1의 자산객체
		RichPerson buja01 = new RichPerson("아이유");
		
		//부자 1의 부동산 자산 추가, toString 확인
		buja01.lp.add(new Pro_houseVO("주택","서울 강남구",10,"3","20"));
		buja01.lp.add(new Pro_opiVO("오피스텔","서울 동작구",2,"30","100"));
		buja01.lp.add(new Pro_apartVO("아파트","서울 마포구",5,"4","1"));
		buja01.lp.add(new Pro_villaVO("빌라","서울 강남구",15,"2","15","5"));
		buja01.lp.add(new Pro_landVO("토지","서울 종로구",50,"100","50"));
		
		for(PropertyVO e : buja01.lp){
			System.out.println(e.toString());
		}
		
		//부자 1의 주식 자산 추가, toString 확인
		buja01.ls.add(new StockVO("삼성전자", 1, 200, 250 ,100));
		buja01.ls.add(new StockVO("셀트리온", 2, 8, 15, 5));
		
		for(StockVO e : buja01.ls){
			System.out.println(e.toString());
		}
		
		//부자 1의 자산 합계, 평균, 규모 메소드
		buja01.sum();
		buja01.avg();
		buja01.size();
		
		contain(buja01);
		find(buja01);
		regular(buja01);
	}
	
	public static void contain(RichPerson buja){
		for(PropertyVO e : buja.lp){
			if(e.toString().contains("방수")){
				System.out.println("있다");
			}
		}	
	}	
	
	public static void find(RichPerson buja){
		for(PropertyVO e : buja.lp){
			if(e.toString().contains("방수")){
			//System.out.println(e.toString().indexOf("방수 : "));
			System.out.println(e.getAddress()+"에 위치한 "+e.getType()+"의 방수는 "+e.toString().charAt(37)+"개");
			}
		}
	}
	
	public static void regular(RichPerson buja){
		String reg = "방수 : (.*)(개)";
		Pattern p = Pattern.compile(reg);
		
		for(PropertyVO e : buja.lp){
			Matcher m = p.matcher(e.toString());

			System.out.println("=>>"+e.toString());
			while(m.find()){
				System.out.println("나와야해"+m.group(2));
			}
		}
	}
}