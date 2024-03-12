package h1_0312;

import java.util.Scanner;

/*
 *  문자를 입력받고 몇번지인지 찾고
 *  아님 단어가 여러개 있을 경우 몇번지에 있으며 몇개 있는지
 */
public class Test1 {
	public static void main(String[] args) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력해주세요.==>");
		String str = sc.nextLine();
		String[] words = new String[str.length()];

		for (int i = 0; i < words.length; i++) {
			words[i] = str.substring(i, i + 1);
		}

		System.out.println("입력하신문자 : " + str + "\n");
		
		while(true) {
			System.out.print("찾으실 문자를 입력해 주세요 ==>(나가기:0)");
			String findWord = sc.next();
			
			System.out.print("찾으시는 문자는 " +findWord+"는 ");
			for (int i = 0; i < words.length; i++) {
				if(words[i].equals(findWord)) {
					System.out.print(i + "번지 ");
					cnt++;
				}
			}
			System.out.println("에 위치해 있으며, "+cnt+"개 있습니다");
			cnt = 0;
		}
		
	}
}
