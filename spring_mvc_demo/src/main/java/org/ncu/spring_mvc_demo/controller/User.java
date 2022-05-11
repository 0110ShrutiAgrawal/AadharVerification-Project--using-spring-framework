package org.ncu.spring_mvc_demo.controller;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.NotEmpty;
public class User {
        
	    @NotEmpty(message="This field is required")
		private String userName;	
	    
	    @NotEmpty(message="This field is required")
		private String userPassword;
		private String userGender;
		@NotEmpty(message="This field is required")
		private String[] others;
		private String userAge;
		
		public String getUserAge() {
			return userAge;
		}

		public void setUserAge(String userAge) {
			this.userAge = userAge;
		}

		public String[] getOthers() {
			return others;
		}

		public void setOthers(String[] others) {
			this.others = others;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public String getUserGender() {
			return userGender;
		}

		public void setUserGender(String userGender) {
			this.userGender = userGender;
		}


		private ArrayList<String> otherOptions;

		public ArrayList<String> getGenderOptions() {
			return genderOptions;
		}

		public void setGenderOptions(ArrayList<String> genderOptions) {
			this.genderOptions = genderOptions;
		}
        
		public ArrayList<String> getOtherOptions() {
			return otherOptions;
		}

		public void setOtherOptions(ArrayList<String> otherOptions) {
			this.otherOptions = otherOptions;
		}


		private ArrayList<String> genderOptions;
	
		
		public User() {
			
			/* Adding values inside dropdown list <key,label> */
			
			/* Adding labels for radio buttons */
			genderOptions = new ArrayList<String>();
			genderOptions.add("Male");
			genderOptions.add("Female");
			
			otherOptions = new ArrayList<String>();
			otherOptions.add("C+");
			otherOptions.add("Python");
			otherOptions.add("Java");
			otherOptions.add("Ruby");

			
		}

		
	}

