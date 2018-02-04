package training;

import java.io.Serializable;

public class Product implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = -5798728517214541084L;
	private int id;
	private String name;
	private Double unitPrice;

	public Product() {
	}

	public Product(String name, Double unitPrice) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
