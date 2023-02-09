package opp;

public class StandardAPIExample {

	public static void main(String[] args) {
//		String message = "안녕하세요. 유선우입니다";
		String message = new String("안녕하세요 유선우입니다");
		// 생성자 호출 = 메모리 할당 하는것이 올바른 문법이다
		// 인스턴스 메소드로 활용 가능
		int count = message.length();// length();는 이클립스에서 기본 생성된 인스턴스메소드
		System.out.println("총" + count + "개의 문자로 구성되었습니다");

		String ssn = new String("970911-6111111");
//		System.out.println(ssn.charAt(7));//(0,1,2,3,4,5,6,7)번째에 있는 숫자 출력
		char ch = ssn.charAt(7); // 단일 문자열 입력받기위해 char 사용
		switch (ch) {
		case '1': //char 문자열은 ''로 표현
			System.out.println("2000년이전 출생 남자입니다");break;
		case '2':
			System.out.println("2000년이전 출생 여자입니다");break;
		case '3':
			System.out.println("2000년이후 출생 남자입니다");break;
		case '4':
			System.out.println("2000년이전 출생 여자입니다");break;	
		default:System.out.println("외국인입니다");break;
		}
		//숫자의 자릿수 구하기. String.클래스메소드 사용
		
		//의도적인 에러만들기
//		System.out.println(10/0);
		
		
		int number = 1234567;
		String numstr = String.valueOf(number); //공통기능(클래스메소드) 이용
		int c = numstr.length();				// int형 문자를 valueof()를 통해 string으로 변환
		System.out.println(c);
		
		// 숫자 절댓값 구하기 Math.abs 사용
		int n = -10;
		int result = Math.abs(n);
		System.out.println(result);
		
		//반지름으로 원의 둘레 구하기 Math.PI는 상수
		double radian = 45.3;
		double re = 2 * Math.PI * radian;
		System.out.println(re);
		
	}

}
