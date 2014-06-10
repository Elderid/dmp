package fr.epsi.dmp.entity.pathoAllergieAntecedent;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import fr.epsi.dmp.entity.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="ANTECEDENT")
public class AntecedentEntity extends AbstractEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3380716082516911469L;

	@Id
	@Column(name="IDANTECEDENT", nullable=false)
	protected Integer id;
	
	@Column(name="MALADIE", nullable=false)
	protected String maladie;
	
	@Column(name="LIENPARENTE", nullable=false)
	protected String lienParente;
	
}
