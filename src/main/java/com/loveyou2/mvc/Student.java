package com.loveyou2.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String operatingSystem;
	
	private String favLang;
	private LinkedHashMap<String, String> countryList;
	
	
	public Student() {
		countryList = new LinkedHashMap();
		countryList.put("Indonesia", "Indohsia");
		countryList.put("Singapura", "Singa pool");
		countryList.put("Malaysia", "Malays");
		countryList.put("Taiwan", "Teman");
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}
	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}
	public String getFavLang() {
		return favLang;
	}
	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
}
