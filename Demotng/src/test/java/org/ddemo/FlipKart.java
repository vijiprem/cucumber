package org.ddemo;

import java.util.Date;

import org.base.FlipKartPojo;
import org.base.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FlipKart extends Utility{
	@AfterClass
	private void afterClass() {
		System.out.println("---------Finished---------");

	}
	@BeforeClass
	private void beforeClass() {
		System.out.println("******FlipKart******");

	}
	@AfterMethod
	private void after() {
		System.out.println("Above TestCase Runned Successfully");

	}
	
	@BeforeMethod
	private void beforeMethod() {
		Date a=new Date();
		System.out.println(a);
	}
	
	@Parameters({"logins","password"})
	@Test(groups="viji")
	private void tc11(@Optional("red")String login,@Optional("blue")String password) {
		lanchChrome();
		url("https://www.flipkart.com/account/login");
		maximize();
		implicity();
		FlipKartPojo fp=new FlipKartPojo();
		
		sendkeys(fp.getLogin(), login);
		sendkeys(fp.getPass(), password);
		clikButton(fp.getSubmit());
		System.out.println("tc11:"+Thread.currentThread().getId());

	}
	@Parameters({"usernames","passwords"})
	@Test
	private void tc2(@Optional("vijiaarthy")String user,@Optional("pavi")String pass) {
		lanchChrome();
		SoftAssert s=new SoftAssert();
		url("https://www.flipkart.com/account/login");
		maximize();
		implicity();
		
		String url = driver.getCurrentUrl();
		s.assertTrue(url.contains("flipkart"));
       FlipKartPojo fp=new FlipKartPojo();
		
		sendkeys(fp.getLogin(), user);
		sendkeys(fp.getPass(), pass);
		clikButton(fp.getSubmit());
		System.out.println("tc2:"+Thread.currentThread().getId());
	}
	//pom
	@Test(threadPoolSize=3,groups="smoke")
	private void tc3() {
		lanchChrome();
		url("https://www.flipkart.com/account/login");
		maximize();
		implicity();
		FlipKartPojo fp=new FlipKartPojo();
		
		sendkeys(fp.getLogin(), "vijiprem@gmail.com");
		sendkeys(fp.getPass(), "vijiprem");
		clikButton(fp.getSubmit());
		System.out.println("tc3:"+Thread.currentThread().getId());
	}
	@DataProvider(name="logindata")
	private Object[][] data() {
		return new Object[][] {
			{"interview","today"},
			{"violet","orange"}
		};
	
	}
	@Test(retryAnalyzer=Rerun.class,groups="smoke",dataProvider="logindata")
	private void tc4(String user,String pass) {
		lanchChrome();
		url("https://www.flipkart.com/account/login");
		maximize();
		implicity();
		FlipKartPojo fp=new FlipKartPojo();
		Assert.assertEquals(user, "interview");
		sendkeys(fp.getLogin(), user);
		sendkeys(fp.getPass(), pass);
		clikButton(fp.getSubmit());
		System.out.println("tc4:"+Thread.currentThread().getId());
	}
}

