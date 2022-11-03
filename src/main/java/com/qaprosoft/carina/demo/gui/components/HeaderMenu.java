package com.qaprosoft.carina.demo.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.components.enums.HeaderMenuButtons;
import com.qaprosoft.carina.demo.gui.components.enums.SocialConnectButtons;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.qaprosoft.carina.demo.utils.HeaderElementFactory;

public class HeaderMenu extends AbstractUIObject{
	public HeaderMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	@FindBy(xpath = "//ul[@id='menu']/li/a[contains(text(), '%s')]")
	private ExtendedWebElement headerMenuButton;
	
	@FindBy(xpath = "//header[@id='header']/div/div/button")
	private ExtendedWebElement burgerButton;
	
	@FindBy(id = "anchor")
	private ExtendedWebElement homeLinks;
	
	@FindBy(id = "topsearch-text")
	private ExtendedWebElement topsearchInput;
	
	@FindBy(xpath = "//span[@id='quick-search-button']/input[@value='Go']")
	private ExtendedWebElement topsearchButton;
	
	@FindBy(xpath = "//div[@id='social-connect']/a[%s]")
	private ExtendedWebElement socialConnectButton;
	
	 //next task: create headerMenuButtonsFACTORY
	public AbstractPage clickHeaderMenuButton(HeaderMenuButtons menuButtons) {
		headerMenuButton.format(menuButtons.getValue()).click();
		return HeaderElementFactory.getPage(driver, menuButtons);
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