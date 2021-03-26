package part01.sec01.exam02;

class Member extends Object {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	// overriding

	public boolean equals(Object obj) {		// equal로 값이 같은지 알아보는방법
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

}

public class MemberExample_03 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

//		if(obj1==obj2){
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 다름니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 다름니다.");
		}
	}

}
