package org.demo;

import java.util.List;
import java.util.Map;

import org.base.FacebookPojo;
import org.base.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook extends Utility {
	@Given("check login through chrome browser")
	public void check_login_through_chrome_browser() {
	    lanchChrome();
	    maximize();
	    implicity();
	    url("https://www.facebook.com/");
	}
	@When("To Validate valid username and  valid password")
	public void to_Validate_valid_username_and_valid_password() {
	   FacebookPojo fp=new FacebookPojo();
	    
	    sendkeys(fp.getFacelogin(), "viji");
	    sendkeys(fp.getFacepass(), "viji");
	    
	}

	@Then("click login")
	public void click_login() {
		 FacebookPojo fp=new FacebookPojo();
	    clikButton(fp.getFaceclick());
	}
	//senario outline
	@When("To Validate facebook {string} and  {string}")
	public void to_Validate_facebook_and(String user, String pass) {
		 FacebookPojo fp=new FacebookPojo();
		    
		    sendkeys(fp.getFacelogin(), user);
		    sendkeys(fp.getFacepass(), pass);
	}
	@Then("click facebook login")
	public void click_facebook_login() {
		 FacebookPojo fp=new FacebookPojo();
		    clikButton(fp.getFaceclick());
	}
	//data table1d
	@When("To login with userName and password")
	public void to_login_with_userName_and_password(io.cucumber.datatable.DataTable d) {
		
		List<String> all = d.asList();
		String a = all.get(1);
		String b = all.get(0);
		FacebookPojo fp=new FacebookPojo();
	    
	    sendkeys(fp.getFacelogin(), a);
	    sendkeys(fp.getFacepass(), b);
	}
	//data table 2d

		@When("To login userName and password")
		public void to_login_userName_and_password(io.cucumber.datatable.DataTable d) {
		   List<List<String>> all = d.asLists();
		   String a = all.get(1).get(3);
			String b = all.get(5).get(2);
			FacebookPojo fp=new FacebookPojo();
		    
		    sendkeys(fp.getFacelogin(), a);
		    sendkeys(fp.getFacepass(), b);
		}
//data table 1d with header
		@When("To login with datatable map userName and password")
		public void to_login_with_datatable_map_userName_and_password(io.cucumber.datatable.DataTable d) {
		    Map<String, String> all = d.asMap(String.class, String.class);
		    String a = all.get("user");
		    String b = all.get("pass");
             FacebookPojo fp=new FacebookPojo();
		    
		    sendkeys(fp.getFacelogin(), a);
		    sendkeys(fp.getFacepass(), b); 
		}

//data table 2d with header
		@When("To login with datatable {int}dmap userName and password")
		public void to_login_with_datatable_dmap_userName_and_password(Integer int1, io.cucumber.datatable.DataTable d) {
		   List<Map<String, String>> all = d.asMaps();
		   String a = all.get(0).get("user");
		   String b = all.get(1).get("pass");
		   FacebookPojo fp=new FacebookPojo();
		    
		    sendkeys(fp.getFacelogin(), a);
		    sendkeys(fp.getFacepass(), b); 
		}

}
