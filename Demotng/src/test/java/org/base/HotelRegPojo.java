package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelRegPojo extends Utility{
public HotelRegPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="New User Register Here")
private WebElement registerclick;
public WebElement getRegisterclick() {
	return registerclick;
}
@FindBy(id="username")
private WebElement username;
public WebElement getUsername() {
	return username;
}
@FindBy(id="password")
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(id="re_password")
private WebElement repassword;
public WebElement getRepassword() {
	return repassword;
}
@FindBy(id="full_name")
private WebElement fullname;
public WebElement getFullname() {
	return fullname;
}
@FindBy(id="email_add")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(id="captcha")
private WebElement captcha;
public WebElement getCaptcha() {
	return captcha;
}
@FindBy(id="captcha-form")
private WebElement sendCaptcha;
public WebElement getSendCaptcha() {
	return sendCaptcha;
}
@FindBy(id="tnc_box")
private WebElement checkBox;
public WebElement getCheckBox() {
	return checkBox;
}
@FindBy(id="Submit")
private WebElement submit;
public WebElement getSubmit() {
	return submit;
}
}
