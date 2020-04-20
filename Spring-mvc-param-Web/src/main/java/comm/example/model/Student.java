package comm.example.model;

import java.util.LinkedHashMap;

/*
 * public class Student {
 * 
 * private String id; private String firstName; private String lastName; private
 * String email; public Student(String id, String firstName, String lastName,
 * String email) { super(); this.id = id; this.firstName = firstName;
 * this.lastName = lastName; this.email = email; } public Student() { super(); }
 * public String getId() { return id; } public void setId(String id) { this.id =
 * id; } public String getFirstName() { return firstName; } public void
 * setFirstName(String firstName) { this.firstName = firstName; } public String
 * getLastName() { return lastName; } public void setLastName(String lastName) {
 * this.lastName = lastName; } public String getEmail() { return email; } public
 * void setEmail(String email) { this.email = email; }
 * 
 * 
 * 
 * 
 * }
 */

public class Student {

	private String firstName;
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
			
}