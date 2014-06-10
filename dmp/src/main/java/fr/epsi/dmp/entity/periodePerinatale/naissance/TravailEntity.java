package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import fr.epsi.dmp.entity.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="TRAVAILACCOUCHEMENT")
public class TravailEntity extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2872144334185261502L;

	@Id
	@Column(name="IDTRAVAIL", nullable=false)
	protected Integer id;
	
	@Column(name="LIBELLE",nullable=false)
	protected String libelle;
	
	@Column(name="RUPTURE", nullable=false)
	protected Boolean rupture;
	
	
	
}
