package part01.sec01.exam02;

public class AutoBoxingUnboxing2_09 {

	public static void main(String[] args) {
		Integer num1=10;
		Integer num2=20;
		
		num1++; 
//		num1=new Integer(num1.intValue()+1);
		System.out.println(num1);

		num2+=3;
//		num2=new Integer(num2.intValue()+3);
		System.out.println(num2);
		
		int addResult=num1+num2;
		System.out.println(addResult);

		int minResult=num1-num2;
		System.out.println(minResult);
	
		Integer num3 = num1 + num2;
//		Integer num3 = new Integer(num1.intValue()+num2.intValue());
		System.out.println(num3);
		
	}

}
