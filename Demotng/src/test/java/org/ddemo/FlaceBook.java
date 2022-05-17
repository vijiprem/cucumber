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

public class FlaceBook extends Utility {
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
@BeforeGroups
private void before() {
	// TODO Auto-generated method stub
}
@BeforeMethod
private void beforeMethod() {
	Date a=new Date();
	System.out.println(a);
}
@Parameters({"username","password"})
@Test(groups="smoke")

private void tc1(String user,String pass) {
	lanchChrome();
	url("https://www.facebook.com/");
	maximize();
	implicity();
	FaceBookPoojo fp=new FaceBookPoojo();
	
	sendkeys(fp.getFacelogin(), user);
	sendkeys(fp.getFacepass(), pass);
	clikButton(fp.getFaceclick());
	
	System.out.println("tc1:"+Thread.currentThread().getId());
}

@Test
private void tc2() {
	lanchChrome();
	url("https://www.facebook.com/");
	maximize();
	implicity();
	FaceBookPoojo fp=new FaceBookPoojo();
	
	sendkeys(fp.getFacelogin(), "wert");
	sendkeys(fp.getFacepass(), "dfghj");
	clikButton(fp.getFaceclick());
	System.out.println("tc2:"+Thread.currentThread().getId());

}
}
