package ezen.abstraction;


//추상 클래스
/**자식클래스들이 반드시 구현해야하는 기능을 위한 수직적 명세 역활 클래스
 * @author 유선우
 * @Date 2023. 1. 6.
 */
public abstract class Animal /*extends Object*/{
	//생성자 넣을필요없음
	//자식클래스에 그대로 물려주기위해 protected 사용
	protected String name;
	protected int age;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	//모두 동일한 기능은 미리 정의해둘수있다
	public void wlak() {
		System.out.println("걷는기능");
	}
	
	
	//추상 메소드 : 반드시 구현되어야 컴파일된다
	//클래스별로 다름
	public abstract void cry();
	public abstract void eat();

}
