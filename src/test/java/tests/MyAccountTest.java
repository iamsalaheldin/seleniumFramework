package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegisterationPage;

public class MyAccountTest extends TestBase{

	HomePage homeObject ; 
	UserRegisterationPage registerObject ; 
	LoginPage loginObject ; 
	MyAccountPage myAccountObject ; 
	String oldPassword = "12345678" ; 
	String newPassword = "123456" ; 
	String firstName = "Moataz" ; 
	String lastName = "Nabil" ; 
	String email = "sds911dd12acwdwsd@gmail.com" ; 


	@Test(priority = 1)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegisterationPage(driver); 
		registerObject.userRegisteration(firstName, lastName, email, oldPassword);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
	}

	@Test(priority = 2)
	public void RegisteredUserCanChangePassword() 
	{
		registerObject.openMyAccountPage();
		myAccountObject = new MyAccountPage(driver) ; 
		myAccountObject.openChangePassword();
		myAccountObject.changePassword(oldPassword, newPassword);
		Assert.assertTrue(myAccountObject.resultMsg.getText().contains("Password was changed"));
		myAccountObject.closeMsg();
	}

	@Test(priority = 3)
	public void RegisteredUserCanLogout() throws InterruptedException 
	{
		//registerObject.userLogout();
		Thread.sleep(3000);
		myAccountObject.userLogout2();
	}

	@Test(priority = 4)
	public void RegisteredUserCanLogin() 
	{
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver); 
		loginObject.userLogin(email, newPassword);
		Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
	}

	@Test(priority = 5)
	public void UserLogout() 
	{
		//registerObject.userLogout();
		myAccountObject.userLogout2();
	}

}
