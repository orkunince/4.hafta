package Concretes;


import Abstracts.UserCheckService;
import Abstracts.UserService;
import Entities.User;

public class UserManager implements UserService {

	
	@Override
	public void add(User user) {
		
		if(user!=null) {
			
			System.out.println(user.getFirstName() + " oyuncu eklendi.");
		}else {
			return;
		}
		
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() +" isimli oyuncu güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli oyuncu silindi.");
		
	}

}
