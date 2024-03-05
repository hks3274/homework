package h4;

//1~45숫자 중 6개의 수를 추출 후 정렬해서 출력해보자(중복배제) ==> 숙제
public class H1_lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		boolean check = false;
		// 6개의 숫자를 임의로 뽑아서 배열에 저장
		
		
		//그 다음 비교
		for (int i = 0; i < lotto.length; i++) {
			int su = (int) (Math.random() * 45) + 1;
			lotto[i] = su;
			
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) i--;
			}
		}
		
		// 6개의 로또 번호를 정렬해서 출력;
		int temp = 0;
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		System.out.print("이번주 행운의 번호는? ");

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}
