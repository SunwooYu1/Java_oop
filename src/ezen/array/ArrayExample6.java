package ezen.array;

import java.util.Iterator;

/**
 * @author 유선우
 * @Date 2023. 1. 2.
 * 참조형 배열 선언, 생성, 사용
 */
public class ArrayExample6 {

	public static void main(String[] args) {
		//1차원 참조형 배열 선언
		String[] strings; //String타입의 배열을 만든다 이름은 strings
		
		//배열 생성
		strings = new String[5]; // strings의 크기를 5로 설정한다
//		String str = new String("java");// 이 형식과 기본 개념은 동일하다
//		strings[0] = new String("java");//명시적 생성
		strings[0] = "java";  //묵시적 생성
		strings[1] = "C";  //묵시적 생성
		strings[2] = "C++";  //묵시적 생성
		strings[3] = "C#";  //묵시적 생성
		strings[4] = "Python";  //묵시적 생성
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i] + "("+strings[i].length()+")");
		}
	
		//배열 선언, 생성, 초기화 동시에 하기
//		String[] teams = new String[] {new String("삼성"),new String("엘지"),new String("두산") };
//		String[] teams = {new String("삼성"),new String("엘지"),new String("두산") };
		String[] teams = {"삼성","엘지","두산"};
		
		for (int i = 0; i < teams.length; i++) {
			System.out.println(teams[i]+ "("+teams[i].length()+")");
		}
		
		String[][] arrays = new String[3][5];
		arrays[0][0] = "java";
		//....
		arrays[0][4] = "html";
		
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.print(arrays[i][j]+",");
			}System.out.println();
		}
		
		
	}

}
