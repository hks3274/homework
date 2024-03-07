package h6_0307;

public class ShopService {
	
	private static ShopService shopServer = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance(){
		return shopServer;
	};

}
