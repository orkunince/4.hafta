import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GameSaleManager;
import Concretes.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"Orkun","Ýnce","26/07/1992","123456789");
		
		Game game1=new Game(1,"Hard Truck","Simulation",299);
		
		Campaign campaign1=new Campaign(1,"Valentines Day",20);
		
		UserManager userManager=new UserManager();
		userManager.add(user1);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		gameSaleManager.sell(user1, game1, campaign1);

	}

}
