package org.ddemo;

import java.util.Date;

import org.base.FaceBookPoojo;
import org.base.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facegroup extends Utility {
	@AfterClass
	private void afterClass() {
		System.out.println("---------Finished---------");

	}
	@BeforeClass
	private void beforeClass() {
		System.out.println("******Facebook******");

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
	@Test(groups="smoke")
	private void tcLanch() {
		lanchChrome();
		url("https://www.facebook.com/");
		maximize();
		implicity();
		}
	@Test(groups="sanity")
	@Parameters({"username"})
	private void testCase1(String user) {
FaceBookPoojo fp=new FaceBookPoojo();
		
		sendkeys(fp.getFacelogin(), user);
	}
	@Parameters({"password"})
	@Test(groups="regression")
	private void testCase2(@Optional("viji")String pass) {
		FaceBookPoojo fp=new FaceBookPoojo();
		sendkeys(fp.getFacepass(), pass);

	}
	
	@Test(groups="smoke")
	private void testCase3() {
		FaceBookPoojo fp=new FaceBookPoojo();
		clikButton(fp.getFaceclick());
	}
}
