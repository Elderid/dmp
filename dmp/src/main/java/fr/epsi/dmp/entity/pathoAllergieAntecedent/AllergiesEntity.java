package fr.epsi.dmp.entity.pathoAllergieAntecedent;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import fr.epsi.dmp.entity.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ALLERGIES")
public class AllergiesEntity  extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5273232224017768956L;

	@Id
	@Column(name="IDALLERGIES")
	protected Integer idInteger;
	
	@Column(name="TYPE", nullable=false)
	protected String type;
	
	@Column(name="LIBELLE", nullable=false)
	protected String libelle;
	
	@Column(name="PROBABILITE", nullable=false)
	protected Boolean probabilite;
	
	@Column(name="DATE", nullable=false)
	protected Date date;
	
	@Column(name="COMMENTAIRE", nullable=false)
	protected String commentaire;
	
	@Column(name="MEDECIN", nullable=false)
	protected String medecin;
}
