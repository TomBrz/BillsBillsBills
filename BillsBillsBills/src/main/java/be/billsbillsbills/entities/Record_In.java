package be.billsbillsbills.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Record_In extends Record {

	private String invoiceNumber;
	private User user;
	private Client client;

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne
	@JoinColumn(name = "Client_ID")
	public Client getClient() {
		return client;
	}

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
