package org.ddemo;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.base.Utility;
import org.base.QaPoojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.value.QaValue;

public class QaRegister extends Utility{
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
@Ignore
@Test
private void testCase1() {
	lanchChrome();
	maximize();
	implicity();
	url("http://demo.automationtesting.in/Register.html");

}
@Test
private void testCase2() throws IOException, AWTException {
	lanchChrome();
	maximize();
	implicity();
	url("http://demo.automationtesting.in/Register.html");

	QaPoojo qp=new QaPoojo();
	List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getFirstname(),r.getFirstName());
			sendkeys(qp.getLastname(), r.getLastname());
			sendkeys(qp.getAddresss(), r.getAddress());
			sendkeys(qp.getEmail(), r.getEmail());
			sendkeys(qp.getMobile(), r.getPhone());
			clikButton(qp.getClfemale());
			clikButton(qp.getHobby());
			clikButton(qp.getLanguage());
			keyDown(qp.getLanguage());
			keyEnter(qp.getLanguage());
			selectByVisibletext(qp.getSkill(), r.getSkill());
			selectByVisibletext(qp.getCountry(), r.getCountry());
			selectByVisibletext(qp.getYear(), r.getYear());
			selectByVisibletext(qp.getMonth(), r.getMonth());
			selectByVisibletext(qp.getDate(), r.getDate());
			sendkeys(qp.getPass(), r.getPassword());
			sendkeys(qp.getSpass(), r.getCpassword());
			clikButton(qp.getSubmit());
}

}
}
