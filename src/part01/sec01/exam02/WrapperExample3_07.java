package part01.sec01.exam02;

public class WrapperExample3_07 {

	public static void main(String[] args) {
		
		printDouble(new Double(123.45));
		printDouble(123.45);	// auto Boxing
	}
	// Double obj = new Double(123.45)
	public static void printDouble(Double obj) {

		System.out.println(obj); //auto Unboxing
	}

}
