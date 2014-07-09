package fr.epsi.dmp.service;

import junit.framework.Assert;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



import fr.epsi.dmp.entity.auth.User;
import fr.epsi.dmp.service.UserService;

@SuppressWarnings("deprecation")
public class UserServiceTest extends AbstractServiceTest {

	@Autowired
	UserService userService;

	private final static User user = new User();

	

	@Test
	public void testPasswordDoesntMatchWithIdentifiant() {
		user.setIdentifiant("SelectIdentifiant");
		user.setPassword("WrongPass");
		Assert.assertFalse(userService.passwordMatchWithIdentifiant(user.getIdentifiant(), user.getPassword()));
	}

	@Test
	public void testIdentifiantExist(){
		user.setIdentifiant("SelectIdentifiant");;
		Assert.assertTrue(userService.identifiantExists(user.getIdentifiant()));
	}

	@Test
	public void testIdentifiantDoesntExist(){
		user.setIdentifiant("fakeIdentifiant");
		Assert.assertFalse(userService.identifiantExists(user.getIdentifiant()));
	}

	@Test
	public void testGetUserByIdentifiant() {
		user.setIdentifiant("SelectIdentifiant");
		Assert.assertTrue(userService.getUserByIdentifiant(user.getIdentifiant()).equals("SelectIdentifiant"));
	}

	
	@Test
	public void testList() {
		Assert.assertTrue(CollectionUtils.isNotEmpty(userService.getAllUsers()));
	}

	@Test
	public void testPasswordConfirmMatchPassword() {
		Assert.assertTrue(userService.passwordConfirmMatchPassword("Test13", "Test13"));
	}

	@Test
	public void testPasswordConfirmDoesntMatchPassword() {
		Assert.assertFalse(userService.passwordConfirmMatchPassword("Test13", "pass"));
	}

}
