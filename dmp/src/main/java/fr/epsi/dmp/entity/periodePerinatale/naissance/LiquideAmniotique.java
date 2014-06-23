package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="LIQUIDEAMNIOTIQUEACCOUCHEMENT")
public class LiquideAmniotique  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6742489854426423188L;
	
	@Id
	@Column(name="IDLIQUIDEAMNIOTIQUE", nullable=false)
	protected Integer idInteger;
	
	@Column(name="COULEUR",nullable=false)
	protected String couleur;
	

}
