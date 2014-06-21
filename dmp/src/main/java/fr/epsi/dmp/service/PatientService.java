package fr.epsi.dmp.service;

import java.util.List;


import fr.epsi.dmp.entity.generalites.Patient;

public interface PatientService {

	/**
	 * Check if the entered email exists in the database
	 * @return
	 */
	public boolean nameExists(String name);

	/**
	 * Return all of the users
	 * @return
	 */
	public List<Patient> getAllUsers();

	/**
	 * Return a user thanks to his mail
	 * @param email
	 * @return
	 */
	public Patient getUserByName(String name);
	
	
}
