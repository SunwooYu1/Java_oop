package opp;

import java.util.Date;

import javax.swing.JOptionPane;

public class MinusAccountExample {

	public static void main(String[] args) {
		MinusAccount ma;
		ma = new MinusAccount("111-222", "유선우", 1234, 100000, 100000000, "2023/1/4");
		
		//부모 메소드 재사용
		System.out.println(ma.getAccountNumber());
		System.out.println(ma.getAccountOwner());
		System.out.println(ma.getRestMoney());
		ma.deposit(1000000);
		ma.withdraw(500000);
		
		System.out.println("현재잔액 : "+ma.getRestMoney());
		
		//자식 클래스 메소드 사용
		System.out.println(ma.getBorrowMoney());
		System.out.println(ma.getBorrowDate());
		
		
		
		//Object의 메소드 재사용
		int code = ma.hashCode();
		System.out.println(code);
		System.out.println(ma.toString());
		
		
		String name = "유선우"; // == new string("유선우");
		System.out.println(name);
		System.out.println(ma.toString());
		System.out.println(ma); //toString()메소드는 JVM에 의해 자동 호출.
								//따라서 평소엔 주소값이 나오지만
								//String 클래스에 재 정의된 toString()메소드자동 호출
		//Object 클래스는 equals() 메소드를 기본 제공
		//레퍼런스 비교
		Account account1 = new Account("1111","유선우",111,1000);
		Account account2 = new Account("1111","유선우",111,1000);
		System.out.println(account1 == account2);//내용이 아니라 주소값을 비교하기때문에 false 출력
		System.out.println(account1.equals(account2));//Object의 equals 재사용
		
		String message1 = "자바";
		String message2 = "자바";
		System.out.println(message1.equals(message2));
		// 여기서 유추 가능한것
		// String 클래스는 Object가 제공하는 equals() 메소드를 재사용하지 않고
		// equals() 메소드를 재정의하여 문자열과 문자열을 비교한다
		
		
		
		
		
	}

}
