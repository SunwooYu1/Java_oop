package ezen.ams;


/**
 * 은행 계좌 관리(등록, 수정, 삭제, 검색)를 위한 명세
 * @author 유선우
 * @Date 2023. 1. 9.
 */
public interface AccountRepository {
	/** 계좌 등록 */
	public void addAccount(Account account);
	/** 전체 계좌 조회 */
	public Account[] getAccounts();
	/** 계좌번호로 검색 */
	public boolean findByAccount(String number);
	/** 계좌번호로 삭제 */
	public boolean removeaccount(String number);
}
