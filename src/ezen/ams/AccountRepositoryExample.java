package ezen.ams;

import java.util.Scanner;


public class AccountRepositoryExample {

	public static void main(String[] args) {

		AccountRepository repository = new ArrayAccountRepository(100);
		
		//신규계좌 등록
		Account[] findAccount = repository.getAccounts();
		
		repository.addAccount(new Account("111-222", "유선우", 2334, 1000000));
		repository.addAccount(new Account("111-222", "유선우1", 2334, 1000000));
		repository.addAccount(new Account("111-222", "유선우2", 2334, 1000000));
		repository.addAccount(new Account("111-222", "유선우3", 2334, 1000000));
		repository.addAccount(new Account("111-222", "유선우4", 2334, 1000000));
		repository.addAccount(new Account("111-222", "유선우5", 2334, 1000000));
		repository.addAccount(new MinusAccount("111-333", "유선우10", 2000, 1000000, 200000000, "2020년3월2일"));
		ArrayAccountRepository Getcount = (ArrayAccountRepository)repository;
		System.out.println(Getcount.getCount());
		
		//예외처리 안해서 사용 안됨
		
		
		try {
			findAccount[1].withdraw(100000000);
			findAccount[1].withdraw(-1);
		} catch (NotSufficientBalanceException e) {
		System.err.println(e);
			//사용자에게 오류 메세지 출력
		}
		
		
		
		Account account = new Account("111-232", "유선우", 2334, 1000000);
		
		repository.addAccount(account);

		System.out.println(account.toString());
		
		
		Account[] list = repository.getAccounts();// 계좌정보 불러오기역활
		// Account의 메소드 사용하기 위해 사용
		// repositoty와 Account메소드 기능이 각각 다르다

		
		System.out.println("list 저장 가능한 크기 : " + list.length);
		
		
		// 전체 계좌 목록 조회
		System.out.println("현재 저장중인 계좌 정보 : " + Getcount.getCount());
		for (int i = 0; i < Getcount.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 계좌를 입력하세요 : ");
		String serch = scanner.nextLine();
		for (int j = 0; j < Getcount.getCount(); j++) {
			if(serch.equals(list[j].getAccountNumber())) {
				System.out.println(list[j].toString());
			}
		}

		
	}
}
