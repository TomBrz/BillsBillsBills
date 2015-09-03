package be.billsbillsbills.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Record_out extends Record{
	
	
	private long id;
	private String invoiceNumber;
	private User user;
	private Supplier supplier;
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public void setUser(User user){
		this.user=user;
	}
	
	@ManyToOne
	@JoinColumn(name="Supplier_ID")
	public Supplier getSupplier(){
		return supplier;
	}
	public void setSupplier(Supplier supplier){
		this.supplier=supplier;
	}
	
	@ManyToOne
	@JoinColumn(name="User_ID")
	public User getUser(){
		return user;
	}
	
	

}
