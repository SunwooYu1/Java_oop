package ezen.array;

import java.util.Scanner;

import opp.Account;
import opp.MinusAccount;

public class AccountRepositoryExample {

	public static void main(String[] args) {

		// 마이너스 신규계좌 등록
		MinusAccount ma = new MinusAccount("123-345", "유선우", 1234, 1000000, 10000000, "2022년2월5일");

		// 계좌 크기 설정, 신규 계좌 등록
		AccountRepository repository = new AccountRepository(100);
//		Account account = new Account("111-222", "유선우1", 2010, 100000);
//		repository.addAccount(account); 아래는 축약형
		repository.addAccount(new Account("111-222", "유선우1", 2010, 100000));
		repository.addAccount(new Account("222-333", "홍길동2", 2011, 120000));
		repository.addAccount(new Account("433-444", "김길동3", 2012, 130000));
		repository.addAccount(new Account("533-444", "김길동4", 2013, 130000));
		// 어카운트타입에 마이너스 어카운트 저장.(업캐스팅 자동 형번환)
		repository.addAccount(ma);
		repository.addAccount(new MinusAccount("122-355", "유선영", 1234, 1000000, 10000000, "2022년2월5일"));

		Account[] list = repository.getAccounts();// 계좌정보 불러오기역활
		// Account의 메소드 사용하기 위해 사용
		// repositoty와 Account메소드 기능이 각각 다르다

		System.out.println("list 저장 가능한 크기 : " + list.length);
		// 전체 계좌 목록 조회
		System.out.println("현재 저장중인 계좌 정보 : " + repository.getCount());
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}

		String number = null;
		int password = 0;
		// 계좌 검색기능
		System.out.println("------------계좌 정보 조회--------------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("계좌번호를 입력하세요 : ");
		number = scanner.nextLine();
		Account fintAccount = repository.findByAccount(number);
		if (fintAccount != null) {
			System.out.println(fintAccount.toString());
		} else {
			System.err.println("일치하는 계좌가 없습니다");
		}
		System.out.println("----------계좌 정보 조회 종료------------");

////		 계좌 삭제기능
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.print("삭제하실 예금주 성함을 입력하세요 : ");
//		number = scanner1.nextLine();
//		System.out.print("비밀번호를 입력하세요 : ");
//		password = scanner1.nextInt();
//		repository.deleteAccount(number, password);// 이름 보냄

		System.out.print("삭제하실 계좌 정보를 입력하세요 : ");
		number = scanner.nextLine();
		boolean result = repository.removeaccount(number);

		if (result == true) {
			System.out.println("계좌가 삭제되었습니다.");
		} else {
			System.out.println("계좌를 찾을수 없습니다");
		}

		System.out.print("계좌번호를 다시 입력하세요 : ");
		number = scanner.nextLine();
		fintAccount = repository.findByAccount(number);
		if (fintAccount != null) {
			System.out.println(fintAccount.toString());
		} else {
			System.err.println("일치하는 계좌가 없습니다");
		}

		System.out.println();
		System.out.println("--------저장된 정보 확인---------");
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}


		System.out.println("현재 저장중인 계좌 정보 : " + repository.getCount());

	}

}
