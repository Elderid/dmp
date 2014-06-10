package fr.epsi.dmp.entity.generalites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import fr.epsi.dmp.entity.AbstractEntity;
import fr.epsi.dmp.entity.utils.CoordonneeEntity;


@Getter
@Setter
@Entity (name = "PATIENT")
public class PatientEntity extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2094621643716156227L;

	
	@Id
	@Column(name ="IDPATIENT")
	protected Integer id;
	
	@Column(name = "NOM", nullable = false)
	protected String nom;
	
	@Column(name = "PRENOM", nullable = false)
	protected String prenom;
	
	@Column(name = "DATENAISSANCE", nullable = false)
	protected Date dateNaissance;
	
	@Column(name = "LIEUNAISSANCE", nullable = false)
	protected String lieuNaissance;
	
	
	@OneToMany(mappedBy = "COORDONNEE")
	protected List<CoordonneeEntity> coordonnees;
		
	
	
}
