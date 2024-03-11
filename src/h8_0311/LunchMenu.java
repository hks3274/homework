package h8_0311;

public interface LunchMenu {
	int RICE = 500;
	int	BULGOGI = 2000;
	int DUBU = 1000;
	int MIYEOG = 1000;
	int YOPLAIT = 800;
	int BANANA = 500;
	int MILK = 500;
	int ALMOND = 700;
	
	void childName(String name);
	void basicMenu();
	void choiceDuBu();
	void choiceMiyeog();
	void choiceYolait();
	void choiceBanana();
	void choiceMilk();
	void choiceAlmond();
	int totSum();
	void totSumReset();
}
