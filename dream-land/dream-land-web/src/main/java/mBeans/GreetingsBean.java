package mBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GreetingsBean {
	private String name;

	public void doSayHello() {
		System.out.println("hello ;) " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
