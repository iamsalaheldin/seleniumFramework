package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (linkText = "Change password")
	WebElement changePasswordLink;
	
	@FindBy(id = "OldPassword")
	WebElement oldPasswordTxt;
	
	@FindBy(id = "NewPassword")
	WebElement newPasswordTxt;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement confirmNewPasswordTxt;
	
	@FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > form > div.buttons > button")
	WebElement changePasswordBtn;
	
	@FindBy(css = "#bar-notification > div > p")
	public WebElement resultMsg;
	
	@FindBy(css = "#bar-notification > div > span")
	WebElement closeMsg;
	
	@FindBy(linkText = "Log out")
	public WebElement logoutLink2;

	public void openChangePassword() {
		clickButton(changePasswordLink);
	}
	
	public void changePassword(String oldPassword , String newPassword) {
		setTextElementText(oldPasswordTxt, oldPassword);
		setTextElementText(newPasswordTxt, newPassword);
		setTextElementText(confirmNewPasswordTxt, newPassword);
		clickButton(changePasswordBtn);
	}
	
	public void closeMsg() {
		clickButton(closeMsg);
	}
	
	public void userLogout2() {
		clickButton(logoutLink2);
	}
}
