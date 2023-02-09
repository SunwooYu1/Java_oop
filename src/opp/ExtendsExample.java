package opp;

public class ExtendsExample {

	public static void main(String[] args) {
		//상속하는 코드
		Perrent parent = new Perrent("유송은", 51);
		System.out.println("부모님 이름 : "+parent.getName());
		System.out.println("부모님 이름 : "+parent.getAge());
		
		//상속받는 코드
		Child child = new Child("유선우",27,"대학생");
		
		System.out.println(child.getName());
		System.out.println(child.getAge());
		child.song();
	}

}
