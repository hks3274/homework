package h10_0313;


import java.util.Scanner;

/*
 * 콘솔을 통해서 아이디를 입력받는다. 
 * 단, 아이디는 영문대문자, 영문소문자, 숫자와 특수문자는 '_'을 사용할 수 있고,
 * 길이는 4~20자 이내로 입력받을 수 있도록 처리한다.
 * 예) 아이디를 입력하세요 : abc
 * ==> 입력된 아이디 abc는 사용할 수 없습니다.
 * 	계속할까요?(Y/N) Y
 * ------------------------------------
 * 아이디를 입력하세요 :abc!
 * ==> 입력된 아이디 abc!는 사용할 수 없습니다.
 * 	계속할까요?(Y/N) Y
 * ------------------------------------
 * 아이디를 입력하세요 :  sadasdgsajdjasdgsajdsakjas
 * ==> 입력된 아이디 sadasdgsajdjasdgsajdsakjas
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~(20초간 기다림...)
 * 
 * ------------------------------------
 * 아이디를 입력하세요 : atom1234!
 * ==> 입력된 아이디 atom1234!는 사용할 수 없습니다.
 * 	계속할까요?(Y/N) Y
 * ------------------------------------
 * 아이디를 입력하세요 : atom1234
 * ==> 입력된 아이디 atom1234는 사용할 수 있습니다.
 * 	atom1234 로그인 되었습니다
 * ------------------------------------
 *  
 */
public class H2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int cnt = 0;

		while (true) {
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();
			String[] idChar = id.split("");

			if (idChar.length > 3 && idChar.length < 21) {
				for (int i = 0; i < idChar.length; i++) { // 아스키코드 48~57 = 숫자, 65~90= 대문자, 67~122=영어 소문자, 95=_(밑줄)
					int checkChar = idChar[i].charAt(0);
					if ((checkChar >= 48 && checkChar<= 57)
							|| (checkChar >= 65 && checkChar <= 90)
							|| (checkChar >= 97 && checkChar <= 122)|| checkChar == 95) {
						check = true;
					} else {
						check = false;
						break;
					}
				}
			} 
			
			if (check) {
				System.out.println("입력된 아이디 " + id + "는 사용할 수 있습니다.");
				System.out.println(id + "은 로그인 되었습니다");
				break;
			} else {
				System.out.println("입력된 아이디 " + id + "는 사용할 수 없습니다. 다시입력해주세요");
				cnt++;
			}

			if (cnt == 3) {
				System.out.println("지금부터 20초 사용이 제한됩니다.");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				for (int j = 0; j < 40; j++) {
					System.out.print("~");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
				System.out.println("(20초 기다림)");
				cnt = 0;
			}

			System.out.print("계속하시겠습니까?(Y/N)");
			String ans = sc.next().toUpperCase();
			if (ans.equals("N")) break;
			System.out.println("----------------------------------------------------------");
		}

		sc.close();
	}

}
