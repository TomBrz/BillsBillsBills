package be.billsbillsbills.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Record_In extends Record{


	private String invoiceNumber;
	private User user;
	private Client client;



	public void setClient(Client client) {
		this.client = client;}




	@ManyToOne
	@JoinColumn(name = "Client_ID")
	public Client getClient() {
		return client;}




	public String getInvoiceNumber() {
		return invoiceNumber;

	
	}


	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;

	}


	@ManyToOne
	@JoinColumn(name = "User_ID")
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;


	}



	

}
