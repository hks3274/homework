package h7_0308;

import java.util.Scanner;

public class BunsikService {

	public void menupan(Bonsa bunsik) {
		System.out.println("=============================");
		System.out.println("|\t" + bunsik.getStoreName() + "메뉴판");
		System.out.println("=============================");
		System.out.println("|\t메뉴명\t가격");
		System.out.println("-----------------------------");
		System.out.println(">\t김치찌개\t" + bunsik.getGimchijjigae());
		System.out.println(">\t부대찌개\t" + bunsik.getBudaejjigae());
		System.out.println(">\t비빔밥\t" + bunsik.getBibimbap());
		System.out.println(">\t순대국\t" + bunsik.getSundaeguk());
		System.out.println(">\t공기밥\t" + bunsik.getRice());
	}

	public void order(Bonsa bunsik, int choice) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int allPrice = 0;

		while (true) {
			System.out.println("1.김치찌개 2.부대찌개 3.비빔밥 4.순대국 5.공기밥");
			System.out.print("드시고 싶은 것을 숫자로 주문해 주세요(2개 이상 공백으로 구분)");
			String order = sc.nextLine();
			System.out.println();
			String[] orderEnd = order.split(" ");

			for (int i = 0; i < orderEnd.length; i++) {
				if (orderEnd[i].equals("1")) {
					allPrice += Integer.parseInt(bunsik.getGimchijjigae());
					System.out.println("김치찌개 :" + bunsik.getGimchijjigae() + "원");
				} else if (orderEnd[i].equals("2")) {
					allPrice += Integer.parseInt(bunsik.getBudaejjigae());
					System.out.println("부대찌개 :" + bunsik.getBudaejjigae() + "원");
				} else if (orderEnd[i].equals("3")) {
					allPrice += Integer.parseInt(bunsik.getBibimbap());
					System.out.println("비빔밥 :" + bunsik.getBibimbap() + "원");
				} else if (orderEnd[i].equals("4")) {
					if (choice == 1)
						System.out.println("순대국은 판매하지 않습니다.");
					else {
						allPrice += Integer.parseInt(bunsik.getSundaeguk());
						System.out.println("순대국 :" + bunsik.getSundaeguk());
					}
				} else if (orderEnd[i].equals("5")) {
					if (choice == 2)
						System.out.println("공기밥은 무료입니다");
					else {
						allPrice += Integer.parseInt(bunsik.getRice());
						System.out.println("공기밥: " + bunsik.getRice());
					}
				} else {
					System.out.println("숫자를 잘못입력하셨습니다");
				}
			}
			System.out.println();
			System.out.print("다시 주문하시겠습니까?(더 주문하기:1 주문끝내기:0) ");
			int check = sc1.nextInt();
			if (check == 0) break;
			System.out.println();
		}
		System.out.println();
		System.out.println("다 드셨나요? 총 가격은 " + allPrice + "원 입니다");
		System.out.println("안녕히가세요!");
	}

}
