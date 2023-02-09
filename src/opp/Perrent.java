package opp;

public class Perrent {
	 private String name;
	 private int age;
	
	
	
	public Perrent() {
		this(null, 0);	
	}
	//생성자 자동 생성
	public Perrent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	
	
	
	
}
