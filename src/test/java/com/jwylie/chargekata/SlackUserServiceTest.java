package com.jwylie.chargekata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SlackUserServiceTest {
	
	@Autowired
	SlackUserService testService;
	
	@Test
	public void setTokenTest() {
		assertEquals(testService.setSearchToken("404"), "404");
	}
	
	@Test
	public void setIdTest() {
		assertEquals(testService.setSearchToken("404"), "404");
	}
	
	@Test
	public void jackTest() {
		testService.setSearchToken("xoxp-535329037123-536738242464-640106805206-900ccc9831089dc58eab49eb62d3e143");
		testService.setSearchId("UFSMQ74DN");
		User jack = testService.getUser();
		assertEquals(jack.getId(), "UFSMQ74DN");
		assertEquals(jack.getUsername(), "jwylie");
	}
	
	@Test
	public void rexTest() {
		testService.setSearchToken("xoxp-535329037123-536738242464-640106805206-900ccc9831089dc58eab49eb62d3e143");
		testService.setSearchId("UFTKJQGER");
		User rex = testService.getUser();
		assertEquals(rex.getId(), "UFTKJQGER");
		assertEquals(rex.getUsername(), "rpriest");
	}
	
	@Test
	public void kaiTest() {
		testService.setSearchToken("xoxp-535329037123-536738242464-640106805206-900ccc9831089dc58eab49eb62d3e143");
		testService.setSearchId("UFSMPMSSC");
		User kai = testService.getUser();
		assertEquals(kai.getId(), "UFSMPMSSC");
		assertEquals(kai.getUsername(), "kherrera");
	}
	
	@Test
	public void alternativeWorkspaceTest() {
		testService.setSearchToken("xoxp-636210268598-633514060628-634957020805-76ccd7babeed6a1d87ac462d5588975a");
		testService.setSearchId("UJMF41SJG");
		User kai = testService.getUser();
		assertEquals(kai.getId(), "UJMF41SJG");
		assertEquals(kai.getUsername(), "wyliejackm");
	}

}
