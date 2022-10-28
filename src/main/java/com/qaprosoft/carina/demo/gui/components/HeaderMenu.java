package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.components.enums.HeaderMenuButtons;
import com.qaprosoft.carina.demo.gui.components.enums.SocialConnectButtons;
import com.qaprosoft.carina.demo.gui.pages.ContactPage;
import com.qaprosoft.carina.demo.gui.pages.CoveragePage;
import com.qaprosoft.carina.demo.gui.pages.DealsPage;
import com.qaprosoft.carina.demo.gui.pages.FeaturedPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.MerchPage;
import com.qaprosoft.carina.demo.gui.pages.NewsPage;
import com.qaprosoft.carina.demo.gui.pages.Phone_FinderPage;
import com.qaprosoft.carina.demo.gui.pages.ReviewsPage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.qaprosoft.carina.demo.gui.pages.VideosPage;

public class HeaderMenu extends AbstractUIObject{
	public HeaderMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	@FindBy(xpath = "//*[@id='menu']/li/a[contains(text(), '%s')]")
	private ExtendedWebElement headerMenuButton;
	
	@FindBy(xpath = "//*[@id='header']/div/div/button")
	private ExtendedWebElement burgerButton;
	
	@FindBy(id = "anchor")
	private ExtendedWebElement homeLinks;
	
	@FindBy(id = "topsearch-text")
	private ExtendedWebElement topsearchInput;
	
	@FindBy(xpath = "//*[@id='quick-search-button']/input[@value='Go']")
	private ExtendedWebElement topsearchButton;
	
	@FindBy(xpath = "//*[@id='social-connect']/a[%s]")
	private ExtendedWebElement socialConnectButton;
	
	 //next task: create headerMenuButtonsFACTORY
	public AbstractUIObject clickHeaderMenuButton(HeaderMenuButtons menuButtons) {
		headerMenuButton.format(menuButtons.getValue()).click();
		AbstractUIObject uiObject;
		switch (menuButtons) {
		case HOME:
			uiObject = new HomePage(driver);
//			uiObject.open();
			break;
		case NEWS:
			uiObject = new NewsPage(driver);
			break;
		case REVIEWS:
			uiObject = new ReviewsPage(driver);
			break;
		case VIDEOS:
			uiObject = new VideosPage(driver);
			break;
		case FEATURED:
			uiObject = new FeaturedPage(driver);
			break;
		case PHONE_FINDER:
			uiObject = new Phone_FinderPage(driver);
			break;
		case DEALS:
			uiObject = new DealsPage(driver);
			break;
		case MERCH:
			uiObject = new MerchPage(driver);
			break;
		case COVARAGE:
			uiObject = new CoveragePage(driver);
			break;
		case CONTACT:
			uiObject = new ContactPage(driver);
			break;
		default:
			uiObject = null;
			break;
		}
		return uiObject;
	}
	
	public void clickSocialConnectButton(SocialConnectButtons socialConnectButtons) {
		socialConnectButton.format(socialConnectButtons.getNumber()).click();
	}
	public LoginMenu openLoginForm() {
		socialConnectButton.format(SocialConnectButtons.LOGIN.getNumber()).click();
		return new LoginMenu(driver);
	}
	
	public boolean isLoginFormOpened() {
		return socialConnectButton.format(SocialConnectButtons.LOGIN.getNumber()).isVisible();
	}
	public SignUpPage openSignupPage() {
		socialConnectButton.format(SocialConnectButtons.SIGNUP.getNumber()).click();
		return new SignUpPage(driver);
	}
	public ExtendedWebElement getBurgerButton() {
		return burgerButton;
	}
}