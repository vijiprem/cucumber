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
import org.testng.annotations.Test;
import org.value.QaValue;

public class Qagrouping extends Utility {
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
	@Test(groups="sanity")
	private void testCase1() {
		lanchChrome();
		maximize();
		implicity();
		url("http://demo.automationtesting.in/Register.html");


	}
	@Test(groups="smoke")
	private void testCase2() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getFirstname(),r.getFirstName());
		}

	}
	@Test(groups="sanity")
	private void testCase3() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getLastname(), r.getLastname());
		}

	}
	
	@Test(groups="sanity")
	private void testCase7() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getAddresss(), r.getAddress());
		}

	}
	@Test(groups="sanity")
	private void testCase8() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getEmail(), r.getEmail());
		}

	}
	@Test(groups="sanity")
	private void testCase9() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getMobile(), r.getPhone());
		}
	}
	@Test(groups="sanity")
	private void testCase10() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			clikButton(qp.getClfemale());
		}

	}
	@Test(groups="sanity")
	private void testCase11() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			clikButton(qp.getHobby());
		}

	}
	@Test(groups="sanity")
	private void testCase12() throws AWTException, IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			clikButton(qp.getLanguage());
			keyDown(qp.getLanguage());
			keyEnter(qp.getLanguage());
		}
	}
	@Test(groups="sanity")
	private void testCase13() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			selectByVisibletext(qp.getSkill(), r.getSkill());
		}

	}
	@Test(groups="sanity")
	private void testCase14() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			selectByVisibletext(qp.getCountry(), r.getCountry());
		}

	}
	@Test(groups="regression")
	private void testCase15() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			selectByVisibletext(qp.getYear(), r.getYear());
		}

	}
	@Test(groups="regression")
	private void testCase16() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			selectByVisibletext(qp.getMonth(), r.getMonth());
		}

	}
	@Test(groups="regression")
	private void testCase17() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			selectByVisibletext(qp.getDate(), r.getDate());
		}

	}
	@Test(groups="regression")
	private void testCase18() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getPass(), r.getPassword());
		}

	}
	@Test(groups="regression")
	private void testCase19() throws IOException {
		QaPoojo qp=new QaPoojo();
		List<QaValue> qa = readQa("QAnew", "login");
		for (QaValue r : qa) {
			sendkeys(qp.getSpass(), r.getCpassword());
		}

	}
}