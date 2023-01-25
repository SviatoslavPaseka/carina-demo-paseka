package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    private static final Integer TIMEOUT = 8000;
    @FindBy(id = "name")
    private ExtendedWebElement nameInputField;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInputField;

    @FindBy(id = "radio_male")
    private ExtendedWebElement maleRadioBtn;

    @FindBy(id = "radio_female")
    private ExtendedWebElement femaleRadioBtn;

    @FindBy(id = "checkbox")
    private ExtendedWebElement privacyPolicyCheckbox;

    @FindBy(id = "login_button")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeName(String name) {
        nameInputField.type(name);
        hideKeyboard();
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    @Override
    public void selectMaleSex() {
        maleRadioBtn.click();
    }

    @Override
    public void checkPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    @Override
    public CarinaDescriptionPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), CarinaDescriptionPageBase.class);
    }

    @Override
    public boolean isLoginBtnActive() {
        return Boolean.parseBoolean(loginBtn.getAttribute("enabled"));
    }

    @Override
    public CarinaDescriptionPageBase login() {
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);
        typeName(username);
        typePassword(password);
        selectMaleSex();
        checkPrivacyPolicyCheckbox();
        return clickLoginBtn();
    }

    @Override
    public boolean isSpecifiedElementPresent(String nameOfElement) {
        switch (nameOfElement){
            case "nameInputField":
               return nameInputField.isElementPresent();
            case "passwordInputField":
                return passwordInputField.isElementPresent();
            case "radio_male":
                return maleRadioBtn.isElementPresent();
            case "radio_female":
                return femaleRadioBtn.isElementPresent();
            case "checkbox":
                return privacyPolicyCheckbox.isElementPresent();
            case "login_button":
                return loginBtn.isElementPresent();
        }
        return false;
    }

    @Override
    public boolean isSpecifiedSelectorChecked(String nameOfSelector) {
        switch (nameOfSelector){
            case "radio_male":
                return maleRadioBtn.isChecked();
            case "radio_female":
                return femaleRadioBtn.isChecked();
            case "checkbox":
                return privacyPolicyCheckbox.isChecked();
        }
        return false;
    }

    @Override
    public String getTextFromSpecifiedElement(String nameOfElement) {
        switch (nameOfElement){
            case "nameInputField":
                return nameInputField.getText();
            case "passwordInputField":
                return passwordInputField.getText();
        }
        return "";
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return loginBtn.isElementPresent();
    }

    @Override
    public boolean isPageOpened() {
        return this.isPageOpened(TIMEOUT);
    }
}
