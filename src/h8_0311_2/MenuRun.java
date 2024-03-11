package h8_0311_2;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LunchMenu lunchMenu = new LunchMenu() {

			public int choiceLunch(int i) {
				if (i == 1)
					return RICE;
				if (i == 2)
					return BULGOGI;
				if (i == 3)
					return DUBU;
				if (i == 4)
					return MIYEOG;
				else
					return 0;
			}

			public int choiceSnack(int i) {
				if (i == 1)
					return BANANA;
				if (i == 2)
					return YOPLAIT;
				if (i == 3)
					return MILK;
				if (i == 4)
					return ALMOND;
				else
					return 0;
			}
		};

		System.out.print("어린이집의 아이들은 몇 명인가요? => ");
		int num = sc.nextInt();
		String[] names = new String[num];
		int[] totSum = new int[num];

		System.out.println("아이들의 이름을 알려주세요 ");
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + ". 원생의 이름을 입력해 주세요 ==>");
			names[i] = sc.next();
		}

		int totSum2 = 0;

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "의 점심메뉴를 골라주세요 ");
			System.out.print("점심메뉴 1.밥 2.불고기 3.두부조림 4.미역국 ==>");
			int choice = sc.nextInt();
			totSum2 += lunchMenu.choiceLunch(choice);
			System.out.print("더 추가할건가요? (Y/N)");
			String ans = sc.next().toUpperCase();
			totSum[i] = totSum2;
			if (ans.equals("Y")) i--;
			totSum2 = 0;
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "아이의 간식메뉴를 골라주세요 :");
			System.out.print("간식메뉴 1.바나나 2.요플레 3.우유 4.아몬드 ==>");
			int choice = sc.nextInt();
			totSum2 += lunchMenu.choiceLunch(choice);
			System.out.print("더 추가할건가요? (Y/N)");
			String ans = sc.next().toUpperCase();
			totSum[i] += totSum2;
			if (ans.equals("Y")) i--;
			totSum2 = 0;
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "원생의 식대는 " + totSum[i] + "원 입니다.");
		}
	}
}
