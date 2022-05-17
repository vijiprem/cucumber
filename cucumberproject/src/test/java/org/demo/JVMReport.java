package org.demo;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public static void generateReport(String name) {
	File f=new File("C:\\viji testing\\java\\java dev\\DeCucumber\\Report\\jvm repo");
Configuration c=new Configuration(f, "facebook");
c.addClassifications("OS", "Windows");
c.addClassifications("Tool", "Eclipse");
c.addClassifications("Language", "java -selenium");
c.addClassifications("Date", "29thApril");
List<String> l=new LinkedList<String>();
l.add(name);
ReportBuilder r=new ReportBuilder(l, c);
r.generateReports();
}
}
