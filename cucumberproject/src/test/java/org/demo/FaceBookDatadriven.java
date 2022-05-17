package org.demo;

import java.io.IOException;
import java.util.List;

import org.base.FacebookPojo;
import org.base.Utility;
import org.value.LoginData;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBookDatadriven extends Utility {
	@Given("For login using chrome browser")
	public void for_login_using_chrome_browser() {
		 lanchChrome();
		    maximize();
		    implicity();
		    url("https://www.facebook.com/");
	}

	@When("To Validate valid username and  valid password using sheet")
	public void to_Validate_valid_username_and_valid_password_using_sheet() throws IOException {
		  FacebookPojo fp=new FacebookPojo();
		    
		  List<LoginData> lDataList = ReadFile("facebook", "login");
			
			for(LoginData lData : lDataList){
				//Remove header values
				if (!lData.getLoginName().equals("username")) {
			sendkeys(fp.getFacelogin(),lData.getLoginName());
		    sendkeys(fp.getFacepass(),lData.getPassword());
		   
				}}
	}

	@Then("click login button")
	public void click_login_button() {
		 FacebookPojo fp=new FacebookPojo();
		    clikButton(fp.getFaceclick());
	}

}
