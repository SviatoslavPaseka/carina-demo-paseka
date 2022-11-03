package com.qaprosoft.carina.demo.gui.components;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.ForgotPage;

public class LoginMenu extends AbstractUIObject{
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	public LoginMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}

	public LoginMenu(WebDriver driver) {
		super(driver, driver);
	}

	@FindBy(id = "email")
	private ExtendedWebElement emailInput;
	
	@FindBy(id = "upass")
	private ExtendedWebElement passwordInput;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private ExtendedWebElement loginButton;
	
	@FindBy(xpath = "//a[@class='forgot']")
	private ExtendedWebElement forgotPassword;
	
	@FindBy(xpath = "//p[contains(text(), 'Login')]")
	private ExtendedWebElement loginTitle;
	
	public void inputRegistrationDataWithClick(String email, String password) {
		emailInput(email);
		passwordInput(password);
		loginClick();
	}
	
	public void inputRegistrationData(String email, String password) {
		emailInput(email);
		passwordInput(password);
	}
	
	public void passwordInput(String password) {
		LOGGER.info("Enter to email input method");
		passwordInput.type(password);
	}

	public void emailInput(String email) {
		LOGGER.info("Enter to email input method");
		emailInput.type(email);
	}
	
	public void loginClick() {
		loginButton.click();
	}
	
	public ForgotPage forgotPasswordClick() {
		forgotPassword.click();
		return new ForgotPage(driver);
	}

	public ExtendedWebElement getLoginTitle() {
		return loginTitle;
	}

	public ExtendedWebElement getEmailInput() {
		return emailInput;
	}

	public ExtendedWebElement getPasswordInput() {
		return passwordInput;
	}

	public ExtendedWebElement getLoginButton() {
		return loginButton;
	}

	public ExtendedWebElement getForgotPassword() {
		return forgotPassword;
	}
	public void hoverLoginButton() {
		loginButton.hover();
	}
	public String getColorLoginButton() {
		hoverLoginButton();
		return loginButton.getElement().getCssValue("background-color");
	}
	
	public String getValidationMessage() {
		String emailMessage = emailInput.getAttribute("validationMessage");
		String passwordMessage = passwordInput.getAttribute("validationMessage");
		if (emailMessage.isEmpty()) {
			return passwordMessage;
		}
		return emailMessage;
	}
}