package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaPojo extends Utility {
	 public QaPojo() {
			PageFactory.initElements(driver, this);
			
		}
		 @FindBy(id="firstName")
			private WebElement firstname;
		public WebElement getFirstname() {
			return firstname;
		}
		@FindBy(id="lastName")
		private WebElement lastname;
		public WebElement getLastname() {
			return lastname;
		}
		@FindBy(id="userEmail")
		private WebElement email;
		public WebElement getEmail() {
			return email;
		}
		@FindBy(xpath="//label[text()='Female']")
		private WebElement clfemale;

		public WebElement getClfemale() {
			return clfemale;
		}
		@FindBy(id="userNumber")
		private WebElement mobile;

		public WebElement getMobile() {
			return mobile;
		}


		@FindBy(id="dateOfBirthInput")
		private WebElement date;
		public WebElement getDate() {
			return date;
		}
		@FindBy(xpath="//select[@class='react-datepicker__month-select']")
		private WebElement month;

		public WebElement getMonth() {
			return month;
		}
		@FindBy(xpath="//select[@class='react-datepicker__year-select']")
		private WebElement year;

		public WebElement getYear() {
			return year;
		}
		@FindBy(xpath="(//div[@role='option'])[8]")
		private WebElement seldate;
		public WebElement getSeldate() {
			return seldate;
		}
		@FindBy(id="subjectsInput")
		private WebElement subject;
		public WebElement getSubject() {
			return subject;
		}
		@FindBy(xpath="(//input[@type='checkbox'])[2]")
		private WebElement radiobutton;
		public WebElement getRadiobutton() {
			return radiobutton;
		}
		@FindBy(xpath="//input[@type='file']")
		private WebElement upload;
		public WebElement getUpload() {
			return upload;
		}
		@FindBy(id="currentAddress")
		private WebElement addresss;
		public WebElement getAddresss() {
			return addresss;
		}
		@FindBy(xpath="(//div[@class=' css-1hwfws3'])[1]")
		private WebElement state;
		public WebElement getState() {
			return state;
		}
		@FindBy(xpath="(//div[@class=' css-1hwfws3'])[2]")
		private WebElement city;
		public WebElement getCity() {
			return city;
		}
		@FindBy(id="submit")
		private WebElement submit;
		public WebElement getSubmit() {
			return submit;
		}
}
