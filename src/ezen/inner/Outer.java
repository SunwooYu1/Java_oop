package ezen.inner;


public class Outer {
	static String name = "유선우";

	public void outerMethod() {
		System.out.println("외부 클래스 출력입니다");
		Inner inner = new Inner();
		inner.innerMethod();
		System.out.println(inner.age);
	}

	// static 멤버 내부 메소드
	static class Inner {
		int age = 10;
		public void innerMethod() {
			System.out.println("-내부 클래스 출력입니다-");
			
			System.out.println(name);
		}
	}

	// 내부클래스 실행 확인
	public static void main(String[] args) {
		

		Outer outer = new Outer();
		outer.outerMethod();
		
		System.out.println("----------외부에서 접근----------");
		// 외부에서 실행시 static내부클래스 접근방법
		 Outer.Inner inner = new Inner();
		 inner.innerMethod();
		 System.out.println(inner.age);
//			Outer2 outer1 = new Outer2();
//			Outer2.Inner in = outer1.new Inner();

	}
}
