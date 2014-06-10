package fr.epsi.dmp.entity.utils;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import fr.epsi.dmp.entity.AbstractEntity;
import fr.epsi.dmp.entity.generalites.PatientEntity;
import fr.epsi.dmp.entity.pathoAllergieAntecedent.PathoLongCoursEntity;

@Getter
@Setter
@Entity(name = "COORDONNEE")
public class CoordonneeEntity extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6042557807261313550L;

	@Id
	@Column(name = "IDADRESSE")
	protected Integer id;
	
	@ManyToOne
	@JoinColumn(name = "P_IDPATIENT", nullable = false)
	protected PatientEntity patient;
	
	@ManyToOne
	@JoinColumn(name="PLC_IDPATHODIAGNOSTIC", nullable=false)
	protected PathoLongCoursEntity diagnosticMedecin;
	
	@ManyToOne
	@JoinColumn(name="PLC_IDPATHOETABLISSEMENT", nullable=true)
	protected PathoLongCoursEntity etablissement;
	
	@ManyToOne
	@JoinColumn(name="PLC_IDPATHOURGENCE", nullable=false)
	protected PathoLongCoursEntity urgenceMedecin;
	
	@Column(name="NUMERO", nullable=false)
	protected Integer num;

	@Column(name="RUE", nullable=false)
	protected String rue;
	
	@Column(name="SUITE", nullable=true)
	protected String suite;

	@Column(name="CODEPOSTAL", nullable=false)
	protected String codePostal;

	@Column(name="VILLE", nullable=false)
	protected String ville;
	
	@Column(name="TELEPHONE", nullable=true)
	protected String telephone;
	
	@Column(name="EMAIL", nullable=true)
	protected String email;
	
	
}
