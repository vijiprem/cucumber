package org.base;

import org.base.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPoojo extends Utility {
	public FaceBookPoojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement facelogin;
	public WebElement getFacelogin() {
		return facelogin;
	}
	@FindBy(id="pass")
	private WebElement facepass;
	public WebElement getFacepass() {
		return facepass;
	}
	@FindBy(name="login")
	private WebElement faceclick;
	public WebElement getFaceclick() {
		return faceclick;
	}
	@FindBy(xpath="//div[@class='_9ay7']")
	private WebElement Errormsg;
	public WebElement getErrormsg() {
		return Errormsg;
	}
}
