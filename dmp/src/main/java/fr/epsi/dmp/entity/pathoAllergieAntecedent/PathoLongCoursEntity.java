package fr.epsi.dmp.entity.pathoAllergieAntecedent;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import fr.epsi.dmp.entity.AbstractEntity;
import fr.epsi.dmp.entity.utils.CoordonneeEntity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity (name = "PATHOLONGCOURS")
public class PathoLongCoursEntity extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -169949510000067707L;

	@Id
	@Column(name ="IDPATHOLONGCOURS", nullable=false)
	protected Integer id;
	
	@Column(name="DIAGNOSTIC", nullable=false)
	protected String diagnostic;
	
	
	@Column(name="DATEDIAGNOSTIC", nullable=false)
	protected Date date;
	
	@OneToMany(mappedBy = "COORDONNEEMEDECIN")
	protected List<CoordonneeEntity> diagnosticMedecin;
	
	@OneToMany(mappedBy="COORDONNEEETABLISSEMENT")
	protected List<CoordonneeEntity> etablissements;
	
	@OneToMany(mappedBy="COORDONNEEMEDECINURGENCE")
	protected List<CoordonneeEntity> urgenceMedecin;
	
	
}
