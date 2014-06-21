package fr.epsi.dmp.dao;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.epsi.dmp.entity.auth.User;

public class UserDaoTest extends AbstractDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void testList() {
		assertTrue(CollectionUtils.isNotEmpty(userDao.list(User.class)));
	}

	@Test
	public void testFind() {
		assertTrue(userDao.find(1L).getIdentifiant().equals("SelectIdentifiant"));
	}

	@Test
	public void testUpdate() {
		User user = userDao.find(2L);
		user.setIdentifiant("TEST");
		userDao.update(user);
		assertTrue(userDao.find(2L).getIdentifiant().equals("TEST"));
	}

	@Test
	public void testCreate() throws ParseException{
		User user = new User();
		user.setId(1L);
		user.setIdentifiant("toto");
		user.setPassword("Test1");
		userDao.create(user);

		assertTrue(userDao.find(user.getId()).getIdentifiant().equals("Test1"));
	}

	@Test
	public void testDelete() {
		userDao.delete(userDao.find(3L));
		assertTrue(userDao.find(3L) == null);
	}


	@Test
	public void testFindByidentifiant() {
		assertTrue(userDao.findByIdentifiant("select@campus.fr").getIdentifiant().equals("SelectIdentifiant"));
	}

}
