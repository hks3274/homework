package h6_0307;

public class Account {
	private int balance;
	final static private int MIN_BALANCE = 0; 
	final static private int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MAX_BALANCE || balance <= MIN_BALANCE) balance += 0; 
		else this.balance = balance;
	}
	

}
