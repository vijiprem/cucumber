package org.demo;

import java.util.Date;

import org.base.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {
@Before
public void before() {
	System.out.println("****START******");

}
@Before
public void befor() {
	Date d=new Date();
	System.out.println(d);

}
@After
public void aft() {
	System.out.println("####END####");
}
}
