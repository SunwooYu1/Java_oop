package opp;

import java.util.jar.Attributes.Name;

/**
 * 자바는 다양성을 지원하기위해 클래스 자동 형변환과 오버라이딩을 지원한다
 * @author 유선우
 * @Date 2023. 1. 5.
 */
public class PolymorphismExample2 {

	public static void main(String[] args) {
		Account account1 = new Account("3333-4444-555", "홍길동", 1234, 100000L);
		Account account2 = new Account("3333-4444-555", "홍길동", 1234, 100000L);

		//내용이 다르지만 true 출력
		//비교대상 필드. 비교할 필드 입력해 결과 출력
		System.out.println(account1.equals(account2));
		
		//Object에 들어간 데이터가 Account 타입이 아니기때문에
		//지정해둔 false값 출력.
		//만약 equals에 false값이 출력되도록 지정하지 않은경우,
		//오류가 나오며 더이상 진행되지 않는다
		String name = "유선우";
		System.out.println(account1.equals(name));
		
		

//		System.out.println(account1.equals(name));
		//이렇게 넘겨주는경우, name이 정해두었던 Account로 형변환이 진행되는데,
		//상속관계가 아닌 name(string)이 Account로 변환될수 없으므로,
		//파일이 실행되지않는다
		
	}

}
