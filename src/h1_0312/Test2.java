package h1_0312;

import java.util.Iterator;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int cnt = 0, i = 0;
		boolean check = false;
		int[] result = new int[100];
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력해 주세요 :");
		String msg = sc.nextLine();

		System.out.println("입력하신 문자열 :" + msg + "\n");

		while (true) {
			System.out.print("찾을 단어를 입력해 주세요 :(나가기 : 0)");
			String findWord = sc.next();

			if (findWord.equals("0"))
				break;

			if (msg.indexOf(findWord) > -1 && findWord.length() == 1)
				System.out.println("찾으시는 단어 '" + findWord + "' 은(는) ");
			else if (msg.indexOf(findWord) > -1 && findWord.length() > 1) {
				System.out.println("찾으시는 문자열 \"" + findWord + "\" 은(는) ");
				check = true;
			} else {
				System.out.println("문자를 잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}
			String msg1 = msg;

			while (true) {

				i = msg1.lastIndexOf(findWord);
				if (i == -1)
					break;
				msg1 = msg1.substring(0, i);
				if (check) {
					System.out.print(i+"번지부터");
					System.out.print((i+findWord.length())+"번지 ");
				} else System.out.print(i+"번지 ");
				cnt++;
			}
			
			System.out.println("에 위치해 있습니다.");
			System.out.println("총 단어의 갯수는 " + cnt + "개 입니다");
			System.out.println();
			cnt = 0;
			check = false;
		}

		sc.close();
	}
}
