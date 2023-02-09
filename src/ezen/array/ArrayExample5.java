package ezen.array;

import java.util.Iterator;

/**
 * 4차원 배열 선언 사용하기
 * 
 * @author 유선우 2022. 12. 29.
 */
public class ArrayExample5 {

	public static void main(String[] args) {
//		int[][] array;
//		array = new int [2][5];
//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;
//		array[0][3] = 4;
//		array[0][4] = 5;
//		array[1][0] = 11;
//		//.....
//		array[1][4] = 22;
		int[][] array = { 
						{ 55, 66, 77, 88, 99 }, // 0에 해당하는 값이 들어옴
						{ 11, 22, 33, 44, 55 } // 1에 해당하는 값이 들어옴
						};

		for (int i = 0; i < array.length; i++) {// 행을 의미
			System.out.println(i + 1 + "반 성적");
			for (int j = 0; j < array[i].length; j++) {// array의 0번째 배열 반복함
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		// 1반 총점 : ???점, 평균 : ???점
		// 2반도 동일하게 출력
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("----" + (i + 1) + "반 총원 : " + array[i].length + "명----");
			total = 0; // 넣어둔 값을 초기화
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
			}
			
			System.out.println((i + 1) + "반" + "의 총점은 " + total + " 점입니다");
			System.out.println((i + 1) + "반의 평균은 " + total / array[i].length + " 점입니다");
		}
	}
}