package tn.bettaieb.dream_land.training.oneToManyUniMaster;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: G
 *
 */
@Entity

public class G implements Serializable {

	   
	@Id
	private int idG;
	private static final long serialVersionUID = 1L;

	public G() {
		super();
	}   
	public int getIdG() {
		return this.idG;
	}

	public void setIdG(int idG) {
		this.idG = idG;
	}
   
}
