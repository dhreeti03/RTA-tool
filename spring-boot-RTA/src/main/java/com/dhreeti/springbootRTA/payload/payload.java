package com.dhreeti.springbootRTA.payload;

public class payload {

	String summary;
	String description;
	Info info;
	userDetails userDetails;
	
	
	
	

	public payload(String summary, String description, Info info,
			userDetails userDetails) {
		this.summary = summary;
		this.description = description;
		this.info = info;
		this.userDetails = userDetails;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public userDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(userDetails userDetails) {
		this.userDetails = userDetails;
	}

}
