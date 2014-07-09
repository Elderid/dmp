package fr.epsi.dmp.dao;

import java.util.List;

import fr.epsi.dmp.entity.auth.User;


public interface UserDao {

	/**
	 * List every objects of the selected type from the data source
	 *
	 * @return
	 */
	public List<User> list(Class<User> c);


	/**
	 * Find an object identified by an ID
	 *
	 * @param id
	 * @return
	 */
	public User find(Long id);


	/**
	 * Save an object in the data source
	 *
	 * @param obj
	 */
	public Long create(User obj);

	/**
	 * Update an object present in the data source
	 * 
	 * @retrun
	 */
	public void update(User obj);

	/**
	 * Delete an object from the data source
	 *
	 * @param obj
	 */
	public void delete(User obj);


	/**
	 * Find a user identifiend by his identifiant
	 * 
	 * @param identifiant
	 * @return
	 */
	public User findByIdentifiant(String identifiant);
}
