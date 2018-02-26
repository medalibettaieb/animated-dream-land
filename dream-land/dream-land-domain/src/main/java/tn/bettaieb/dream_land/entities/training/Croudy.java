package tn.bettaieb.dream_land.entities.training;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Croudy
 *
 */
@Entity

public class Croudy implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public Croudy() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
