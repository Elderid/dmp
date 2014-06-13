package fr.epsi.dmp.entity.auth;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;




import fr.epsi.dmp.entity.AbstractEntity;
import fr.epsi.dmp.entity.generalites.Patient;
import lombok.Getter;
import lombok.Setter;

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
public class User extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2475167120819188520L;

		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDUSER", nullable=false)
	protected Long id;
	
	@Column(name="IDENTIFIANT", nullable=false)
	protected String identifiant;
	
	
	@Column(name="PASSWORD", nullable=false)
	protected String password;
	
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	public Patient patient;
	
}
