package h3_0304;

//1~100까지의 수를 차례로 출력하되 3,6,9 자리는 숫자가 아닌, "짝"이라는 문자로 대치하시오
public class h1 {
	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++) {		
			
			if(i % 10 == 3 || i % 10 == 6  ||i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) { //일의 자리 숫자와 10의 자리 숫자를 구해서 넣는식으로 한 것
				System.out.print("짝 ");
			} else System.out.print(i+" ");
			
			if(i % 5 == 0)System.out.println("\n");
		}
		
	}
}
