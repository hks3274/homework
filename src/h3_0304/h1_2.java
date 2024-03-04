package h3_0304;

//1~100까지의 수를 차례로 출력하되 3,6,9 자리는 숫자가 아닌, "짝"이라는 문자로 대치하시오
public class h1_2 {
	public static void main(String[] args) {
		String num[] = new String[100];
		boolean check = false;

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.toString(i + 1);

			for (int j = 0; j < num[i].length(); j++) {
				if (num[i].charAt(j) == '3' || num[i].charAt(j) == '6' || num[i].charAt(j) == '9')
					check = true;
			}

			if (check == true) {
				System.out.print("짝 ");
				check = false;
			} else {
				System.out.print(num[i] + " ");
			}

			if (i % 5 == 0 && i != 0)
				System.out.println("\n");
		}

	}
}
