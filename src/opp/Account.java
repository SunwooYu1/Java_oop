package opp;

import javax.security.auth.login.AccountNotFoundException;

/**
 * @author 유선우 현실세계의 객체를 프로그램으로 표현하기 은행계좌 추상화 객체 추상화 객체지향 프로그래밍의 4대 특징 : 1. 추상화
 *         2.캡슐화 3.상속 4.다형성
 */
//참조변수(레퍼런스변수 - 어플리케이션에서 사용)

//클래스에 선언하는 접근제한자는 public 혹은 생략(디폴트)
public class Account { // 어디서든 접근 가능한 공개된 클래스
	// 은행이름
	public static final String BANK_NAME = "신한은행";
	// 객체의 속성(정보)들을 저장하기위한 변수 선언 = 필드
	// 인스턴스 변수들(메모리에 올려지는 변수들)
	// 필드에 선언 가능한 접근제한자 : private,생략(default), protected, public
	// private캡슐화(독립화)
	private String accountNumber;
	private String accountOwner;
	private int password;
	private long restMoney;

	// 디폴트 생성자(이름 반드시 클래스와 동일하게)
	// 해당 생성자는, 다른 생성자가 없을경우에만 자동으로 생성된다.
	// 다른 생성자가 존재 할 경우 반드시 만들어 두어야한다
	public Account() {
		this(null, null);// 코드 불러와서, 값을 입력해 초기화한다
	}

	// 생성자 오버로딩(Overloading): 중복정의 /여러개의 생성자를 만들어두고, 원하는 생성자만 뽑아서 쓸수 있다.
	// 기본적으로 2~3개정도 생성해두어 필요에따라 골라쓰는것이 좋다
	public Account(String accountNumber, String accountOwner) {
		this(accountNumber, accountOwner, 0, 0);
	}

	// 이렇게 생성자를 미리 만들어두면, 호출 후 바로 값을 넣어 간편하게 사용 가능하다
	// 기본 생성자로 만들게되면, 초기화되서 들어가게됨
	public Account(String accountNumber, String accountOwner, int password, long restMoney) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.password = password;
		this.restMoney = restMoney;
		// 초기화 되는 기준이 반드시 하나는 존재해야한다
		// this 사용하여 상위에 있는 변수 호출, 동일 이름과 구분해줄수있다.
	}

	// 완벽한 캡슐화를 위해, setter/getter 메소드 정의
	// 각 생성자는 아래의 메소드를 사용 가능하다
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public long getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(long restMoney) {
		this.restMoney = restMoney;
	}

	// 객체의 행위(동작)를 정의하기위한 인스턴스 메소드 (기능)
	// 입금기능
	// 괄호() 안에 입력받을 값을 입력해준다
	public long deposit(long restMoney) {
		this.restMoney += restMoney; // 최종잔액에서, 입력되는 값만큼 더해준다
		return this.restMoney; // 더해진 값을 반환한다
	}

	// 출금기능
	public long withdraw(long restMoney) {
		this.restMoney -= restMoney;
		return this.restMoney;
	}

	// 잔액조회

	// 비밀번호체크(참, 거짓 판단하므로 boolean 사용, 입력받을값은 정수이므로 int 사용)
	public boolean checkPassword(int password) {
		return this.password == password; // 기존 패스워드와, 입력된 값을 비교하여 true, false 값을 돌려준다
	}
	// 이쪽에 main을 통해 출력등 기능 넣을경우 '지역변수'로써 이 안에서만 사용 가능

	// 모든 정보 출력기능
	public String toString() {
		return accountNumber + "\t" + accountOwner + "\t" + "****" + "\t" + restMoney;
	}

	@Override
	// Object타입으로 받으나, 실제 값은 Account 값을 받는다.
	// Object는 최상위에 있으므로 자식속성에있는 Account를 넣어줄수있다
	// 순서대로 비교 -> 비교-> 비교-> 비교'
//		public boolean equals(Object obj) {
//		Account account = (Account)obj; //obj에 넘어온 값을 Account로 다운캐스팅
//
//		   if (account.getAccountNumber().equals(accountNumber)) {
//			   if (account.getAccountOwner().equals(accountOwner)) {
//				   if(account.getPassword() == password) {
//					   if(account.getRestMoney() == restMoney) {
//						   return true;
//					   }
//				   }
//			   }
//		   }
//		  return false;
//	}
	// obj에 equals 뒤에 들어온 Account가 들어온다
	public boolean equals(Object obj) {
		Account account = null;
		// obj에 들어온 데이터가 어카운트 타입이 아닌경우
		if (!(obj instanceof Account)) {
			return false;
		}

		if (obj instanceof Account) {
			account = (Account) obj;
		}

		// obj에 넘어온 값을 Account로 다운캐스팅
		if (account.toString().equals(toString())) {
			return true;
		}
		return false;
	}

}