package opp;

public class App {
	//메인메소드는 자바 버추얼머신이 스테틱 영역에서 바로 호출하여 구현한다
	public static void main(String[] args) {
		Student student = new Student("유선우", "호텔외식조리학과");
			System.out.println(student.getSsn()); //1
			String name = student.getName();
			System.out.println(name);
			student.study();
	//메모리는 static -> stack -> heap영역으로 나뉜다
	//student: 스태틱영역에 생성(클래스 로드를 위한 영역)
	//new Student : heap 영역에 인스턴스 할당

		// 클래스 변수는 클래스 이름.변수명으로 사용
		System.out.println(Student.SCHOOL_NAME);
		Student	student2 = new Student("이승주", "한식명품조리학과");
		System.out.println(student2.getSsn()); //2출력
	//student2: 스택영역에 생성. 처음 스태틱영역에 할당되면,
	//이후에는 스택영역에만 데이터가 쌓이게된다
	//new Student : heap 영역에  인스턴스 할당
	//stack영역 : static 영역에 있는 값을 로드하기위해 위치하며, 
	//메소드가 끝나면 자동적으로 삭제된다
		
		Student.printSchoolName();
		
		

	}
}
