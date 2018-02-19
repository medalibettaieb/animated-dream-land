package tn.bettaieb.dream_land.training.oneToOneBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: A
 *
 */
@Entity

public class A implements Serializable {

	   
	@Id
	private int idA;
	
	@OneToOne
	private B b;
	private static final long serialVersionUID = 1L;

	public A() {
		super();
	}   
	public int getIdA() {
		return this.idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
   
}
