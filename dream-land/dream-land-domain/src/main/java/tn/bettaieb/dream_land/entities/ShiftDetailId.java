package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ShiftDetailId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer  idUser;
	private Integer idAmusement;
	private Date shiftDate;
	public ShiftDetailId() {
	}
	
	public ShiftDetailId(Integer idUser, Integer idAmusement, Date shiftDate) {
		super();
		this.idUser = idUser;
		this.idAmusement = idAmusement;
		this.shiftDate = shiftDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAmusement == null) ? 0 : idAmusement.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result + ((shiftDate == null) ? 0 : shiftDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShiftDetailId other = (ShiftDetailId) obj;
		if (idAmusement == null) {
			if (other.idAmusement != null)
				return false;
		} else if (!idAmusement.equals(other.idAmusement))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		if (shiftDate == null) {
			if (other.shiftDate != null)
				return false;
		} else if (!shiftDate.equals(other.shiftDate))
			return false;
		return true;
	}

	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public Integer getIdAmusement() {
		return idAmusement;
	}
	public void setIdAmusement(Integer idAmusement) {
		this.idAmusement = idAmusement;
	}

	public Date getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(Date shiftDate) {
		this.shiftDate = shiftDate;
	}

}
