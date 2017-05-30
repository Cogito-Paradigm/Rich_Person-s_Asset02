# Rich_Person-s_Asset02
Java실습 07 (부자 사람의 부동산, 주식 자산 관리 + 부동산VO를 상속받은 각 VO들)

부자(RichPerson)가 가진 부동산 자산과 주식 자산을 리스트로 관리하는 프로젝트입니다.
부자의 자산을 출력하고 합계, 평균 등을 구하고 다른 부자의 자산과 비교할 수 있습니다.

AssetInterface는 RichPerson에서 사용할 메소드를 지정

RichPerson 클래스는 부동산VO 클래스 (PropertVO)와 
주식VO 클래스 (StockVO)를리스트로 관리하고 있음

부동산VO를 상속받은 각 VO (Pro_landVO, Pro_opiVO, Pro_houseVO.....) 등을
통해 각각 다른 형태(type)의 부동산 자산을 관리하기 위한 확장성을 고려

AssetException 클래스를 통해 예외처리

Main에서 실제 동작
