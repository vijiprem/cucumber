package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\viji testing\\java\\java dev\\DeCucumber\\src\\test\\resources\\Featuresfile\\faceexcel.feature",
glue="org.demo")
public class RunDataFace {

}
