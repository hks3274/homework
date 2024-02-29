package h2_0228;

public class h1_while {
	public static void main(String[] args) {
		
		int i = 0, two = 0, three = 0, five = 0, twSum = 0, thSum = 0, fiSum = 0; 
		
		while(i < 100) {
			i++;
			if(i % 2 ==0) {
				two++;
				twSum += i;
			} else if(i % 3 ==0) {
				three++;
				thSum += i;
			} else if(i % 5 ==0) {
				five++;
				fiSum += i;
			}
				
			
		}
		
		System.out.println("2의 배수의 갯수: "+two+", 3의 배수의 갯수: "+three+", 5의 배수의 갯수: "+five);
		System.out.println("2의 배수의 합 + 3의 배수의 합 - 5의 배수 = "+(twSum + thSum -fiSum));
		
	}
}
