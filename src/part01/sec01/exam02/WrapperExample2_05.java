package part01.sec01.exam02;

public class WrapperExample2_05 {

	public static void main(String[] args) {
		int total = 0;
		
		for(int cnt = 0; cnt<args.length; cnt++)
			total += Integer.parseInt(args[cnt]); // 문자열("123")을 int 타입(123)의 값으로 바꿈 (parse : 문장을 분석하다)
		System.out.println(total);
	}
}
