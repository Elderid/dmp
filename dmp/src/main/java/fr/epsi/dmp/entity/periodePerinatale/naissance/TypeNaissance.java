package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="TYPENAISSANCEACCOUCHEMENT")
public class TypeNaissance  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5277435962951907756L;

	@Id
	@Column(name="IDTYPENAISSANCE", nullable=false)
	protected Integer id;
	
	@Column(name="LIBELLE", nullable=false)
	protected String libelle;
	
	
	@Column(name="INDICATION", nullable=true)
	protected String indicationString;
	
	

}
