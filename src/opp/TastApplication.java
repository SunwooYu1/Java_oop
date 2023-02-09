package opp;

import java.util.Scanner;

public class TastApplication {

	public static void main(String[] args) {
		
//		Test test = new Test();
//		test.setName("홍길동");
//			System.out.println("이름 : "+test.getName());
//		int[] total = {60,70,80,90};
//		test.setJumsu(total);
//			System.out.print("점수 : ");
//		for (int j = 0; j < total.length; j++) {
//			System.out.print(" "+test.getJumsu()[j]);
//		}System.out.println();
//		
//		test.getsum();
//		test.getAvg();
//		
//		Test test = new Test("유선우", (20,30,40,50)) 
		
		String name = null;
		int[] jumsu = new int[4];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = scanner.nextLine();//문자열 사용
		
		System.out.print("점수 입력 : ");
		for (int j = 0; j < jumsu.length; j++) {
			jumsu[j] = scanner.nextInt();			// 띄어쓰기로 다음 숫자 인식
		}
		
		Test test2 = new Test(name, jumsu);
		System.out.println("이름 : "+test2.getName());
		System.out.println("총점 : "+test2.getSum());
		System.out.println("평균 : "+test2.getAvg());
	}

}
