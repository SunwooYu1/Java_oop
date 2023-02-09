package ezen.ams;

import java.util.Scanner;

public class AccountApplication {
	private static AccountRepository repository = new ArrayAccountRepository(100);
	private static ArrayAccountRepository forGetCount = (ArrayAccountRepository) repository;
	private static Scanner scanner = new Scanner(System.in);

	public static boolean check() {
		return true;
	}

	public static void main(String[] args) throws NotSufficientBalanceException {
		System.out.println("::::: " + Account.BANK_NAME + " 계좌 관리 애플리케이션 :::::");
		// while문 사용
		boolean run = true;
		// 실행 실패시 출력
		boolean run2 = false;
		/////////
		Account account = new Account();
		String num = null;
		String owner = null;
		int password = 0;
		int browMoney = 0;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금,출금|4.계좌조회,삭제|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("실행 번호를 입력하세요 : ");
			int selectNo = '0';
			try {
				selectNo = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.err.println("띄어쓰기 없이, 번호만 입력해주세요");
			}
			if (selectNo == 1) {
				System.out.println("----------------------------------------------");
				System.out.println("1.일반계좌 | 2. 마이너스계좌");
				System.out.println("----------------------------------------------");
				System.out.print("실행 번호를 입력하세요 : ");
				selectNo = Integer.parseInt(scanner.nextLine());
				if (selectNo == 1) {
					System.out.println("일반 계좌 생성");
					System.out.print("계좌번호를 입력하세요 : ");
					num = scanner.nextLine();

					System.out.println();

					System.out.print("성함을 입력하세요 : ");
					owner = scanner.nextLine();
					System.out.println();

					System.out.print("비밀번호를 입력하세요 : ");
					try {
						password = Integer.parseInt(scanner.nextLine());
						System.out.println();
						account = new Account(num, owner, password, 0);
						repository.addAccount(account);
						System.out.println(account.toString());
					} catch (Exception e) {
						System.err.println("번호만 입력 가능합니다");
						System.err.println("계좌가 생성되지 않았습니다");
					}
				} else if (selectNo == 2) {
					System.out.println("마이너스 계좌 생성");
					System.out.print("계좌번호를 입력하세요 : ");
					num = scanner.nextLine();
					System.out.println();

					System.out.print("성함을 입력하세요 : ");
					owner = scanner.nextLine();
					System.out.println();

					System.out.print("비밀번호를 입력하세요 : ");
					password = Integer.parseInt(scanner.nextLine());
					System.out.println();

					System.out.print("대출금을 입력하세요 : ");
					browMoney = Integer.parseInt(scanner.nextLine());
					System.out.println();

					System.out.print("대출 일자를 입력하세요 : ");
					String date = scanner.nextLine();
					MinusAccount accout = new MinusAccount(num, owner, password, 0, browMoney, date);
					repository.addAccount(accout);
					System.out.println(accout.toString());
				}
				// 계좌 생성
//				createAccount();
				System.out.println("생성된 계좌 수 : " + forGetCount.getCount());
			} else if (selectNo == 2) {
				Account[] list = repository.getAccounts();
				for (int i = 0; i < forGetCount.getCount(); i++) {
					System.out.println(list[i].toString());
				}
			} else if (selectNo == 3) {
				System.out.println();
				System.out.println("----------------------------------------------");
				System.out.println("1.입금 | 2. 출금");
				System.out.println("----------------------------------------------");
				System.out.println("실행 번호를 입력하세요 : ");
				selectNo = Integer.parseInt(scanner.nextLine());
				if (selectNo == 1) {
					Account[] list = repository.getAccounts();
					System.out.print("계좌번호를 입력하세요 : ");
					num = scanner.nextLine();
					for (int i = 0; i < forGetCount.getCount(); i++) {
						if (num.equals(list[i].getAccountNumber())) {
							System.out.print("금액을 입력하세요 : ");
							int money = Integer.parseInt(scanner.nextLine());
							list[i].deposit(money);
						}
					}
				}

				else if (selectNo == 2) {
					Account[] list = repository.getAccounts();
					System.out.print("계좌번호를 입력하세요 : ");
					num = scanner.nextLine();
					for (int i = 0; i < forGetCount.getCount(); i++) {
						if (num.equals(list[i].getAccountNumber())) {
							System.out.print("금액을 입력하세요 : ");
							int money = Integer.parseInt(scanner.nextLine());
							list[i].withdraw(money);
						}
					}
				}
			} else if (selectNo == 4) {
				System.out.println("----------------------------------------------");
				System.out.println("1.조회 | 2. 삭제");
				System.out.println("----------------------------------------------");
				System.out.println("실행 번호를 입력하세요 : ");
				selectNo = Integer.parseInt(scanner.nextLine());
				if (selectNo == 1) {
					System.out.println("조회할 계좌번호를 입력하세요 : ");
					num = scanner.nextLine();
					run2 = forGetCount.findByAccount(num);
					if (run2 == false) {
						System.err.println("일치하는 계좌가 존재하지 않습니다");
					}
				} else if (selectNo == 2) {
					System.out.println("삭제할 계좌번호를 입력하세요 : ");
					num = scanner.nextLine();
					run2 = forGetCount.removeaccount(num);
					if (run2 == false) {
						System.err.println("일치하는 계좌가 존재하지 않습니다");
					}
				}
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
