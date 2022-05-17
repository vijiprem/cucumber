package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPojo extends Utility {
	public HotelPojo() {
		PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	@FindBy(id="login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="location")
	private WebElement selcountry;
	public WebElement getSelcountry() {
		return selcountry;
	}
	@FindBy(id="hotels")
	private WebElement selhotel;
	public WebElement getSelhotel() {
		return selhotel;
	}
	@FindBy(id="room_type")
	private WebElement selroom;
	public WebElement getSelroom() {
		return selroom;
	}
	@FindBy(id="room_nos")
	private WebElement selnumroom;
	public WebElement getSelnumroom() {
		return selnumroom;
	}
	@FindBy(id="datepick_in")
	private WebElement dateinsel;
	public WebElement getDateinsel() {
		return dateinsel;
	}
	@FindBy(id="datepick_out")
	private WebElement seldateout;
	public WebElement getSeldateout() {
		return seldateout;
	}
	@FindBy(id="adult_room")
	private WebElement seladult;
	public WebElement getSeladult() {
		return seladult;
	}
	@FindBy(id="child_room")
	private WebElement selchild;
	public WebElement getSelchild() {
		return selchild;
	}
	@FindBy(id="Submit")
	private WebElement selsearchsubmit;
	public WebElement getSelsearchsubmit() {
		return selsearchsubmit;
	}
	@FindBy(id="radiobutton_0")
	private WebElement selradiobutton;
	public WebElement getSelradiobutton() {
		return selradiobutton;
	}
	@FindBy(id="continue")
	private WebElement selcontinue;
	public WebElement getSelcontinue() {
		return selcontinue;
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(id="last_name")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(id="address")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(id="cc_num")
	private WebElement creditcardnum;
	public WebElement getCreditcardnum() {
		return creditcardnum;
	}
	@FindBy(id="cc_type")
	private WebElement cardtype;
	public WebElement getCardtype() {
		return cardtype;
	}
	@FindBy(id="cc_exp_month")
	private WebElement selmon;
	public WebElement getSelmon() {
		return selmon;
	}
	@FindBy(id="cc_exp_year")
	private WebElement selyear;
	public WebElement getSelyear() {
		return selyear;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement selcvvnum;
	public WebElement getSelcvvnum() {
		return selcvvnum;
	}
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(id="order_no")
	private WebElement ordernum;
	public WebElement getOrdernum() {
		return ordernum;
	}


}
