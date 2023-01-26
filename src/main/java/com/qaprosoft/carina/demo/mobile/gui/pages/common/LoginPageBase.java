package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoginPageBase extends AbstractPage {

	public LoginPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract void typeName(String name);

	public abstract void typePassword(String password);

	public abstract void selectSex(Sex sex);

	public abstract void checkPrivacyPolicyCheckbox();

	public abstract WebViewPageBase clickLoginBtn();

	public abstract boolean isLoginBtnActive();

	public abstract WebViewPageBase defaultLogin();

	public abstract boolean isSexRadioButtonChecked(Sex sex);

	public abstract String getTextInputField(InputField inputField);
	public abstract boolean isPrivacyPolicyCheckboxPresent();
	public abstract boolean isLoginButtonPresent();

	public abstract boolean isSexRadioButtonPresent(Sex sex);

	public abstract boolean isInputFieldPresent(InputField inputField);
	public abstract boolean isPrivacyPolicyCheckboxChecked();
}