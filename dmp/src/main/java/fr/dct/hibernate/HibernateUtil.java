package fr.dct.hibernate;

import javax.persistence.EntityManagerFactory;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.context.internal.ManagedSessionContext;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.internal.SessionFactoryImpl;

/**
 * Classe utilitaire pour Hibernate.
 * 
 * @author ElderId
 */
public class HibernateUtil {

	private static EntityManagerFactory dmpEntityManagerFactory;

	/**
	 * Set le gestionnaire de session pour la connexion ‡† Medic.
	 * 
	 * @param medicEntityManagerFactory le gestionnaire de session pour la connexion ‡† MEDIC (initialis√© par Spring).
	 */
	@SuppressWarnings("unused")
	public static void setDmpEntityManagerFactory(EntityManagerFactory medicEntityManagerFactory) {
		HibernateUtil.dmpEntityManagerFactory = medicEntityManagerFactory;

		final EventListenerRegistry registry = ((SessionFactoryImpl) getSessionFactory()).getServiceRegistry().getService(EventListenerRegistry.class);
	}

	
	@SuppressWarnings("unchecked")
	public static SessionFactory getSessionFactory() {
		return  ((Session) dmpEntityManagerFactory).getSessionFactory();
	}

	/**
	 * Retourne une nouvel session hibernate.
	 * 
	 * @return une nouvelle session.
	 */
	public static Session openNewSession() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		ManagedSessionContext.bind((org.hibernate.Session) session);

		// On g√®re manuellement le flush pour Èviter que Hibernate le fasse quand on fait un Criteria.list().
		session.setFlushMode(FlushMode.MANUAL);
		session.beginTransaction();

		return session;
	}

	/**
	 * Retourne la session en cours.
	 * 
	 * @return la session en cours.
	 */
	public static Session getCurrentSession() {
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}

}