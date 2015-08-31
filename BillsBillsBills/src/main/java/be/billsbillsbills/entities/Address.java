package Entitites;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String number;
	private int pO;
	private int postal;
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
	public int getpO() {
		return pO;
	}
	public void setpO(int pO) {
		this.pO = pO;
	}
	public int getPostal() {
		return postal;
	}
	public void setPostal(int postal) {
		this.postal = postal;
	}

}
