package Concretes;

import Abstracts.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sell(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() +" isimli oyuncuya " +
	game.getGameName() + " oyunu " + campaign.getCampaignName()
	+" kampanyasýyla "+game.getPrice()+ " yerine 100 TL indirimli olarak satýlmýþtýr.");
		
	}

}
