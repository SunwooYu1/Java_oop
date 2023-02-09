package ezen.array;

/**
 * 배열 선언, 생성, 사용
 * 
 * @author 유선우 2022. 12. 29.
 */
public class ArrayExample4 {

	public static void main(String[] args) {
		//6개의 로또번호 임의 생성및 배열에 저장
		int[] lottos = new int[6];
		for (int i = 0; i < lottos.length; i++) {
			int random = (int)(Math.random()*45); //0,0 <= 나오는 값 <1.0
			lottos[i] = random;
			for (int j = 0; j < i; j++) { System.out.println(lottos[i]+", "+lottos[j]+"중복검사");//j가 i보다 작을때까지 검사
				if(lottos[j] == lottos[i]) {
					i--;// i를 0으로 돌려 다시뽑게함
				}
			}
		 }
		
		
		ArrayUtil.sort(lottos);
		
		
		for (int i = 0;  i < lottos.length; i++) {
			System.out.print(lottos[i]+",");
		}
		

		
		//for문을 통해 중복체크
	}
}