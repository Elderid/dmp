package fr.epsi.dmp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsi.dmp.dao.PatientDao;
import fr.epsi.dmp.entity.generalites.Patient;
import fr.epsi.dmp.service.PatientService;


@Service("PatientService")
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientDao patientDao;

	/**
	 * Check if the entered identifiant exists in the database
	 * @return
	 */	
	public boolean nameExists(String name) {
		if (patientDao.findByName(name)!= null)
			return true;
		return false;
	}



	public List<Patient> getAllUsers() {
		return patientDao.list(Patient.class);
	}

	public Patient getUserByName(String name) {
		return patientDao.findByName(name);
	}

}
