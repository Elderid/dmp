package fr.epsi.dmp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.dmp.common.CipherUtils;
import fr.epsi.dmp.dao.UserDao;
import fr.epsi.dmp.entity.auth.User;
import fr.epsi.dmp.service.UserService;



@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * Check if the entered identifiant exists in the database
	 * @return
	 */	
	public boolean identifiantExists(String identifiant) {
		if (userDao.findByIdentifiant(identifiant)!= null)
			return true;
		return false;
	}



	public List<User> getAllUsers() {
		return userDao.list(User.class);
	}

	public User getUserByIdentifiant(String identifiant) {
		return userDao.findByIdentifiant(identifiant);
	}

	public boolean passwordConfirmMatchPassword(String password,String passwordConfirm) {
		if(password.equals(passwordConfirm))
			return true;
		return false;
	}



	public boolean passwordMatchWithIdentifiant(String identifiant,String password) {
		if (userDao.findByIdentifiant(identifiant)!= null && userDao.findByIdentifiant(identifiant).getPassword().equals(CipherUtils.encrypt(password)))
			return true;
		return false;
	}


}