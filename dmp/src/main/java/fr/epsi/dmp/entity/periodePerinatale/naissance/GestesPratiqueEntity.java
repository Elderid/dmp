package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import fr.epsi.dmp.entity.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="SOINSGESTESPRATIQUE")
public class GestesPratiqueEntity extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3734330542114406398L;
	
	@Id
	@Column(name="IDGESTEPRATIQUE", nullable=false)
	protected Integer id;
	
	@Column(name="LIBELLE", nullable=false)
	protected String libelle;
	
	@Column(name="AUTRESRENSEIGNEMENT", nullable=true)
	protected String autreRenseignement;
	

}
