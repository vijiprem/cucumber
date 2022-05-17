package org.ddemo;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.base.QaPoojo;
import org.base.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.value.QaValue;

public class QatestngInput  extends Utility {
	@BeforeClass
	private void beforeClass() {
		System.out.println("-------------QA Register--------------");
	}
	@AfterClass
	private void afterClass() {
		
	System.out.println("Finished");
	}
	@BeforeMethod
	private void beforeMethods() {
		
	System.out.println("****STARTS******");
	}
	@AfterMethod
	private void afterMethods() {
		System.out.println("***Sucess****");

	}
	
	@Parameters({"firstname","lastname","address","email","mobile"})
	@Test
	private void testCase1(String first,String last,String add,String email,String mobile) {
		lanchChrome();
		maximize();
		implicity();
		url("http://demo.automationtesting.in/Register.html");

		QaPoojo qp=new QaPoojo();
		
				sendkeys(qp.getFirstname(),first);
				sendkeys(qp.getLastname(), last);
				sendkeys(qp.getAddresss(),add);
				sendkeys(qp.getEmail(), email);
				sendkeys(qp.getMobile(),mobile);
				

	}
	@Parameters({"gender","hobby","language","skill","Country","Year","Month","Date","password","Cpassword"})
	@Test
	private void testCase2(String gender,String hobby,String lang,String skill,String coun,String year,String mon,String date,String pass,String cpass) throws AWTException {
		QaPoojo qp=new QaPoojo();
		clikButton(qp.getClfemale());
		clikButton(qp.getHobby());
		clikButton(qp.getLanguage());
		keyDown(qp.getLanguage());
		keyEnter(qp.getLanguage());
		selectByVisibletext(qp.getSkill(),skill);
		selectByVisibletext(qp.getCountry(),coun);
		selectByVisibletext(qp.getYear(), year);
		selectByVisibletext(qp.getMonth(), mon);
		selectByVisibletext(qp.getDate(), date);
		sendkeys(qp.getPass(), pass);
		sendkeys(qp.getSpass(), cpass);
		clikButton(qp.getSubmit());

	}
}
