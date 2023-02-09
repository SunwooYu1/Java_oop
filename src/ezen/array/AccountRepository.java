package ezen.array;

import opp.Account;

/**
 * @author 유선우 2023. 1. 2. 계좌 저장소 객체 여러개의 계좌를 저장, 관리하는 역활의 클래스
 */
public class AccountRepository {
	private Account[] accounts; // 필드 - 배열로 설정
	private int count;// 인스턴스 변수여서 자동 초기화 -> 갯수 설정을 위해 사용

	// 생성자 오버로딩 , 생성자 이름은 클래스와 동일해야한다
	public AccountRepository() {
		this(10); // 디폴트(전달 받지 않을때) 기본적인 배열을 10개 삽입한다
	}

	public AccountRepository(int capacity) {// 입력받은 숫자 크기의 배열 생성
		accounts = new Account[capacity];// 메인 배열 어카운트에, 입력받은 배열 어카운트를 추가.
	}

	// setter/getter
	public Account[] getAccounts() { // getter은 반드시 있어야한다 호출시 계좌 모두 볼수있다
		return accounts;
	}

	public int getCount() {// 계좌 갯수대로 보여주기 위해, getter생성
		return count;
	}

	// 메소드
	// 만들 기능 : 계좌 등록, 조회, 계좌 검색, 계좌 삭제

	// 계좌 등록기능
	public void addAccount(Account account) {// account 입력받기
		accounts[count++] = account;// count(0)에 저장해준뒤, 1씩 증가되며 다음 배열에 저장된다
	}

	// 계좌 검색기능 (반환타입 Account)
	public Account findByAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			if (an.equals(number)) {
				return accounts[i];
			}
		}
		return null; // 찾지 못할경우 돌려주는 값. 해당 코드 없으면 구현 안됨
	}

	// 계좌 삭제
//	public void deleteAccount(String accountOwner, int password) {// account 입력받기
//		for (int i = 0; i < count; i++) {
//			if (accountOwner.equals(accounts[i].getAccountOwner()) && password == accounts[i].getPassword()) {
//				System.out.println(accounts[i].getAccountOwner() + "님의 정보 삭제가 완료되었습니다. 확인을 위해 다시 조회해주세요------");
//				for (int j = 0; j < count - 1; j++) {
//					accounts[i] = accounts[j + 1]; // i가 있던자리 2번째가 차지하기 반복
//				}
//				count--;
//			}
//		}
//
//	}

	// 계좌 삭제
	public boolean removeaccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			if (an.equals(number)) {
				System.out.print("삭제되는 정보 : ");
				System.out.print(accounts[i].toString());
				for (int j = i; j < count - 1; j++) {
					accounts[j] = accounts[j + 1]; // i가 있던자리 2번째가 차지하기 반복
				}
				count--;
				return true;
			}
		}
		return false;
	}

}
