package fr.epsi.dmp.entity;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * Parent de toutes les classes ayant des champ de tracking(date de creation, modification, utilisateur ayant modifie...).
 * 
 * @author David
 * 
 */
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity {


}
