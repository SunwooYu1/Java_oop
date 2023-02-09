package ezen.ams;

public class NotSufficientBalanceException extends Exception{
	private int errorCode;
	

	//상속
	public NotSufficientBalanceException () {
		this("오류입니다", 0);
	}
	
	public NotSufficientBalanceException (String message, int errorCode) {
		//부모쪽에 있는 생성자에 전달
		super(message);
		this.errorCode = errorCode;
	}
	public int getErrorCode() {
		return errorCode;
	}
	
	@Override
	public String toString() {
		return "오류코드 : " + errorCode + ", 오류 메시지 : " + getMessage();
	}
}
