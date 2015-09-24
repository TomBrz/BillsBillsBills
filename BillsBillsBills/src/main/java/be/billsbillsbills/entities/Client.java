package be.billsbillsbills.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Client")
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="ClientName")
	private String name;
	private Address address;
	private String companyNumber;
	private String phone;
	
	@ManyToOne
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@OneToMany(mappedBy="client")
	private List<Record_In> recordsIn = new ArrayList<Record_In>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCompanyNumber() {
		return companyNumber;
	}
	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public long getId(){
		return id;
	}
	public void addRecordIn(Record_In recordIn){
		recordsIn.add(recordIn);
		recordIn.setClient(this);
	}
	public void removeRecordIn(Record_In recordIn){
		recordsIn.remove(recordIn);
		recordIn.setClient(null);
	}
	
	

}
