package fr.epsi.dmp.entity.periodePerinatale.prenatale;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.epsi.dmp.entity.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="SEROLOGIE")
public class SerologieEntity extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1528331215692608231L;

	@Id
	@Column(name="IDSEROLOGIE", nullable=false)
	protected Integer idInteger;
	
	
	@Column(name="LIBELLE", nullable=false)
	protected String libelle;
	
	@Column(name="DATECONTROLE", nullable=false)
	protected Date dateControle;
	
	@Column(name="RESULTAT", nullable=false)
	protected String resultat;
	
	@ManyToOne
	@JoinColumn(name="PARENT_IDPARENTS", nullable=false)
	protected ParentsEntity parents;
}
