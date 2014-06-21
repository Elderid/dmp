package fr.epsi.dmp.entity;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import fr.dct.common.CipherUtils;
import fr.epsi.dmp.entity.auth.User;
import fr.epsi.dmp.entity.generalites.Patient;


public class UserTest {

	private final static User user = new User();
	
	
	private final static String VALID_IDENTIFIANT = "toto";
	private final static String VALID_PASSWORD = "Test";
	private final static Patient patient = new Patient();
	private final static String PATIENT_NAME = "testName";

	@Before
	public void setUpTest() throws ParseException {
		
		user.setId(1L);
		user.setPassword(CipherUtils.encrypt(VALID_PASSWORD));
		user.setIdentifiant(VALID_IDENTIFIANT);
		patient.setId(1L);
		patient.setNom(PATIENT_NAME);
		

	}

	@Test
	public void testHasValidIdentifiant() {
		assertTrue(user.getIdentifiant() != null);
	}

	@Test
	public void testHasValidPassword() {
		assertTrue(user.getPassword() != null);
	}

	@Test
	public void testUserHasPatient() {
		assertTrue(user.getPatient()!= null);
	}

	@Test
	public void testUserGotAnId() {
		assertTrue(user.getId() != null);
	}

	@Test
	public void testUserGotAIdentifiant() {
		assertTrue(user.getIdentifiant() != null);
	}

}
