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
public class Record_In  {


private String invoiceNumber;
private User user;
private Client client;
private long id;
private LocalDate date;
private Category category;
private String description;
private double amount;
private float percentage;
private String url;


public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
@Id
@GeneratedValue
public long getId() {
	return id;
}
public void setId(long id){
	this.id=id;
}
@Enumerated(EnumType.STRING)
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
@Column(name="description", nullable=true)
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Column(name="amount", nullable=true)
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Column(name="percentage")
public float getPercentage() {
	return percentage;
}
public void setPercentage(float percentage) {
	this.percentage = percentage;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}



public void setClient(Client client){
	this.client=client;
}


@ManyToOne
@JoinColumn(name="Client_ID")
public Client getClient(){
	return client;
}

public String getInvoiceNumber() {
	return invoiceNumber;
}
public void setInvoiceNumber(String invoiceNumber) {
	this.invoiceNumber = invoiceNumber;
}

@ManyToOne
@JoinColumn(name="User_ID")
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}


}
