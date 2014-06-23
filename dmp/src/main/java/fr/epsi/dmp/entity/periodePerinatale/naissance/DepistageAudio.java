package fr.epsi.dmp.entity.periodePerinatale.naissance;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;



import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ElderId 31 mars 2014
 */
@Getter
@Setter
@Entity(name = "DEPISTAGEAUDIO")
public class DepistageAudio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8037293976830270000L;

	@Id
	@Column(name = "IDDEPISTAGEAUDIO", nullable = false)
	protected Integer id;

	@Column(name = "TEST", nullable = false)
	protected Boolean testEffectue;

	@Column(name = "METHODE", nullable = false)
	protected String methode;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "DOCSCAN", columnDefinition = "BLOB NOT NULL")
	protected byte[] pic;

}
