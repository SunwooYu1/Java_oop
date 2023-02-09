package ezen.ams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAccountRepository {
	// 계좌번호 받기 위해 key 는 String 형태 사용
	private Map<String, Account> accounts;
//	private int count;

	public int getCount() {
		return accounts.size();
	}

	// 기본 생성자 변경
	public MapAccountRepository() {
		// 생성시, 해당 리스트로 설정됨
		accounts = new HashMap<>();
	}

//	public ListAccountRepository(int capacity) {// 입력받은 숫자 크기의 배열 생성
//		accounts = new Account[capacity];// 메인 배열 어카운트에, 입력받은 배열 어카운트를 추가.
//	}

	public void addAccount(Account account) throws RuntimeException {// account 입력받기
		// 입력받은 계좌에서 번호만 따서 키로 저장
		if (accounts.containsKey(account.getAccountNumber())) {
			// 여기서 예외클래스를 생성하거나 , 예외 문장을 보내주어야한다
			throw new RuntimeException("이미 존재하는 계좌입니다");
		} else {
			accounts.put(account.getAccountNumber(), account);
		}
	}

	public List<Account> getAccounts() {
		// 배열 반환
		// values 기본 반환 타입은 Collector 이여서 형변환 필수
		List<Account> list = new ArrayList<>(accounts.values());
		return list;
	}

	public Account findByAccount(String number) {
		return accounts.get(number);
	}

	public boolean removeaccount(String number) {
		Account removeAccount = accounts.remove(number);
		if (removeAccount != null) {
			return true;
		}
		return false;
	}
}
