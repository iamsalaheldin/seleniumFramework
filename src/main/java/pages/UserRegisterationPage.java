package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase{

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "gender-male")
	WebElement maleGenderRdoBtn;

	@FindBy (id = "FirstName")
	WebElement fnTxtBox;

	@FindBy (id = "LastName")
	WebElement lnTxtbox;

	@FindBy (id = "Email")
	WebElement emailTxtbox;

	@FindBy (id = "Password")
	WebElement passwordTxtBox;

	@FindBy (id = "ConfirmPassword")
	WebElement confirmPasswordTxtBox;

	@FindBy(id = "register-button")
	WebElement registerbtn;
	
	@FindBy (css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.result")
	public WebElement successMessage;
	
	@FindBy(css = "body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")
	public WebElement logoutLink;
	
	@FindBy(linkText = "My account")
	WebElement myAccountLink;


	public void userRegisteration(String firstName , String lastName , String email , String password) {

		clickButton(maleGenderRdoBtn);
		setTextElementText(fnTxtBox, firstName);
		setTextElementText(lnTxtbox, lastName);
		setTextElementText(emailTxtbox, email);
		setTextElementText(passwordTxtBox, password);
		setTextElementText(confirmPasswordTxtBox, password);
		clickButton(registerbtn);
	}
	
	public void userLogout() {
		clickButton(logoutLink);
	}
	
	public void openMyAccountPage() {
		clickButton(myAccountLink);
	}
	
	
}
