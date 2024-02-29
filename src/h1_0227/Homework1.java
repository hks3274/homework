package h1_0227;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		String res = "";

		if (num % 2 == 0) {
			res = "짝수";
		} else {
			res = "홀수";
		}

		System.out.println("숫자 " + num + "은(는) " + res + "입니다!");

		sc.close();
	}
}
