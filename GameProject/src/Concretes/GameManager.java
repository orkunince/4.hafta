package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +" oyunu eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +" adl� oyun bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +" oyunu silindi.");
		
	}

}
