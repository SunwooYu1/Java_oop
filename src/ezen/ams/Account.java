package ezen.ams;

public class Account { // 어디서든 접근 가능한 공개된 클래스
	public static final String BANK_NAME = "신한은행";
	private String accountNumber;
	private String accountOwner;
	private int password;
	private long restMoney;

	public Account() {
		this(null, null);// 코드 불러와서, 값을 입력해 초기화한다
	}

	public Account(String accountNumber, String accountOwner) {
		this(accountNumber, accountOwner, 0, 0);
	}

	public Account(String accountNumber, String accountOwner, int password, long restMoney) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.password = password;
		this.restMoney = restMoney;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public long getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(long restMoney) {
		this.restMoney = restMoney;
	}

	public long deposit(long restMoney) {
		this.restMoney += restMoney; // 최종잔액에서, 입력되는 값만큼 더해준다
		return this.restMoney; // 더해진 값을 반환한다
	}

	// 출금기능
	public long withdraw(long money) throws NotSufficientBalanceException {
		if(money <= 0) {
			throw new NotSufficientBalanceException("출금 금액은 음수일수 없습니다",202);
		}
		if (money > restMoney) {
			throw new NotSufficientBalanceException("잔액이 부족합니다",100);
		}else {
			this.restMoney -= money;
			return this.restMoney;
		}
	}

	public boolean checkPassword(int password) {
		return this.password == password; // 기존 패스워드와, 입력된 값을 비교하여 true, false 값을 돌려준다
	}

	public String toString() {
		return accountNumber + "\t" + accountOwner + "\t" + "****" + "\t" + restMoney;
	}

	public boolean equals(Object obj) {
		Account account = null;
		if (!(obj instanceof Account)) {
			return false;
		}

		if (obj instanceof Account) {
			account = (Account) obj;
		}

		if (account.toString().equals(toString())) {
			return true;
		}
		return false;
	}

}