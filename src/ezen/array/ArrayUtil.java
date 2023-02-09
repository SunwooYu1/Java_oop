package ezen.array;

/**
 * 배열과 관련된 공통 기능 정의
 * 
 * @author 유선우 2022. 12. 29.
 */
public class ArrayUtil {

	// 배열 복사
	// (전달받을 배열, 배열 증가값)
	public static int[] copyArray(int[] srcArray, int increment) {
		// 카피할 값 = new int[전달받은배열크기+전달받은값]
		int[] copiedArray = new int[srcArray.length + increment];
		// 크기만큼 반복하여, 기존값 복사
		for (int i = 0; i < srcArray.length; i++) {
			copiedArray[i] = srcArray[i];
		}
		return copiedArray;
		// 이후 값을 돌려준다
	}

	// 배열 정렬
	public static void sort(int[] srcArray) {
		for (int j = 0; j < srcArray.length; j++) {
			for (int i = 0; i < srcArray.length - 1; i++) {
				if (srcArray[i] > srcArray[i + 1]) {
					int box = srcArray[i];
					srcArray[i] = srcArray[i + 1];
					srcArray[i + 1] = box;
				}
			}

		}
	}
}
