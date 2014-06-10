package fr.epsi.dmp.entity.auth;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.epsi.dmp.entity.AbstractEntity;
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
public class UserEntity extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2475167120819188520L;

		
	@Id
	@Column(name = "IDUSER", nullable=false)
	protected Integer id;
	
	@Column(name="IDENTIFIANT", nullable=false)
	protected String identifiant;
	
	
	@Column(name="PASSWORD", nullable=false)
	protected String password;
	
	
}
