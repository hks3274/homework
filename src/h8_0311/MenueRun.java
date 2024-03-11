package h8_0311;

import java.util.Scanner;

public class MenueRun {
	public static void main(String[] args) {
		int totSum = 0;
		Scanner sc = new Scanner(System.in);

		LunchMenu[] lunchMenus = {new Child1(), new Child2(), new Child3(), new Child4()};
		String[] names = {"강레드","이블루","박하늘","최그린"};
		
		while(true) {
			System.out.println("어떤 원생의 식대를 보고 싶으신가요? ");
			System.out.print("1.강레드 2.이블루 3.박하늘 4.최그린 0.종료 ==>");
			int choice = sc.nextInt();
			
			if(choice >= names.length+1 || choice < 1) {
				if(choice == 0) break;
				else System.out.println("그 숫자의 데이터가 존재하지 않습니다. 다시 입력해주세요\n");
				continue;
			}
			
			for (int i = 0; i < names.length; i++) {
				if(choice-1 == i) {
					lunchMenus[i].totSumReset();
					lunchMenus[i].childName(names[i]);
					lunchMenus[i].basicMenu();
					lunchMenus[i].choiceDuBu();
					lunchMenus[i].choiceYolait();
					lunchMenus[i].choiceBanana();
					lunchMenus[i].choiceMilk();
					lunchMenus[i].choiceAlmond();
					System.out.println("을(를) 포함하고 있습니다.");
					System.out.println("따라서 "+names[i]+ "원생의 식대는 "+lunchMenus[i].totSum()+"원 입니다");
					System.out.println("---------------------------------------\n");
				}
			}	
		}
		sc.close();
	}
}
