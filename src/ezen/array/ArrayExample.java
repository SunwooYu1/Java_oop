package ezen.array;

/**
 * 배열 선언, 생성, 사용
 * 
 * @author 유선우 2022. 12. 29.
 */
public class ArrayExample {

	public static void main(String[] args) {
		int score1, score2, score3, score4, score5;
		score1 = 91;
		score2 = 92;
		score3 = 93;
		score4 = 94;
		score5 = 95;

		int sum = score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;

		// 평균값 구하기
		int everage = sum / 5;
		System.out.println(everage);
//
//		// 배열 선언
//		int[] scores;
//		//int scores[];배열을 뒤에 배치하는것도 가능
//		//배열 생성
//		scores = new int[5];
//		//배열 요소 접근
//		scores[0] = 91;
//		scores[1] = 92;
//		scores[2] = 93;
//		scores[3] = 94;
//		scores[4] = 95;
		
		
		//선언 생성 초기화를 동시에 하기
		//이 경우에는 크기를 주지 않아도 된다
//		int[] scores = new int[] {91,92,93,94,95};
		int[] scores = {81,82,83,84,85};
		System.out.println(scores.length);
		//평균값 구하기(5회 돌게 설정)
		sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum/scores.length);
		
	}

}
