package h1_0227;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 :");
		int num = sc.nextInt();
		String res = "";

		System.out.print("숫자 " + num + "은(는) ");

		if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
			System.out.println("2, 3, 5의 배수에 해당되는 것이 없습니다.");
		} else {
			if (num % 2 == 0) {
				res += "2 ";
			}
			if (num % 3 == 0) {
				res += "3 ";
			}
			if (num % 5 == 0) {
				res += "5 ";
			}
			System.out.println(res + "의 배수입니다!");
		}

		sc.close();
	}
}
