package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * 
 * @author ElderId 31 mars 2014
 */
@Entity(name = "EXAMENOPHTALMOLOGIQUE")
public class ExamenOphtalmo  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7713399877023575095L;

	@Id
	@Column(name = "IDEXAMOPHTALMO", nullable = false)
	protected Integer id;

	@Column(name = "GLOBESOCULAIRE", nullable = false)
	protected Boolean globeOculaire;

	@Column(name = "CORNEES", nullable = false)
	protected Boolean cornees;

	@Column(name = "PUPILLES", nullable = false)
	protected Boolean pupilles;

	@Column(name = "LUEURSPUPILLAIRES", nullable = false)
	protected Boolean lueursPupillaires;

	@Column(name = "DATE", nullable = false)
	protected Date dateExamen;

	@Column(name = "LIEU", nullable = false)
	protected String lieuExamen;

	@Column(name = "PRATICIEN", nullable = false)
	protected String praticien;

}
