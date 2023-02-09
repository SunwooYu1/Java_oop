package ezen.array;

import java.util.Iterator;
import java.util.Scanner;

import opp.Account;

/**
 * @author 유선우
 * @Date 2023. 1. 2.
 * 배열을 이용한 은행 계좌목록관리
 */
public class ArrayExample7 {

	public static void main(String[] args) {
		//계좌 크기 설정
		Account[] accounts = new Account[10];
		int index = 0;
		
		
		//배열에 계좌 등록
		accounts[index++] = new Account("111-222", "유선우", 1234, 1200000);
		accounts[index++] = new Account("111-333", "홍길동", 1324, 100000000);
		accounts[index++] = new Account("111-444", "아무개", 1224, 105022000);
		
		//등록된 모든 계좌 정보 출력
		for (int i = 0; i < index; i++) {
			Account acc = accounts[i];
			System.out.println(acc.toString());
		}
		System.out.println("----------계좌검색 테스트 -----------------");
//		String searchNum = "111-333";
		String searchNum = null;
		
		
		System.out.print("검색하고자 하는 계좌번호를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		searchNum = scanner.nextLine();
		
		System.out.println("입력하신 계좌 :" + searchNum);
		for (int i = 0; i < index; i++) {
			String number = accounts[i].getAccountNumber();
			if (number.equals(searchNum)) {//==연산자는 정수(숫자)에만 사용 가능하다 문자열은 
				System.out.println(accounts[i].toString());
			}
		}
		
	}

}
