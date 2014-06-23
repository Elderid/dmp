package fr.epsi.dmp.entity.utils;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

import fr.epsi.dmp.entity.generalites.Patient;
import fr.epsi.dmp.entity.pathoAllergieAntecedent.PathoLongCours;

@Getter
@Setter
@Entity(name = "COORDONNEE")
public class Coordonnee  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6042557807261313550L;

	@Id
	@Column(name = "IDADRESSE")
	protected Integer id;
	
	@ManyToOne
	@JoinColumn(name = "P_IDPATIENT", nullable = false)
	protected Patient patient;
	
	@ManyToOne
	@JoinColumn(name="PLC_IDPATHODIAGNOSTIC", nullable=false)
	protected PathoLongCours diagnosticMedecin;
	
	@ManyToOne
	@JoinColumn(name="PLC_IDPATHOETABLISSEMENT", nullable=true)
	protected PathoLongCours etablissement;
	
	@ManyToOne
	@JoinColumn(name="PLC_IDPATHOURGENCE", nullable=false)
	protected PathoLongCours urgenceMedecin;
	
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
