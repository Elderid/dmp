package fr.epsi.dmp.entity.periodePerinatale.naissance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="PRESENTATIONACCOUCHEMENT")
public class Presentation {

	@Id
	@Column(name="IDPRESENTATION", nullable=false)
	protected Integer idInteger;
	
	@Column(name="LIBELLE", nullable=false)
	protected String libelleString;
	
	
	
}
