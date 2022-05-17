package org.runnerclass;



import org.demo.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources",
glue="org.demo",dryRun=false,strict=true,monochrome=true,tags= {"@data2d"},
plugin= {"html:C:\\viji testing\\java\\java dev\\DeCucumber\\Report\\html",
		"junit:C:\\viji testing\\java\\java dev\\DeCucumber\\Report\\juit\\pavi.xml",
		"json:C:\\viji testing\\java\\java dev\\DeCucumber\\Report\\json\\shree.json",
		"rerun:runre/failed.txt"})
public class Runfacebook {
@AfterClass
public static void report() {
	JVMReport.generateReport("C:\\viji testing\\java\\java dev\\DeCucumber\\Report\\json\\shree.json");
}
}
