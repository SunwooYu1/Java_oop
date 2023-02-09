package ezen.array;

/**
 * 배열 선언, 생성, 사용
 * 
 * @author 유선우 2022. 12. 29.
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array = { 3, 6, 1, 5, 15 };

		// 배열 복사
		// 위의 5개 배열을 아래 배열에 추가해보자
		int[] array2 = { 0, 0, 0, 0, 0, 1, 2, 3, 4, 5 };
		// 배열 입력 확인
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ",");
		}

		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ",");
		}
		System.out.println();

		// 오름차순 정렬하기
		int[] array3 = { 5, 4, 3, 2, 1, 0 };
		int box = 0;

		for (int j = 0; j < array3.length; j++) {
			System.out.println("--------" + (j + 1) + "번째 검사--------");
			for (int i = 0; i < array3.length - 1; i++) {
				if (array3[i] > array3[i + 1]) {
					box = array3[i];
					array3[i] = array3[i + 1];
					array3[i + 1] = box;
					System.out.println((i + 1) + "번 검사가 실행되었습니다");
					System.out.println("변경값 : " + array3[i + 1] + "->" + array3[i]);
				} else {
					System.out.println((i + 1) + "번째 검사 생략");
				}
			}
			
			
			System.out.print("결과");
			for (int i = 0; i < array3.length; i++) {
				System.out.print(" -> " + array3[i]);
			}
			System.out.print(" - ");
			System.out.println();
		}
	}
}
