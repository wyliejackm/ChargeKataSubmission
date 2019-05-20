package com.jwylie.chargekata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SlackUserTest {

	@Autowired
	SlackUserService testService;
	
	SlackUser testUser;
	
	@Test
	public void testId() {
		testUser = new SlackUser("thetestID", "thetestName");
		assertEquals(testUser.getId(), "thetestID");
	}
	
	@Test
	public void testUsername() { 
		testUser = new SlackUser("thetestID", "thetestName");
		assertEquals(testUser.getUsername(), "thetestName");
	}

}

