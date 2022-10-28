package com.qaprosoft.carina.demo.gui.pages;

import java.lang.invoke.MethodHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;

public class SignUpPage extends AbstractPage {
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@FindBy(id = "header")
	private HeaderMenu headerMenu;

	@FindBy(id = "footmenu")
	private FooterMenu footerMenu;

	@FindBy(id = "uname")
	private ExtendedWebElement nicknameInput;
	// change * to tag
	@FindBy(xpath = "//*[@id='udata-f']/input[@id='email']")
	private ExtendedWebElement emailInput;

	@FindBy(xpath = "//*[@id='frmOpin']/input[@id='upass']")
	private ExtendedWebElement passwordTextField;

	@FindBy(xpath = "//*[@for='iagree1']")
	private ExtendedWebElement storeDataAgreement;

	@FindBy(xpath = "//*[@for='iagree2']")
	private ExtendedWebElement ageAgreement;

	@FindBy(xpath = "//*[@id='ucsubmit-f']/*[@id='nick-submit']")
	private ExtendedWebElement submit;

	@FindBy(xpath = "//div[@class='normal-text res-success']")
	private ExtendedWebElement registrasionConfirming;

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public void inputRegistrationData(String nickname, String email, String password) {// registerNewAcc
		nicknameInput(nickname);

		emailInput(email);

		passwordInput(password);

		LOGGER.info("Trying to check 1-st checkbox");
		storeDataAgreement.check();
		LOGGER.info("Trying to check 2-nd checkbox");
		ageAgreement.check();
		// add submit click
	}

	public void passwordInput(String password) {// change input to type
		LOGGER.info("Enter to password input method");
		passwordTextField.type(password);
	}

	public void emailInput(String email) {
		LOGGER.info("Enter to email input method");
		emailInput.type(email);
	}

	public void nicknameInput(String nickname) {
		LOGGER.info("Enter to nickname input method");
		nicknameInput.type(nickname);
		;
	}

	public boolean isSubmitButtonClickable() {
		return submit.isClickable();
	}

	public void clickSubmit() {
		submit.click();
	}

	public boolean isConfirmationPresent() {
		return registrasionConfirming.isPresent();
	}
}
