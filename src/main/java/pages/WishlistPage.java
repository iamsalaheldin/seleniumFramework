package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageBase
{
	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (css = "td.product")
    public WebElement productCell;
    
    @FindBy(css = "h1")
    public WebElement wishlistHeader;
   
 
    
    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.wishlist-content > form > div.table-wrapper > table > tbody > tr > td.remove-from-cart > button")
    private WebElement removefromCartCheck;
   
    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div")
    public WebElement EmptyCartLbl;
   
    public void removeProductFromWishlist() {
        clickButton(removefromCartCheck);
       
    }
}
