package fr.epsi.dmp.service;

import java.util.List;

import fr.epsi.dmp.entity.auth.User;



public interface UserService {


	/**
	 * Check if the entered email exists in the database
	 * @return
	 */
	public boolean identifiantExists(String identifiant);

	/**
	 * Return all of the users
	 * @return
	 */
	public List<User> getAllUsers();

	/**
	 * Return a user thanks to his mail
	 * @param email
	 * @return
	 */
	public User getUserByIdentifiant(String identifiant);
	
	/**
	 * Check if password confirm match with password
	 * @param password
	 * @param passwordConfirm
	 * @return
	 */
	public boolean passwordConfirmMatchPassword(String password, String passwordConfirm);

	
	/**
	 * Check if the entered password match with the database password for the provided identifiant
	 * @param identifiant
	 * @param password
	 * @return
	 */
	public boolean passwordMatchWithIdentifiant(String identifiant,String password);



}