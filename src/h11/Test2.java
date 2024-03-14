package h11;

import java.util.HashMap;
import java.util.Scanner;

//해쉬맵으로 함
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가된 회원은 몇명입니까? ");
		int num = sc.nextInt();

		String[][] newMember = new String[num][2];

		for (int i = 0; i < newMember.length; i++) {
			System.out.print("회원의 이름을 입력해주세요 :");
			String name = sc.next();
			newMember[i][0] = name;
			System.out.print("가입년도를 입력해주세요 :");
			String date = sc.next();
			System.out.print("가입월을 입력해주세요 :");
			date += "-" + sc.next();
			System.out.print("가입일을 입력해주세요 :");
			date += "-" + sc.next();

			newMember[i][1] = date;
			for (int j = 0; j < 2; j++) {
				System.out.println(newMember[i][j]);
			}
		} // 원래는 가입일자 맞는지 확인도 해야하는데 시간이 없어서 건너뛰겠습니다.

		Test1Service ts = new Test1Service();
		
		
		
		// 1. 가입일자 명단 출력
		ts.membershipPrint(newMember);
		// 2. 1개월 내의 명단 출력
		ts.memberMonthPrint(Test1Service.memberMonth);
		// 3. 오늘 등록한 회원들의 명단과 경과된 시간을 함께 출력?
		ts.memberDayPrint(Test1Service.memberDay);
	}
}
