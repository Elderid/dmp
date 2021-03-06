package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name="NAISSANCE")
public class Naissance  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2149131744281526839L;

	@Id
	@Column(name="IDNAISSANCE", nullable=false)
	protected Integer id;
	
	@Column(name="HEURENAISSANCE", nullable=false)
	protected String heure;
	
	@Column(name="LIEUNAISSANCE", nullable=false)
	protected String lieuNaissance;
	
	@Column(name="POIDSNAISSANCE", nullable=false)
	protected Integer poidsNaissance;
	
	@Column(name="PCNAISSANCE", nullable=true)
	protected Integer pcNaissance;
	
	@Column(name="TAILLENAISSANCE", nullable=true)
	protected Integer tailleNaissance;
	
	@Column(name="APGAR1MIN", nullable=false)
	protected Integer apgar1Min;
	
	@Column(name="APGAR5MIN", nullable=false)
	protected Integer apgar5Min;
	
	@Column(name="GESTETECHSPECIA",nullable=false)
	protected Boolean gesteTechSpe;
	
	@Column(name="COMMENTAIREGESTETECH", nullable=true)
	protected String commentaireTech;
	
	@Column(name="TRANSFERT", nullable=false)
	protected Boolean transfert;
	
	@Column(name="COMMENTAIRETRANSFERT", nullable=true)
	protected String commentaireTransfert;
	
	@Column(name="FIEVREMATERNELLE")
	protected Boolean fievreMaternelle;
	
	@OneToOne(optional=false)
	protected GestesPratique gestePratique;
	
	@OneToOne(optional=false)
	protected Presentation presentation;
	
	@OneToOne(optional=false)
	protected Travail travail;
	
	@OneToOne(optional=false)
	protected Analgesie analgesie;
	
	@OneToOne(optional=false)
	protected TypeNaissance typeNaissance;
	
	@OneToOne(optional=false)
	protected LiquideAmniotique liquideAmniotique;
	
	@OneToOne(optional=false)
	protected ExamenClinique examenClinique;
	
	@OneToOne(optional=false)
	protected ExamenOphtalmo examenOphtalmo;

	@OneToOne(optional=false)
	protected DepistageAudio depistageAudio;
	
	@OneToOne(optional=false)
	protected ExamenBioDepistage depistageBiologique;
	
	
	
}
