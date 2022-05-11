package org.ncu.spring_mvc_demo.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.ncu.spring_mvc_demo.validation.CountryCode;
import org.springframework.format.annotation.DateTimeFormat;

public class AadharUser {
	
	@NotNull(message="this field is required")
	@CountryCode
	private String userName;
	@NotNull(message="this field is required")
	@Size(min=16,max=16)
	private String aadharID;
	@NotNull(message="this field is required")
	@Email(message="incorrect email format")
	private String emailId;
	@NotNull
	@Size(min=8,max=20)
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAadharID() {
		return aadharID;
	}

	public void setAadharID(String aadharID) {
		this.aadharID = aadharID;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public ArrayList<String> getGenderOptions() {
		return genderOptions;
	}

	public void setGenderOptions(ArrayList<String> genderOptions) {
		this.genderOptions = genderOptions;
	}

	public String[] getOthers() {
		return others;
	}

	public void setOthers(String[] others) {
		this.others = others;
	}

	public ArrayList<String> getOtherOptions() {
		return otherOptions;
	}

	public void setOtherOptions(ArrayList<String> otherOptions) {
		this.otherOptions = otherOptions;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Size(min=10,max=10)
	@Digits(integer=10,fraction=0)
	private String pNo;
	@NotEmpty
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private String dob;
	@NotNull
	private String state;
	private String gender;
	private ArrayList<String> genderOptions;
	@NotNull
	private String[] others;
	private ArrayList<String> otherOptions;

	@NotEmpty(message = "this field is required")
	private String address;

	public AadharUser() {
		genderOptions = new ArrayList<String>();
		genderOptions.add("Male");
		genderOptions.add("Female");

		/* Adding labels for check boxes */
		otherOptions = new ArrayList<String>();
		otherOptions.add("PAN ID");
		otherOptions.add("Voter ID");
		otherOptions.add("Driving License");
		otherOptions.add("Passport");
		otherOptions.add("Ration Card");
		otherOptions.add("Domicile Certificate");
	}
}