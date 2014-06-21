package fr.epsi.dmp.entity.generalites;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import fr.epsi.dmp.entity.auth.User;
import fr.epsi.dmp.entity.utils.CoordonneeEntity;


@Getter
@Setter
@Entity (name = "PATIENT")
public class Patient{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="IDPATIENT")
	protected Long id;
	
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
		
	@OneToOne(fetch = FetchType.LAZY, mappedBy=("patient"))
	public User user;
	
	
}
