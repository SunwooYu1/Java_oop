package opp;

public class InstensOfExample {
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		
		//상속관계일경우 모두 같은타입으로 본다
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Animal);
		System.out.println(bird instanceof Object);
//		System.out.println(bird instanceof String);
		
	}
}
