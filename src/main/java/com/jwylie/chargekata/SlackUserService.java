package com.jwylie.chargekata;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SlackUserService implements UserService {

	String token, id, url;
	RestTemplate restTemplate = new RestTemplate();
	User user;
	
	public String setSearchToken(String token) {
		this.token = token;
		return this.token;
	}
	
	public String setSearchId(String id) {
		this.id = id;
		return this.id;
	}
	
	public User getUser() {
		url = "https://slack.com/api/users.info?token=" + this.token + "&user=" + this.id + "&pretty=1";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(url, String.class);
		JSONObject responseObject = new JSONObject(response.getBody());
		JSONObject userObject = responseObject.getJSONObject("user");
		String username = userObject.getString("name");
		user = new SlackUser(this.id, username);
		return user;
	}

}