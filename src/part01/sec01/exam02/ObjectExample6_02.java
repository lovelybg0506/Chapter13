package part01.sec01.exam02;

class Circle {
	int radius;
	
	Circle(int radius) {
		this.radius=radius;
	}
	
	public boolean equals(Object obj) {	// 값을비교하게하는것,
		if(!(obj instanceof Circle))
			return false;
		Circle circle=(Circle) obj;
		if(this.radius == circle.radius)
			return true;
		else
			return false;
		
	}

}

public class ObjectExample6_02 {

	public static void main(String[] args) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		// String에 있는 equals메소드는 실제 내용을 비교하고,
		// Object클래스의 equals메소드는
		//  두 객체를 비교할 때 객체의 필드 값이 아니라,참조값을 가지고 비교한다.
		if(obj1.equals(obj2))
			System.out.println("같음");
		else
			System.out.println("다름");
	}	

}

