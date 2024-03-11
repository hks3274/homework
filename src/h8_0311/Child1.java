package h8_0311;

public class Child1 implements LunchMenu {
	int totSum;

	@Override
	public void basicMenu() {
		System.out.print("밥 불고기 ");
		totSum += RICE;
		totSum += BULGOGI;
	}
	
	@Override
	public void choiceDuBu() {}

	@Override
	public void choiceMiyeog() {}

	@Override
	public void choiceYolait() {}

	@Override
	public void choiceBanana() {
		System.out.print("바나나 ");		
		totSum += BANANA;
	}

	@Override
	public void choiceMilk() {}

	@Override
	public void choiceAlmond() {}

	@Override
	public int totSum() {
		return totSum;
	}

	@Override
	public void childName(String name) {
		System.out.print(name +"원생의 식대에는 ");
	}

	@Override
	public void totSumReset() {
		totSum = 0;
	}



	
	
	

}
