package ezen.ams;

import java.util.ArrayList;
import java.util.List;

public class ListAccountRepository{

	private List<Account> accounts;
//	private int count;
	
	
	
	public int getCount() {
		return accounts.size();
	}
	

	//기본 생성자 변경
	public ListAccountRepository() {
		//생성시, 해당 리스트로 설정됨
		accounts = new ArrayList<>();
	}
	
//	public ListAccountRepository(int capacity) {// 입력받은 숫자 크기의 배열 생성
//		accounts = new Account[capacity];// 메인 배열 어카운트에, 입력받은 배열 어카운트를 추가.
//	}
	

	public void addAccount(Account account) {// account 입력받기
		accounts.add(account);// count(0)에 저장해준뒤, 1씩 증가되며 다음 배열에 저장된다
	}
	
	
	public List<Account> getAccounts(){
		//배열 반환
		return accounts;
	}
	
	public Account findByAccount(String number) {
		//향상 for문 사용
		for (Account account : accounts) {
			if(account.getAccountNumber().equals(number));
			return account;
		}
		
		return null; // 찾지 못할경우 돌려주는 값. 해당 코드 없으면 구현 안됨
	}
	
	public boolean removeaccount(String number) {
		for (Account account : accounts) {
			if(account.getAccountNumber().equals(number)) {
				//맞는 조건이 있다면, 해당 계좌를 삭제함
//				list 기본 기능인 삭제기능 이용함
				accounts.remove(account);
				return true;
			}
		}	
		return false;
	}
}
