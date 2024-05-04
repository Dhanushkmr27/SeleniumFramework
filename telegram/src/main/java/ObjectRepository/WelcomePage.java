package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	
	}
		@FindBy(linkText = "Register")
		private WebElement registerLink;
		
		@FindBy(linkText = "Log in")
		private WebElement LoginLink;
		
		@FindBy(partialLinkText = "Books")
		private WebElement BooksLink;
		
		@FindBy(partialLinkText = "Computers")
		private WebElement ComputersLink;
		
		@FindBy(partialLinkText = "Apparel & Shoes")
		private WebElement ApparelandShoesLink;
		
		@FindBy(partialLinkText = "Electronics")
		private WebElement ElectronicsLink;
		
		@FindBy(partialLinkText = "Shopping cart")
		private WebElement ShoppingCartLink;
		
		@FindBy(partialLinkText = "Wishlist")
		private WebElement WishlistLink;
		
		@FindBy(id = "small-searchterms")
		private WebElement SearchBoxFieldlink;
		
		@FindBy(partialLinkText = "Digital downloads")
		private WebElement DigitalDownloadsLink;
		
		@FindBy(partialLinkText = "Jewelry")
		private WebElement JewelryLink;
		
		
		public WebElement getShoppingCartLink() {
			return ShoppingCartLink;
		}

		public WebElement getWishlistLink() {
			return WishlistLink;
		}

		public WebElement getSearchBoxFieldlink() {
			return SearchBoxFieldlink;
		}

		public WebElement getDigitalDownloadsLink() {
			return DigitalDownloadsLink;
		}

		public WebElement getJewelryLink() {
			return JewelryLink;
		}

		public WebElement getComputersLink() {
			return ComputersLink;
		}

		public WebElement getApparelandShoesLink() {
			return ApparelandShoesLink;
		}

		public WebElement getElectronicsLink() {
			return ElectronicsLink;
		}

		public WebElement getRegisterLink() {
			return registerLink;
		}

		public WebElement getLoginLink() {
			return LoginLink;
		}

		public WebElement getBooksLink() {
			return BooksLink;
		}
	}
