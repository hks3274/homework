package h6_0307;

import java.util.Scanner;

public class BankApplication {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	static int cnt;
	static boolean check;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("==========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("==========================================");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccout();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("숫자를 잘못 입력했습니다.");
			}

			System.out.println();
		}

		System.out.println("프로그램 종료");

	}

	// 계좌생성하기
	private static void createAccout() {

		System.out.println("--------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();

		if (cnt >= 1)
			check = isCheck(ano);

		if (check) {
			System.out.println("같은 계좌번호가 존재합니다.");
		} else {
			BankAccount ba = new BankAccount(ano, owner, balance);
			accountArray[cnt] = ba;
			System.out.println("결과: 계좌가 생성되었습니다");
			cnt++;
		}

	}

	private static boolean isCheck(String ano) {
		for (int i = 0; i < cnt; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				return true;
			}
		}
		return false;
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for (int i = 0; i < cnt; i++) {
			System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t"
					+ String.format("%,d", accountArray[i].getBalance()));
		}
	}

	// 예금하기
	private static void deposit() {
		int sum = 0;
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("입금액: ");
		int balance = scanner.nextInt();
		
		for (int i = 0; i < cnt; i++) {

			if (ano.equals(accountArray[i].getAno())) {
				if (balance < 0) {
					System.out.println("입급액이 마이너스 입니다. 다시입력해주세요");
					i = cnt;
				} else {
					sum= accountArray[i].getBalance();
					sum += balance;
					accountArray[i].setBalance(sum);
					System.out.println("결과: 예금이 성공되었습니다.");
					break;
				}
			} else if (i == (cnt - 1))
				System.out.println("맞는 계좌가 없습니다");
		}
		sum = 0;

	}

	// 출금하기
	private static void withdraw() {
		int sub = 0;
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();

		for (int i = 0; i < cnt; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				if (balance > accountArray[i].getBalance()) {
					System.out.println("출금액이 입금액보다 많습니다. 다시 입력해주세요");
					i = cnt;
				} else {
					sub = accountArray[i].getBalance();
					sub -= balance;
					accountArray[i].setBalance(sub);
					System.out.println("결과: 출금이 성공되었습니다.");
					break;
				}
			} else if (i == (cnt - 1))
				System.out.println("맞는 계좌가 없습니다");
		}
		sub = 0;
	}

}
