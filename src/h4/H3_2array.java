package h4;

import java.util.Scanner;

/*
 * 한글과 짝을 이루는 2개의 배열을 만들고, 
 * 사용자로부터 영어 단어를 입력받으면 한글로 출력하는 프로그램?
 * >  {{“love”, “사랑”},{“java”, “자바”};
 */

public class H3_2array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = 0;
		String word;
		
		String[][] enKo = {{"love", "사랑"}, 
												{"java","자바"}};
		
		while(true) {
			System.out.print("영어 단어를 입력하세요.(종료라고 치면 나와짐)");
			word  = sc.next();
			
			if(word.equals("종료")) break;
 			
			for (int i = 0; i < enKo.length; i++) {
				if(enKo[i][0].equals(word)) { 
					System.out.println(enKo[i][1]);
					su = 1;
				}
			}
			
			if (su == 0) {
				System.out.println("다시 입력해주세요");
				su = 0;
			}
		}
		sc.close();
	}
}
