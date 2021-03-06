package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ANALGESIEACCOUCHEMENT")
public class Analgesie  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5741381846007641228L;

	@Id
	@Column(name="IDANALGESIE", nullable=false)
	protected Integer id;
	
	@Column(name="libelle", nullable=false)
	protected String libelle;
	
}
