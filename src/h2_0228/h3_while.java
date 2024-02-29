package h2_0228;

import java.util.Scanner;

public class h3_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 자리의 숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		int i = num;
		int count = 0;
				
		if(num > 0) {
			while(i > 0) {
				count ++;
				System.out.print(i+" ");
				if(count == 5) {
					System.out.println();
					count = 0;
				}
				i--;
			}
		}else {
			while(i <= 1) {
				count ++;
				System.out.print(i+" ");
				if(count == 5) {
					System.out.println();
					count = 0;
				}
				i++;
			}
		}
		
		
		
	}
}
