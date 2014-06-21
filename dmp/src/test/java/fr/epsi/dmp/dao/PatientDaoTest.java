package fr.epsi.dmp.dao;

import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.epsi.dmp.entity.generalites.Patient;

public class PatientDaoTest extends AbstractDaoTest{

	@Autowired
	PatientDao patientDao;
	
	@Test
	public void testList(){
		assertTrue(CollectionUtils.isNotEmpty(patientDao.list(Patient.class)));
	}
}
