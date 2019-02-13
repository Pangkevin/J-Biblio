package io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work;

import java.util.Collection;
import java.util.Objects;

import com.google.common.base.Strings;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.commonstructures.TimeStampedDescription;

/**
 */
public class Work {

	/**
	 * Not <code>null</code>.
	 */
	private int idWork;

	/**
	 * Not <code>null</code>.
	 */
	private Collection<Integer> idExpressions;

	/**
	 * Not <code>null</code>.
	 */
	private Collection<String> titleOfWork;

	/**
	 * Class to which the work belongs (novel play etc.) Not <code>null</code>.
	 */
	private String formOfWork;

	/**
	 * Normally the year Not <code>null</code>.
	 */
	private Collection<TimeStampedDescription> dateOfWork;

	/**
	 * Not <code>null</code>.
	 */
	private Collection<String> otherDistinguishingCharacteristic;

	/**
	 * Not <code>null</code>.
	 */
	private boolean intendedTermination;

	/**
	 * Not <code>null</code>.
	 */
	private Collection<String> intendedAudience;

	/**
	 * Not <code>null</code>.
	 */
	private String contextForTheWork;

	public Work(int idWork, Collection<String> titleOfWork, String formOfWork) {
		this.idWork = idWork;
		this.titleOfWork = titleOfWork;
		this.formOfWork = formOfWork;

	}
	
	/**
	 * @return not <code>null</code>.
	 */
	public Work getWork() {
		return Objects.requireNonNull(this);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public int getIdWork() {
		return idWork;
	}

	/**
	 * @param idWork not <code>null</code>.
	 */
	public void setIdWork(int idWork) {
		this.idWork = idWork;
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Collection<Integer> getIdExpressions() {
		return idExpressions;
	}

	/**
	 * @param titleOfWork not <code>null</code>.
	 */
	public void setIdExpressions(Collection<Integer> idExpressions) {
		this.idExpressions = Objects.requireNonNull(idExpressions);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Collection<String> getTitleOfWork() {
		return titleOfWork;
	}

	/**
	 * @param titleOfWork not <code>null</code>.
	 */
	public void setTitleOfWork(Collection<String> titleOfWork) {
		this.titleOfWork = Objects.requireNonNull(titleOfWork);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getFormOfWork() {
		return formOfWork;
	}

	/**
	 * @param contextForTheWork if <code>null</code>, will be converted to an empty
	 *                          string.
	 */
	public void setFormOfWork(String formOfWork) {
		this.formOfWork = Strings.nullToEmpty(formOfWork);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Collection<TimeStampedDescription> getDateOfWork() {
		return dateOfWork;
	}

	/**
	 * @param dateOfWork not <code>null</code>.
	 */
	public void setDateOfWork(Collection<TimeStampedDescription> dateOfWork) {
		this.dateOfWork = Objects.requireNonNull(dateOfWork);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Collection<String> getOtherDistinguishingCharacteristic() {
		return otherDistinguishingCharacteristic;
	}

	/**
	 * @param otherDistinguishingCharacteristic not <code>null</code>.
	 */
	public void setOtherDistinguishingCharacteristic(Collection<String> otherDistinguishingCharacteristic) {
		this.otherDistinguishingCharacteristic = Objects.requireNonNull(otherDistinguishingCharacteristic);
	}

	public boolean isIntendedTermination() {
		return intendedTermination;
	}

	public void setIntendedTermination(boolean intendedTermination) {
		this.intendedTermination = intendedTermination;
	}

	/**
	 * @return not <code>null</code>.
	 */
	public Collection<String> getIntendedAudience() {
		return intendedAudience;
	}

	/**
	 * @param intendedAudience not <code>null</code>.
	 */
	public void setIntendedAudience(Collection<String> intendedAudience) {
		this.intendedAudience = Objects.requireNonNull(intendedAudience);
	}

	/**
	 * @return not <code>null</code>.
	 */
	public String getContextForTheWork() {
		return contextForTheWork;
	}

	/**
	 * @param contextForTheWork if <code>null</code>, will be converted to an empty
	 *                          string.
	 */
	public void setContextForTheWork(String contextForTheWork) {
		this.contextForTheWork = Strings.nullToEmpty(contextForTheWork);
	}

}
