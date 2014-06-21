package fr.epsi.dmp.dao;

import java.util.List;

import fr.epsi.dmp.entity.generalites.Patient;

public interface PatientDao {

	
	/**
	 * List every objects of the selected type from the data source
	 *
	 * @return
	 */
	public List<Patient> list(Class<Patient> c);


	/**
	 * Find an object identified by an ID
	 *
	 * @param id
	 * @return
	 */
	public Patient find(Long id);


	/**
	 * Save an object in the data source
	 *
	 * @param obj
	 */
	public Long create(Patient obj);

	/**
	 * Update an object present in the data source
	 * 
	 * @retrun
	 */
	public void update(Patient obj);

	/**
	 * Delete an object from the data source
	 *
	 * @param obj
	 */
	public void delete(Patient obj);


	/**
	 * Find a user identifiend by his name
	 * 
	 * @param identifiant
	 * @return
	 */
	public Patient findByName(String name);
}
