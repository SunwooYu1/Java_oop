package ezen.ams;


public class ArrayAccountRepository implements AccountRepository {

	private Account[] accounts;
	private int count;
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public ArrayAccountRepository() {
		this(10);
	}
	
	public ArrayAccountRepository(int capacity) {// 입력받은 숫자 크기의 배열 생성
		accounts = new Account[capacity];// 메인 배열 어카운트에, 입력받은 배열 어카운트를 추가.
	}
	
	@Override
	public void addAccount(Account account) {// account 입력받기
		accounts[count++] = account;// count(0)에 저장해준뒤, 1씩 증가되며 다음 배열에 저장된다
	}
	
	@Override
	public Account[] getAccounts() {
		return accounts;
	}
	
	@Override
	public boolean findByAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			if (an.equals(number)) {
				System.out.println(accounts[i].getAccountOwner()+"님의 정보 입니다");
				System.out.print(accounts[i].toString());
				return true;
			}
		}
		return false; // 찾지 못할경우 돌려주는 값. 해당 코드 없으면 구현 안됨
	}
	
	@Override
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
