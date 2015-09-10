package be.billsbillsbills.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String familyName;
	private String email;
	private String role;
	private String password;

	@Embedded
	private Address address = new Address();

	@OneToMany(mappedBy = "user")
	private List<Record_In> recordsIn = new ArrayList<Record_In>();

	@OneToMany(mappedBy = "user")
	private List<Record_out> recordsOut = new ArrayList<Record_out>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void addRecordIn(Record_In recordIn) {
		recordsIn.add(recordIn);
		recordIn.setUser(this);
	}

	public void removeRecordIn(Record_In recordIn) {
		recordsIn.remove(recordIn);
		recordIn.setUser(null);
	}

	public void addRecordOut(Record_out recordOut) {
		recordsOut.add(recordOut);
		recordOut.setUser(this);
	}

	public void removeRecordOut(Record_out recordOut) {
		recordsOut.remove(recordOut);
		recordOut.setUser(null);
	}
	
	public String getRole() {
		return role;
	}

	public void setRole() {
		this.role = "ROLE_USER";
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
