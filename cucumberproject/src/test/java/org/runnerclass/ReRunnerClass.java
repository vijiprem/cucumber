package org.runnerclass;
import org.demo.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="@src/test/resources/runre/failed.txt",
glue="org.demo",dryRun=false,strict=true,monochrome=true,
plugin= {"json:C:\\viji testing\\java\\java dev\\DeCucumber\\Report\\json\\shree.json"})
public class ReRunnerClass {
	@AfterClass
	public static void report() {
		JVMReport.generateReport("C:\\viji testing\\java\\java dev\\DeCucumber\\Report\\json\\shree.json");
	}
}
