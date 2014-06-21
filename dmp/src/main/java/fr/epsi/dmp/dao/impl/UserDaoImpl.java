package fr.epsi.dmp.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import fr.epsi.dmp.dao.AbstractDao;
import fr.epsi.dmp.dao.UserDao;
import fr.epsi.dmp.entity.auth.User;



@Repository("UserDao")
public class UserDaoImpl extends AbstractDao<User, Long> implements UserDao {

	private static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	public UserDaoImpl() {
		super();
	}

	public User find(Long id) {
		return this.find(User.class, id);
	}

	public User findByIdentifiant(String identifiant) {
		try{
			return (User) getHibernateTemplate().find("from users u where u.identifiant =?", identifiant).get(0);
		} catch(Exception e){
			LOGGER.error(e.getMessage());
			return null;
		}
	}
	
}
