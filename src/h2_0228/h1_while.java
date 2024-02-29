package h2_0228;

public class h1_while {
	public static void main(String[] args) {
		
		int i = 0, cnt2 = 0, cnt3 = 0, cnt5 = 0, tot2 = 0, tot3 = 0, tot5 = 0; 
		
		while(i < 100) {
			i++;
			if(i % 2 ==0) {
				cnt2++;
				tot2 += i;
			} else if(i % 3 ==0) {
				cnt3++;
				tot3 += i;
			} else if(i % 5 ==0) {
				cnt5++;
				tot5 += i;
			}
				
			
		}
		
		System.out.println("2의 배수의 갯수: "+cnt2+", 3의 배수의 갯수: "+cnt3+", 5의 배수의 갯수: "+cnt5);
		System.out.println("2의 배수의 합 + 3의 배수의 합 - 5의 배수 = "+(tot2 + tot3 - tot5));
		
	}
}
