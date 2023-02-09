package ezen.array;

import java.lang.reflect.Array;

/**
 * 배열 선언, 생성, 사용
 * 
 * @author 유선우 2022. 12. 29.
 */
public class ArrayExample3 {

	public static void main(String[] args) {
		//기본값 설정
		int[] array = { 3, 6, 1, 5, 15 };
		//메소드에 값 전달
		int[] copyArray = ArrayUtil.copyArray(array, 5);
		
		for(int i = 0; i<copyArray.length; i++) {
			System.out.print(copyArray[i]+",");
		}
		System.out.println();
		ArrayUtil.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}