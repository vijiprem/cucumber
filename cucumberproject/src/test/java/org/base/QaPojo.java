package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaPojo extends Utility{

	public QaPojo() {
		PageFactory.initElements(driver, this);
		
	}
	 @FindBy(xpath="(//input[@type='text'])[1]")
		private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
	private WebElement addresss;
	public WebElement getAddresss() {
		return addresss;
	}
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="//input[@type='tel']")
	private WebElement mobile;

	public WebElement getMobile() {
		return mobile;
	}
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement clfemale;

	public WebElement getClfemale() {
		return clfemale;
	}
	@FindBy(id="checkbox2")
	private WebElement radiobutton;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	@FindBy(id="checkbox3")
	private WebElement checkbox;
	
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	@FindBy(xpath="//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")
	private WebElement language;
	
	public WebElement getLanguage() {
		return language;
	}
	@FindBy(xpath= "//a[text()='English']")
	private WebElement english;


	public WebElement getEnglish() {
		return english;
	}
	@FindBy(id="Skills")
	private WebElement skill;
	
	public WebElement getSkill() {
		return skill;
	}
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement country;

	
	public WebElement getCountry() {
		return country;
	}
	@FindBy(xpath="//li[text()='India']")
	private WebElement india;
public WebElement getIndia() {
		return india;
	}
	@FindBy(xpath="(//select[@type='text'])[3]")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	@FindBy(xpath="(//select[@type='text'])[4]")
	private WebElement month;
	public WebElement getMonth() {
		return month;
	}
	@FindBy(xpath="(//select[@type='text'])[5]")
	private WebElement date;
	
	public WebElement getDate() {
		return date;
	}
	@FindBy(id="firstpassword")
	private WebElement pass;
	
	public WebElement getPass() {
		return pass;
	}
	@FindBy(id="secondpassword")
	private WebElement passconf;
	
	
	public WebElement getPassconf() {
		return passconf;
	}
	@FindBy(id="submitbtn")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
}
