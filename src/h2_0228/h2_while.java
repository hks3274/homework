package h2_0228;

import java.util.Scanner;

public class h2_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 개의 숫자를 입력하세요: ");

		int i = 0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int T = 0, sum = 0, totSum = 0, count = 0;
		
		System.out.println("첫번째 수:" + num1 + ", 두 번째 수: " + num2);
		
		// 교환
		if (num2 > num1) {
			T = num1;
			num1 = num2;
			num2 = T;
		}
		
		i = T = num2;
		
				
		while (num2 <= num1) {
			count++;
			sum += num2;
			totSum += num2;
			if (count % 5 == 0) {
				System.out.println(T + "~" + num2 + "의 합:" + sum);
				sum = 0;
			}
			num2++;
		}

		if (count % 5 != 0) {
			System.out.println(T + "~" + (--num2) + "의 합:" + sum);
			totSum += num2;
		}

		System.out.println( "총합("+i+"~"+num2+"):"+totSum);
		
		
		sc.close();

	}
}
