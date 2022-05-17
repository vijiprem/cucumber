package org.ddemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


//automation 2 ways rerun 1st way
public class Rerun implements IRetryAnalyzer {
	int min=0;
	int max=3;
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
