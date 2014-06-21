package fr.amain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.epsi.dmp.dao.UserDao;
import fr.epsi.dmp.entity.auth.User;

public class Main {

	public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("spring/applicationContext.xml");
 
    	UserDao userDao = (UserDao)appContext.getBean("userDao");
 
    	/** insert **/
    	User userCreate = new User();
    	userCreate.setIdentifiant("toto");
    	userCreate.setPassword("testPassword");
    	
    	userDao.create(userCreate);
 
    	/** select **/
    	User userOperation = userDao.findByIdentifiant("toto");
    	System.out.println(userOperation);
 
    	/** update **/
    	userOperation.setIdentifiant("titi");
    	userDao.update(userOperation);
 
    	/** delete **/
    	userDao.delete(userOperation);
 
    	System.out.println("Done");
    }

}
