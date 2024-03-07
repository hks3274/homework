package h6_0307;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: "+ String.format("%,d", account.getBalance())+"원");
		
		account.setBalance(-100);
		System.out.println("현재잔고: "+String.format("%,d", account.getBalance())+"원");
		
		account.setBalance(2000000);
		System.out.println("현재잔고: "+ String.format("%,d", account.getBalance())+"원");
		
		account.setBalance(300000);
		System.out.println("현재잔고: "+String.format("%,d", account.getBalance())+"원");
	}
}
