package fr.epsi.dmp.entity.periodePerinatale.prenatale;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name="PARENTS")
public class Parents  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2096536948629077627L;

	@Id
	@Column(name="IDPARENTS", nullable=false)
	protected Integer idInteger;
	
	@OneToMany(mappedBy = "SEROLOGIE")
	protected List<Serologie> serologies;
	
	@Column(name="NOM", nullable=false)
	protected String nom;
	
	@Column(name="PRENOM", nullable=false)
	protected String prenom;
	
	@Column(name="DATENAISSANCE", nullable=false)
	protected Date dateNaissance;
	
	// a voir comment la définir dans la bdd
	@Column(name="PARENTE", nullable=false)
	protected String parente;
	
	@Column(name="GROUPESANGUIN", nullable=false)
	protected String groupeSanguin;
	
	@Column(name="MEDICAMENTS", nullable=false)
	protected String medicaments;
	
	
	
}
