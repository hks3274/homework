package h7_0308;

import java.awt.Label;
import java.util.Scanner;

public class BunsikRun {

	public static void main(String[] args) {
		BunsikService bunsik = new BunsikService();
		Bonsa seoulbunsik = new SeoulBunsik();
		Bonsa wangjabunsik = new WangjaBunsik();
		Bonsa woojubunsik = new WoojuBunsik();

		Scanner sc = new Scanner(System.in);

		a: while (true) {
			System.out.print("가게를 입력해주세요(1: 서울분식점, 2: 왕자분식점, 3: 우주분식점 나가기: 0)");
			int choice = sc.nextInt();
			int check = 0;
			switch (choice) {
				case 0:
					check = 1;
					break;
				case 1:
					wangjabunsik.menupan();
					bunsik.menupan(wangjabunsik);
					break;
				case 2:
					seoulbunsik.menupan();
					bunsik.menupan(seoulbunsik);
					break;
				case 3:
					woojubunsik.menupan();
					bunsik.menupan(woojubunsik);
					break;
				default:
					System.out.println("숫자를 잘 입력해주세요");
					continue a;
			}
			
			System.out.println();
			if (check == 1)
				break; 
			System.out.print("이 음식점에서 음식을드시겠습니까?(0: 나가기, 1: 다른가게메뉴판보기 2: 주문하기) ");
			int ok = sc.nextInt();
			System.out.println();
			if (ok == 0) break;
			else if (ok == 1) continue a;
			else if (ok == 2) {

				if (choice == 1) {
					bunsik.order(wangjabunsik, choice);
				} else if (choice == 2) {
					bunsik.order(seoulbunsik, choice);
				} else if (choice == 3) {
					bunsik.order(woojubunsik, choice);
				}
			} else {
				System.out.println("숫자를 잘못치셨습니다. 다시 입력해주세요\n");
				continue a;
			}
			System.out.println();
		}
		sc.close();
	}
}
