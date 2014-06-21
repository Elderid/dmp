package fr.epsi.dmp.entity;


import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import fr.epsi.dmp.entity.auth.User;
import fr.epsi.dmp.entity.generalites.Patient;

public class PatientTest {
	
	private final static Patient patient = new Patient();
	private final static User user = new User();
	
	private final static String USER_IDENTIFIANT = "toto";
	//private final static Long PATIENT_ID = 1L;
	private final static String PATIENT_NAME = "testNom";
	private final static String PATIENT_PRENOM = "testPrenom";
	private final static String VALID_BIRTH_DATE_STRING = "24/10/1975";
	private final static String LIEU_NAISSANCE = "Le Creusot";
	
	private Date VALID_BIRTH_DATE;

	
	@Before
	public void setUpTest() throws ParseException {
		
		user.setIdentifiant(USER_IDENTIFIANT);
		patient.setId(1L);
		patient.setNom(PATIENT_NAME);
		patient.setPrenom(PATIENT_PRENOM);
		patient.setLieuNaissance(LIEU_NAISSANCE);

		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		VALID_BIRTH_DATE = formatter.parse(VALID_BIRTH_DATE_STRING);
		patient.setDateNaissance(VALID_BIRTH_DATE);
	
	}
	
	@Test
	public void testHasUser(){
		assertTrue(patient.getUser()!=null);
	}
	
	@Test
	public void testHasValidBirthDate(){
		assertTrue(patient.getDateNaissance()!=null);
	}
	
	
	@Test
	public void testPatientGotAnId() {
		assertTrue(patient.getId() != null);
	}
	
	@Test
	public void testPatientGotAnName() {
		assertTrue(patient.getNom()!= null);
	}
	
	@Test
	public void testPatientGotAPrenom() {
		assertTrue(patient.getPrenom() != null);
	}
	
	@Test
	public void testPatientGotAnLieuDeNaissance() {
		assertTrue(patient.getLieuNaissance() != null);
	}
	

}
