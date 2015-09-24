package be.billsbillsbills.entities;

public class ClientCommand {
	
			private String name;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getCompanyNumber() {
				return companyNumber;
			}
			public void setCompanyNumber(String companyNumber) {
				this.companyNumber = companyNumber;
			}
			public String getCompanyStreet() {
				return companyStreet;
			}
			public void setCompanyStreet(String companyStreet) {
				this.companyStreet = companyStreet;
			}
			public String getCompanyStreetNumber() {
				return companyStreetNumber;
			}
			public void setCompanyStreetNumber(String companyStreetNumber) {
				this.companyStreetNumber = companyStreetNumber;
			}
			public String getCompanyBox() {
				return companyBox;
			}
			public void setCompanyBox(String companyBox) {
				this.companyBox = companyBox;
			}
			public String getCompanyCity() {
				return companyCity;
			}
			public void setCompanyCity(String companyCity) {
				this.companyCity = companyCity;
			}
			private String companyNumber;
			private String companyStreet;
			private String companyStreetNumber;
			private String companyBox;
			private String companyCity;

}
