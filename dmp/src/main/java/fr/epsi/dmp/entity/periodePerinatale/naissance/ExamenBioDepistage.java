package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ElderId 31 mars 2014
 */
@Getter
@Setter
@Entity(name = "EXAMBIODEPISTAGE")
public class ExamenBioDepistage  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8852861797736344662L;

	@Id
	@Column(name = "IDEXAMBIODEPISTAGE", nullable = false)
	protected Integer id;

	@Column(name = "TRIEXAM", nullable = false)
	protected Boolean triExam;

	@Column(name = "DREPANOCYTOSE", nullable = false)
	protected Boolean drepanocytose;

	@Column(name = "MUCOVISCIDOSECONSENTEMENT", nullable = false)
	protected Boolean consentementMucoviscidose;

	@Column(name = "MUCOVISCIDOSETEST", nullable = false)
	protected Boolean testMucoviscidose;

	@Column(name = "AUTRESDEPITAGES", nullable = true)
	protected String autreDepistage;

	@Column(name = "DATE", nullable = false)
	protected Date dateExamen;

	@Column(name = "LIEU", nullable = false)
	protected String lieuExamen;

	@Column(name = "PRATICIEN", nullable = false)
	protected String praticien;
}
