package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicEntities;

import java.util.Collection;
import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonStructures.TimeStampedDescription;
/**
 * 
 * @see CartographicWork, MusicalWork
 */
public class Work {
	
	private int idWork;
	private Collection<Integer> idExpressions;
	
	private Collection<String> titleOfWork;
	private String formOfWork; //class to which the work belongs (novel play etc.)
	private Collection<TimeStampedDescription> dateOfWork; //normally the year
	private Collection<String> otherDistinguishingCharacteristic;
	private boolean intendedTermination; 
	private Collection<String> intendedAudience;
	private String contextForTheWork;
	
	public Work(int idWork, Collection<String> titleOfWork, String formOfWork){
		this.idWork = idWork;
		this.titleOfWork = titleOfWork;
		this.formOfWork = formOfWork;
		
	}
	
	public int getIdWork() {
		return idWork;
	}
	public void setIdWork(int idWork) {
		this.idWork = idWork;
	}
	public Collection<Integer> getIdExpressions() {
		return idExpressions;
	}
	public void setIdExpressions(Collection<Integer> idExpressions) {
		this.idExpressions = idExpressions;
	}
	public Collection<String> getTitleOfWork() {
		return titleOfWork;
	}
	public void setTitleOfWork(Collection<String> titleOfWork) {
		this.titleOfWork = titleOfWork;
	}
	public String getFormOfWork() {
		return formOfWork;
	}
	public void setFormOfWork(String formOfWork) {
		this.formOfWork = formOfWork;
	}
	public Collection<TimeStampedDescription> getDateOfWork() {
		return dateOfWork;
	}
	public void setDateOfWork(Collection<TimeStampedDescription> dateOfWork) {
		this.dateOfWork = dateOfWork;
	}
	public Collection<String> getOtherDistinguishingCharacteristic() {
		return otherDistinguishingCharacteristic;
	}
	public void setOtherDistinguishingCharacteristic(Collection<String> otherDistinguishingCharacteristic) {
		this.otherDistinguishingCharacteristic = otherDistinguishingCharacteristic;
	}
	public boolean isIntendedTermination() {
		return intendedTermination;
	}
	public void setIntendedTermination(boolean intendedTermination) {
		this.intendedTermination = intendedTermination;
	}
	public Collection<String> getIntendedAudience() {
		return intendedAudience;
	}
	public void setIntendedAudience(Collection<String> intendedAudience) {
		this.intendedAudience = intendedAudience;
	}
	public String getContextForTheWork() {
		return contextForTheWork;
	}
	public void setContextForTheWork(String contextForTheWork) {
		this.contextForTheWork = contextForTheWork;
	}
	
	
	
}
