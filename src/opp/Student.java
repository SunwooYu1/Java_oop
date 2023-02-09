package opp;

public class Student {
	//필드(인스턴스변수, 클래스변수, 상수)

	//상수
	public static final String SCHOOL_NAME = "서울대학교";
	//클래스(static) 변수 : 모든 인스턴스 변수들이 공유하는 데이터
	public static int sequence =1; // 선언과 동시에 초기화
	//인스턴스 변수
	private int ssn;
	private String name;
	private String subject;
	
	//초기화 블록 : 생성자 실행전에 실행된다.
	{
		System.out.println("학생 인스턴스가 생성 되었습니다---------");
		System.out.println("**************************************");
	}
	
	
	
	//static 초기화 블록
	static {
		System.out.println("프로그램 로딩중....");
	}

	public Student() {
		this(null, null);
	}

	public Student(String name, String subject) {
		this.ssn = sequence++; //같은 지역 내에서는 클래스 생략
		this.name = name;
		this.subject = subject;
		System.out.println("----------생성자 실행됨");
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 공부하기 텍스트 출력 메소드
	public void study() {
		System.out.println("열심히 공부합시다");
	}
	
	// 학교 이름을 출력하는 공통 기능 (클래스 메소드)
	public static void printSchoolName() {
		System.out.println(SCHOOL_NAME);
//		System.out.println(name); 은 스태틱이 아니므로 사용 불가능
	}
}
