package tn.bettaieb.dream_land.training.oneToManyUniMaster;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: H
 *
 */
@Entity

public class H implements Serializable {

	@Id
	private int idH;

	@OneToMany
	private List<G> gs;
	private static final long serialVersionUID = 1L;

	public H() {
		super();
	}

	public int getIdH() {
		return this.idH;
	}

	public void setIdH(int idH) {
		this.idH = idH;
	}

	public List<G> getGs() {
		return gs;
	}

	public void setGs(List<G> gs) {
		this.gs = gs;
	}

}
