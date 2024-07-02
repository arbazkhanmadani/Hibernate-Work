package com.hib.tut.entities;

import java.time.*;
import java.util.Date;

import javax.persistence.*;


@Embeddable
public class Joining {

	@Temporal(TemporalType.DATE)
	private Date dateOfJoining;

	@Temporal(TemporalType.DATE)
	private Date dateOfResignation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date TimeOfJoining;

	public Joining(){}
	
	public Joining(Date dateOfJoining, Date dateOfResignation, Date localTime) {
		super();
		this.dateOfJoining = dateOfJoining;
		this.dateOfResignation = dateOfResignation;
		TimeOfJoining = localTime;
	}

	@Override
	public String toString() {
		return "Joining [dateOfJoining=" + dateOfJoining + ", dateOfResignation=" + dateOfResignation
				+ ", TimeOfJoining=" + TimeOfJoining + "]";
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfResignation() {
		return dateOfResignation;
	}

	public void setDateOfResignation(Date dateOfResignation) {
		this.dateOfResignation = dateOfResignation;
	}

	public Date getTimeOfJoining() {
		return TimeOfJoining;
	}

	public void setTimeOfJoining(Date timeOfJoining) {
		TimeOfJoining = timeOfJoining;
	}


}
