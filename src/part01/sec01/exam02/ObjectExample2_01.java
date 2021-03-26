package part01.sec01.exam02;

class GoodsStock /*extends Object 생략되어있다*/{
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode, int stockNum){
		/* super(); */
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString() {
		String str = "상품코드 : "+goodsCode+",재고수량 : "+stockNum;
		
		return str;
	}
}

public class ObjectExample2_01 extends Object{

	public static void main(String[] args) {
		GoodsStock obj = new GoodsStock("57293",100);
		String str = obj.toString();	// toString();은 주소값을 출력한다.
		System.out.println(str);
		System.out.println(obj.toString());	
		System.out.println(obj);
		
//		 상품 코드 : 57293, 재고수량 : 100개를 출력하고싶다면?  
//		오버라이딩 !!(Object라는 자바의 최고클래스안에 기본적으로 toString이 들어있기때문에)

	}

}
