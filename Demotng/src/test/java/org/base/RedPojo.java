package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedPojo extends Utility {
public RedPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="i-icon-profile")
private WebElement clickSign;
public WebElement getClickSign() {
	return clickSign;
}
@FindBy(id="signInLink")
private WebElement login;
public WebElement getLogin() {
	return login;
}
@FindBy(id="identifierId")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(xpath="//div[text()='Use another account']")
private WebElement account;
public WebElement getAccount() {
	return account;
}
@FindBy(id="(//span[text()='Sign in with Google'])[5]")
private WebElement gmail;
public WebElement getGmail() {
	return gmail;
}
@FindBy(id="(//div[@class='VfPpkd-RLmnJb'])[1]")
private WebElement next;
public WebElement getNext() {
	return next;
}
@FindBy(name="password")
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[1]")
private WebElement passnext;
public WebElement getPassnext() {
	return passnext;
}
}
