package h8_0311;

public class Child2 implements LunchMenu {
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
	public void choiceBanana() {}

	@Override
	public void choiceMilk() {
		System.out.print("우유 ");
		totSum += MILK;
	}

	@Override
	public void choiceAlmond() {
		System.out.print("아몬드 ");
		totSum += ALMOND;
	}

	@Override
	public int totSum() {
		return totSum;
	}

	@Override
	public void childName(String name) {
		System.out.print(name +"원생은 식대에는 ");
	}

	@Override
	public void totSumReset() {
		totSum = 0;		
	}



	
	
	

}
