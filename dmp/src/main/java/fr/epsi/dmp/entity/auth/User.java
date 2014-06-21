package fr.epsi.dmp.entity.auth;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import fr.epsi.dmp.entity.generalites.Patient;

@Getter
@Setter
@Entity
@Table(name="USERS")
/**
 * 
 * @author David
 * 
 * Entity pour l'authentification
 */
public class User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDUSER", nullable=false)
	protected Long id;
	
	@Column(name="IDENTIFIANT", nullable=false)
	protected String identifiant;
	
	
	@Column(name="PASSWORD", nullable=false)
	protected String password;
	
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	@JoinColumn(name="IDPATIENT")
	public Patient patient;
	
}
