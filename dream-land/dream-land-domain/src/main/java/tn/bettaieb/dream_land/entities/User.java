package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_user")
public class User implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USR_CODE")
	private Integer code;
	@Column(name = "USR_NAME")
	private String name;
	@Column(name = "USR_LOGIN")
	private String login;
	@Column(name = "USR_PWD")
	private String password;
	@Column(name = "USR_EMAIL")
	private String email;

	@OneToMany(mappedBy = "user")
	private List<ShiftDetail> shiftDetails;

	@ManyToMany(mappedBy = "costomers")
	private List<Pack> packs;

	public User(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	}

	public User(String name, String login, String password, String email) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public List<ShiftDetail> getShiftDetails() {
		return shiftDetails;
	}

	public void setShiftDetails(List<ShiftDetail> shiftDetails) {
		this.shiftDetails = shiftDetails;
	}

	public List<Pack> getPacks() {
		return packs;
	}

	public void setPacks(List<Pack> packs) {
		this.packs = packs;
	}

}
