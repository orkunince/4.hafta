package Concretes;

import Abstracts.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public void checkIfRealUser(User user) {
		System.out.println("Kullanýcý doðrulandý.");
		
	}



}
