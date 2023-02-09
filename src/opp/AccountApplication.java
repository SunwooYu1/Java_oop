package opp;

/**
 * @author 유선우 자바 애플리케이션 실행을 위한 '애플리케이션클래스' '메인클래스'라고도 한다
 */
public class AccountApplication {

	// 애플리케이션의 엔트리포인트(실행 진입점)
	public static void main(String[] args) {
		System.out.println("----프로그램시작됨----");

		// int age(1), =0(2), sysout()(3) 순서대로 실행됨
		// 기본 데이터타입 변수 선언 및 할당
		int age = 0;
		System.out.println("나이 : " + age);

		// 만들어둔 변수 선언 값을 넣어줘야 메모리 올라감
		// Account account;(1), new Account()(2) 순서대로 실행됨
		// -4bit로 생성- - new 이용해 새로운 메모리 공간을 만듬 -
		// -안에 4개의 메소드를 가진다(이 공간을 인스턴스라고 부른다)-
		// 참조변수 선언 및 인스턴스 할당(바로가기역할)
		// <-account 이게 참조변수(클래스)임 기존 파일과 이어주는 역할
		Account account = new Account();// <-생성자 호출, 필드 자동 초기화

		// 메모리에 생성된 인스턴스(객체)의 필드사용해보기(데이터 타입에 유의할것)
		account.setAccountNumber("111-1111-1111");
		account.setAccountOwner("유선우");
		account.setRestMoney(100000);
		account.setPassword(1234);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getAccountOwner());
		System.out.println(account.getPassword());
		System.out.println(account.getRestMoney());
		// 인스턴스 메소드 사용해보기

		boolean confirm = account.checkPassword(1234);
		if (confirm == true) {
			System.out.println("비밀번호가 일치합니다");
			long restMoney = account.deposit(10000); // 기존금액 + 입금금액
			System.out.println("입금후 잔액 : " + restMoney);
			restMoney = account.withdraw(10000);
			System.out.println("출금후 잔액 : " + restMoney);
			restMoney = account.getRestMoney();
			System.out.println("현재 잔액 : " + restMoney);
		} else {
			System.out.println("비밀번호가 일치하지 않습니다");
		}

//		하나의 클래스로부터 여러개의 인스턴스를 생성할수 있다.
		Account account2 = new Account();
//		인스턴스 변수는 생성과 동시에 JVM에 의해 자동 초기화된다
//		boolean(false), byte,short,int,long(0), float,double(0.0), char(0)~
//		지역변수는 자동초기화X

//		System.out.println(account2.accountNumber);
		System.out.println(account2.getAccountNumber());
//		System.out.println(account2.restMoney);
		System.out.println(account2.getRestMoney());

//		account2.accountNumber ="111-111-111111";
		account2.setAccountNumber("111-111-111111");
//		account2.restMoney =1000000;
		account2.setRestMoney(1000000);
//		System.out.println(account2.accountNumber);
		System.out.println(account2.getAccountNumber());
//		System.out.println(account2.restMoney);
		System.out.println(account2.getRestMoney());

		// 생성자 테스트
		Account account3 = new Account("3333-4444-555", "홍길동", 1234, 100000L);
		System.out.println(account3.getRestMoney());
		
		Account account4 = new Account("1111-222-333", "박지성");
		System.out.println(account4.getAccountNumber());
		
		System.out.println(Account.BANK_NAME);//상수기때문에 바뀔수없다

		System.out.println("----프로그램종료됨----");

	}
}
