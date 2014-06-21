package fr.epsi.dmp.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import fr.epsi.dmp.dao.AbstractDao;
import fr.epsi.dmp.dao.PatientDao;
import fr.epsi.dmp.entity.generalites.Patient;

@Repository("PatientDao")
public class PatientDaoImpl extends AbstractDao<Patient, Long> implements PatientDao{

	
	private static final Logger LOGGER = Logger.getLogger(PatientDaoImpl.class);
	
	public PatientDaoImpl(){
		super();
	}
	
	
	@Override
	public List<Patient> list(Class<Patient> c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient find(Long id) {
		return this.find(Patient.class, id);
	}

	@Override
	public Long create(Patient obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Patient obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Patient obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient findByName(String name) {
		try{
			return (Patient) getHibernateTemplate().find("from patient u where u.name =?", name).get(0);
		} catch(Exception e){
			LOGGER.error(e.getMessage());
			return null;
		}
	}

}