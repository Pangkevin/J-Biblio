package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.SubType_Work;

import java.util.Collection;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.Work;
/**
 * Type of Work
 *
 */
public class MusicalWork extends Work {
	

	private Collection<String> mediumOfPerformance;
	private Integer numericDesignation;
	private String key;
	
	public MusicalWork(int idWork, Collection<String> titleOfWork, String formOfWork, Integer numericDesignation, String key) {
		super(idWork, titleOfWork, formOfWork);
		this.numericDesignation = numericDesignation;
		this.key = key;
		
	}
	
	public Collection<String> getMediumOfPerformance() {
		return mediumOfPerformance;
	}
	public void setMediumOfPerformance(Collection<String> mediumOfPerformance) {
		this.mediumOfPerformance = mediumOfPerformance;
	}
	public Integer getNumericDesignation() {
		return numericDesignation;
	}
	public void setNumericDesignation(Integer numericDesignation) {
		this.numericDesignation = numericDesignation;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
