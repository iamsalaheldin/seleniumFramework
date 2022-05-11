package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase
{
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "updatecart")
	WebElement removeCheck;

	@FindBy(xpath = "//*[@id=\"updatecart\"]")
	WebElement updateCartBtn;

	@FindBy(id = "itemquantity11233")
	public WebElement quantityTxt;

	@FindBy(css = "#shopping-cart-form > div.table-wrapper > table > tbody > tr > td.subtotal > span")
	public WebElement totalLbl;


	@FindBy(id="checkout")
	WebElement checkoutBtn ; 

	@FindBy(id="termsofservice")
	WebElement agreeCheckbox; 

	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.new-wrapper.checkout-as-guest-or-register-block > div.buttons > button.button-1.checkout-as-guest-button")
	WebElement guestCheckoutBtn ; 

	public void RemoveProductFromCart() {
		clickButton(removeCheck);
		//clickButton(updateCartBtn);
	}

	public void UpdateProductQuantityInCart(String quantity) {
		//clear quantity textbox
		clearText(quantityTxt);
		setTextElementText(quantityTxt, quantity);
		clickButton(updateCartBtn);
	}

	public void openCheckoutPage() 
	{
		clickButton(agreeCheckbox);
		clickButton(checkoutBtn);
	}

	public void openCheckoutPageAsGuest() 
	{
		clickButton(agreeCheckbox);
		clickButton(checkoutBtn);
		clickButton(guestCheckoutBtn);
	}
}

