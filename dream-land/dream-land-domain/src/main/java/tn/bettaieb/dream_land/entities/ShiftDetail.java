package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: ShiftDetail
 *
 */
@Entity

public class ShiftDetail implements Serializable {
	@EmbeddedId
	private ShiftDetailId shiftDetailId;
	private Date assigementDate;
	private Boolean status;
	private ShiftType shiftType;

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "USR_CODE", updatable = false, insertable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "idAmusement", referencedColumnName = "id", updatable = false, insertable = false)
	private Amusement amusement;
	private static final long serialVersionUID = 1L;

	public ShiftDetail() {
		super();
	}

	

	public ShiftDetail(ShiftType shiftType, User user, Amusement amusement,Date shiftDate) {
		super();
		this.shiftDetailId=new ShiftDetailId(user.getCode(), amusement.getId(), shiftDate);
		this.assigementDate=new Date();
		this.status=false;
		this.shiftType = shiftType;
		this.user = user;
		this.amusement = amusement;
	}



	public Date getAssigementDate() {
		return this.assigementDate;
	}

	public void setAssigementDate(Date assigementDate) {
		this.assigementDate = assigementDate;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public ShiftType getShiftType() {
		return shiftType;
	}

	public void setShiftType(ShiftType shiftType) {
		this.shiftType = shiftType;
	}

	public ShiftDetailId getShiftDetailId() {
		return shiftDetailId;
	}

	public void setShiftDetailId(ShiftDetailId shiftDetailId) {
		this.shiftDetailId = shiftDetailId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Amusement getAmusement() {
		return amusement;
	}

	public void setAmusement(Amusement amusement) {
		this.amusement = amusement;
	}

}
