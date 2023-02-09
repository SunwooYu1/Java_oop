package opp;

public class Child extends Perrent {
//String name;
// int age;
	// 추가 필드
	private String schoolName;

	public Child() {}

	public Child(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	// 메소드 추가
	public void song() {
		System.out.println("노래를 부르는 기능");
	}

}
