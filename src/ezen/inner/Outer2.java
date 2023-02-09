package ezen.inner;

public class Outer2 {
	String name = "유선우";

	public void outerMethod() {
		System.out.println("외부 클래스 출력입니다");
		// inner 클래스 생성
		Inner inner = new Inner();
		// inner 클래스 안의 메소드 사용
		inner.innerMethod();
		// inner 클래스 내부요소 사용시 inner. ~ 으로 호출하여 사용
		System.out.println(inner.age);
	}

	// 인스턴스 멤버 내부 클래스
	// 접근제한자 설정 가능
	// 외부 클래스의 보조적 역활
	// Outer 안의 메소드들이 사용 가능
	class Inner {
		int age = 10;
		public void innerMethod() {
			System.out.println("-내부 클래스 출력입니다-");
			// 외부클래스의 멤버,필드 접근 가능
			System.out.println(name);
		}
	}

	// 내부클래스 실행 확인
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.outerMethod();

		System.out.println("----------외부에서 접근----------------");
		// 외부에서 실행시 내부클래스 접근방법
		Outer2 outer1 = new Outer2();
		Outer2.Inner in = outer1.new Inner();
		in.innerMethod();

	}
}
