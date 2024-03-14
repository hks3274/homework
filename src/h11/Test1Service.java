package h11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test1Service {
	static String[][] memberMonth;
	static String[][] memberDay;
	
	void memberDayPrint(String[][] memberDay) {
		System.out.println("\n=====================================================");
		System.out.println("오늘 등록한 회원명 (경과된 시간 함께 출력)\t");
		System.out.println("=====================================================");

		for (int i = 0; i < memberDay.length; i++) {
			if (memberDay[i][0] != null) {
				for (int j = 0; j < memberDay[i].length; j++) {
					if (j == 1) System.out.println(memberDay[i][j] + "시간 지났습니다");
					else System.out.print(memberDay[i][j] + "\t");
				}
			}
		}

		System.out.println("======================================================");
	}

	
	
	void memberMonthPrint(String[][] memberMonth) {

		System.out.println("\n=====================================================");
		System.out.println("최근 등록한 회원명(경과된 일수 함께 출력)\t");
		System.out.println("=====================================================");

		for (int i = 0; i < memberMonth.length; i++) {
			if (memberMonth[i][0] != null) {
				for (int j = 0; j < memberMonth[i].length; j++) {
					if (j == 1) System.out.println(memberMonth[i][j] + "일이 지났습니다(최근등록: 1달이내)");
					else System.out.print(memberMonth[i][j] + "\t");
				}
			}
		}

		System.out.println("======================================================");
	}

	void membershipPrint(String[][] membershipDate) {
		memberMonth = new String[membershipDate.length][membershipDate[0].length];
		memberDay = new String[membershipDate.length][membershipDate[0].length];
		Period period;
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();

		System.out.println("\n현재 날짜 : " + currentDate);

		System.out.println("\n=====================================================");
		System.out.println("회원명\t회원가입일자");
		System.out.println("=====================================================");
		for (int i = 0; i < membershipDate.length; i++) {
			for (int j = 0; j < membershipDate[i].length; j++) {
				System.out.print(membershipDate[i][j] + "\t");
				if (j == 1) {
					LocalDate regDate = LocalDate.parse(membershipDate[i][1], DateTimeFormatter.ofPattern("yyyy-M-d"));
					period = Period.between(regDate, currentDate);
					System.out.print(membershipDate[i][0] + "님은 가입한 날짜로부터 " + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일 지났습니다");
					if (period.getYears() == 0 && period.getMonths() == 0 ) {
						memberMonth[i][0] = membershipDate[i][0];
						memberMonth[i][1] = Integer.toString(period.getDays());
					}
					if(period.getYears() == 0 && period.getMonths() == 0 && period.getDays() == 0) {
						memberDay[i][0] = membershipDate[i][0];
						memberDay[i][1] = currentTime.toString().substring(0,8);
					}
				}
			}
			System.out.println();
		}
		System.out.println("======================================================");
	}
}
