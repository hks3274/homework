package h1_0227;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 개의 숫자를 입력하세요:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max = 0;
		int min = 0;

		if (num1 == num2) {
			System.out.println("값이 동일합니다.");
		} else {
			if (num1 > num2) {
				max = num1; 
				min = num2;
			}
			if (num2 > num1) {
				max = num2; 
				min = num1;
			}
			System.out.println("큰 수: " + max + ", 작은 수: " + min);
		}
		
		sc.close();
	}
}
