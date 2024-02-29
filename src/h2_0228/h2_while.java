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

		//교환
		if(num2>num1){
			T = num1; num1 = num2; num2 = T;
		}

		
		System.out.println("큰 수:"+num1+", 작은 수: "+num2);
		
		i = num2;
				
		while(i <= num1) {
			count++;
			sum += i;
			if(count == 5) {
				System.out.println(i-(count - 1)+"~"+(i)+"의 합:"+ sum);
				count =0;
				sum = 0;
			}
			i++;
		}
		
		if(count != 0) {
			System.out.println(num1-(count-1)+"~"+num1+"의 합:"+ sum);
		}	
		
	}
}
