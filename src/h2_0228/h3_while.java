package h2_0228;

import java.util.Scanner;

public class h3_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 자리의 숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		int count = 0;
				
		if(num > 0) {
			while(num > 0) {
				count ++;
				System.out.print(num+" ");
				if(count % 5 == 0) {
					System.out.println();
				}
				num--;
			}
		}else {
			while(num <= 1) {
				count ++;
				System.out.print(num+" ");
				if(count % 5 == 0) {
					System.out.println();
				}
				num++;
			}
		}
		
		sc.close();

	}
}
