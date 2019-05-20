package com.jwylie.chargekata;

public class SlackUser implements User{

private String id, username;
	
	public SlackUser(String id, String username) {
		this.id = id;
		this.username = username;
	}
	
	public String getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
