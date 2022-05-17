package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaPoojo extends Utility {
	 public QaPoojo() {
			PageFactory.initElements(driver, this);
			
		}
	 //Register qa form
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
		@FindBy(xpath="//input[@type='email']")
		private WebElement email;
		public WebElement getEmail() {
			return email;
		}
		@FindBy(xpath="(//input[@type='radio'])[2]")
		private WebElement clfemale;

		public WebElement getClfemale() {
			return clfemale;
		}
		@FindBy(xpath="//input[@type='tel']")
		private WebElement mobile;

		public WebElement getMobile() {
			return mobile;
		}


		@FindBy(id="daybox")
		private WebElement date;
		public WebElement getDate() {
			return date;
		}
		@FindBy(xpath="(//select[@type='text'])[4]")
		private WebElement month;

		public WebElement getMonth() {
			return month;
		}
		@FindBy(id="yearbox")
		private WebElement year;

		public WebElement getYear() {
			return year;
		}
		@FindBy(xpath="(//select[@type='text'])[5]")
		private WebElement seldate;
		public WebElement getSeldate() {
			return seldate;
		}
		@FindBy(xpath="(//input[@type='checkbox'])[2]")
		private WebElement hobby;
		
		public WebElement getHobby() {
			return hobby;
		}
		@FindBy(id="msdd")
		private WebElement language;
		
		public WebElement getLanguage() {
			return language;
		}
		@FindBy(id="Skills")
		private WebElement skill;
		
		public WebElement getSkill() {
			return skill;
		}
		@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
		private WebElement addresss;
		public WebElement getAddresss() {
			return addresss;
		}
		@FindBy(id="country")
		private WebElement country;
		
		public WebElement getCountry() {
			return country;
		}
		@FindBy(id="firstpassword")
		private WebElement pass;
		public WebElement getPass() {
			return pass;
		}
		@FindBy(id="secondpassword")
		private WebElement spass;
		public WebElement getSpass() {
			return spass;
		}
		@FindBy(id="submitbtn")
		private WebElement submit;
		public WebElement getSubmit() {
			return submit;
		}
}
