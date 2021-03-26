package part01.sec01.exam02;

public class WrapperExample1_04 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		Double obj3 = new Double(1.0005);
		
		int sum = obj1.intValue()+obj2.intValue();
		double num = obj3.doubleValue();
		
		System.out.println(sum);
		System.out.println(num);
		
	}

}



// 자바의 데이터 타입

// primitive type(기본타입): boolean, double, float, char, long, int, short, byte

// reference type(참조타입): class, interface, array

/* 
 * 
 * Wrapper클래스란? 
 * primitive 타입을 객체로 표현하는데 사용
 * 
 * Wrapper : Byte, Short, Integer, Long, Character, Float, Double, Boolean
 * 하나의 래퍼 객체에는 하나의 primitive값을 담을 수 있는데 그 값은 생성자 파라미터로 넘겨 주어야 한다.
 * 래퍼 객체가 생성되고 난 다음에는 그 객체안에 있는 primitive값을 바꿀 수 없다.
 * 
 */


