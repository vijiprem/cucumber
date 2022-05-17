package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartPojo extends Utility {
public FlipKartPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement login;
public WebElement getLogin() {
	return login;
}
@FindBy(xpath="//input[@type='password']")
private WebElement pass;
public WebElement getPass() {
	return pass;
}
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
private WebElement submit;
public WebElement getSubmit() {
	return submit;
}
}
