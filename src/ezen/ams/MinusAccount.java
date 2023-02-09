package ezen.ams;

/**
 * Account 클래스를 상속받는 마이너스 계좌
 * 
 * @author 유선우
 * @Date 2023. 1. 4.
 *
 */
public class MinusAccount extends Account {
	// 새롭게 추가된 속성
	private long borrowMoney;
	private String borrowDate;

	public MinusAccount() {
	}

	public MinusAccount(String accountNumber, String accountOwner, int password, long restMoney, long borrowMoney,
			String borrowDate) {
		// 기존에 생성되어있던 생성자 super을 통해 호출
		super(accountNumber, accountOwner, password, restMoney);
		this.borrowMoney = borrowMoney;
		this.borrowDate = borrowDate;
	}

	public long getBorrowMoney() {
		return borrowMoney;
	}

	public void setBorrowMoney(long borrowMoney) {
		this.borrowMoney = borrowMoney;
	}

	public String getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}

	// 잔액 (restMoney - borrowMoney)
	public long getRestMoney() {
		return super.getRestMoney() - borrowMoney;
	}

	// 전체 정보 출력
	// 모든 정보 출력기능
	@Override
	public String toString() {
		return super.toString() +"\t" +  borrowMoney + "\t" + borrowDate;
	}

	// Account에서 존재하는 메소드 사용 가능

}
