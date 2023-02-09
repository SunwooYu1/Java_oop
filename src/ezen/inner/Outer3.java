package ezen.inner;

public class Outer3 {
	String name;

	public void doTask() {
		final int x = 10;
		System.out.println("doTask() 메소드 실행");

		// 지역 내부 클래스
		// 해당되는 메소드 안에서만 사용되는 클래스
		// 가비지 컬렉션 작동 전에 사라짐
		class Helper {
			public void sumeDo() {
				System.out.println("sumDo() 메소드 실행");
				// 메소드 지역 변수는 출력은 가능하나 사용(변경)은 안됨
				// final 입력해야 접근 가능
				System.out.println(x);
				// 인스턴스 변수는 자유롭게 사용 가능
				name = "유선우";
			}
		}
		Helper helper = new Helper();
		helper.sumeDo();
	}
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		// 실행 직후 메소드와 함께 헬퍼 클래스 생성
		out.doTask();
		// 자동으로 헬퍼 클래스 내려가는 시점
	}
}
