package be.billsbillsbills.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String number;
	private String pO;
	private String postal;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getpO() {
		return pO;
	}

	public void setpO(String pO) {
		this.pO = pO;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

}
