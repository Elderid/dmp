package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="EXAMENCLINIQUENAISSANCE")
public class ExamenCliniqueEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4077952375391680976L;
	
	@Id
	@Column(name="IDEXAMENCLINIQUE", nullable=false)
	protected Integer idInteger;
	
	@Column(name="FREQCARDIOREPOS", nullable=true)
	protected Integer freqCardioRepos;
	
	@Column(name="FREQRESPIREPOS", nullable=true)
	protected Integer freqRespiRepos;
	
	@Column(name="SOUFFLECARDIO", nullable=false)
	protected Boolean souffleCardio;
	
	@Column(name="HEPATHOMEGALIE", nullable=false)
	protected Boolean hepathomegalie;
	
	@Column(name="SPLENOMEGALIE", nullable=false)
	protected Boolean splenomegalie;
	
	@Column(name="ICTERE", nullable=false)
	protected Boolean ictere;
	
	@Column(name="TAUXBILIRUNINE", nullable=true)
	protected String tauxBilirubine;
	
	@Column(name="ORGANEGENITAUX", nullable=false)
	protected String organeGenitaux;
	
	@Column(name="FEMORALEPERCUE", nullable=false)
	protected Boolean femoralePercue;
	
	@Column(name="VIGILANCENORMALE", nullable=false)
	protected Boolean vigilanceNormale;
	
	@Column(name="REACTIONSTIMULI", nullable=false)
	protected Boolean reactionStimuli;
	
	@Column(name="TONUSAXIAL", nullable=false)
	protected Boolean tonusAxial;
	
	@Column(name="TONUSMEMBRES", nullable=false)
	protected Boolean tonusMembres;
	
	@Column(name="MOBILITE", nullable=false)
	protected Boolean mobilite;
	
	@Column(name="FOSSESLOMBAIRE", nullable=false)
	protected Boolean fossesLombaire;
	
	@Column(name="HANCHEDROITE", nullable=false)
	protected Boolean hancheDroite;
	
	@Column(name="HANCHEGAUCHE", nullable=false)
	protected Boolean hancheGauche;
	
	@Column(name="PIEDDROIT", nullable=false)
	protected Boolean piedDroit;
	
	@Column(name="PIEDGAUCE", nullable=false)
	protected Boolean piedGauche;
	
	@Column(name="AUTRESANOMALIES", nullable=false)
	protected String autresAnomalies;

}
