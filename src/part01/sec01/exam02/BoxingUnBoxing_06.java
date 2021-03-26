package part01.sec01.exam02;

public class BoxingUnBoxing_06 {

	public static void main(String[] args) {
		Integer iValue = new Integer(10); // Boxing : 값을 저장하는것
		Double dValue = new Double(3.14);

		System.out.println(iValue.intValue());
		System.out.println(iValue); // .intValue()를 안써도된다 ==> 저장해놓은값을 자동으로 가져오는것 : Unboxing

		iValue = new Integer(iValue.intValue() + 10);
		dValue = new Double(dValue.doubleValue() + 1.2);

		System.out.println(iValue); // Unboxing
		System.out.println(dValue); // Unboxing

		System.out.println("=====================");

		Integer obj = new Integer("10");
		int sum = obj/* .intValue() */ + 20; // obj가 unboxing 되면서 문자열"10"이 숫자로 바뀜
		System.out.println(sum);

	}

}
