package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriPojo extends Utility {
public NaukriPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="name")
private WebElement name;
public WebElement getName() {
	return name;
}
@FindBy(id="email")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(id="password")
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(id="mobile")
private WebElement mobile;
public WebElement getMobile() {
	return mobile;
}
@FindBy(xpath="(//h2[@class='main-3'])[2]")
private WebElement fresh;
public WebElement getFresh() {
	return fresh;
}
@FindBy(id="currentCity")
private WebElement city;
public WebElement getCity() {
	return city;
}
@FindBy(xpath="//span[text()='Chennai']")
private WebElement chennaicity;
public WebElement getChennaicity() {
	return chennaicity;
}
@FindBy(xpath="//button[text()='Register Now']")
private WebElement click;
public WebElement getClick() {
	return click;
}
}
