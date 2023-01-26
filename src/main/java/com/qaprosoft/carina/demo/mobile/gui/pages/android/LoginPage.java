package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.demo.mobile.gui.pages.common.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    private  static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
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
    public void selectSex(Sex sex) {
        if (sex == Sex.MALE){
            maleRadioBtn.click();
        }else{
            femaleRadioBtn.click();
        }
    }

    @Override
    public void checkPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    @Override
    public WebViewPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), WebViewPageBase.class);
    }

    @Override
    public boolean isLoginBtnActive() {
        return Boolean.parseBoolean(loginBtn.getAttribute("enabled"));
    }

    @Override
    public WebViewPageBase login() {
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);
        typeName(username);
        typePassword(password);
        selectSex(Sex.MALE);
        checkPrivacyPolicyCheckbox();
        return clickLoginBtn();
    }

    @Override
    public  boolean isInputFieldPresent(InputField inputField){
        if (inputField == InputField.NAME) {
            return nameInputField.isElementPresent();
        } else if (inputField == InputField.PASSWORD) {
            return passwordInputField.isElementPresent();
        }else {
            throw new IllegalArgumentException("NO argument of type 'InputField' was passed to the method - 'isInputFieldPresent'");
        }
    }
    @Override
    public boolean isSexRadioButtonPresent(Sex sex){
        if (sex == Sex.MALE){
            return maleRadioBtn.isElementPresent();
        } else if (sex == Sex.FEMALE) {
            return femaleRadioBtn.isElementPresent();
        }else{
            throw new IllegalArgumentException("NO argument of type 'Sex' was passed to the method - 'isSexTooglePresent'");
        }
    }

    @Override
    public boolean isPrivacyPolicyCheckboxPresent(){
        return privacyPolicyCheckbox.isElementPresent();
    }
    @Override
    public boolean isLoginButtonPresent(){
        return loginBtn.isElementPresent();
    }

    @Override
    public boolean isSexRadioButtonChecked(Sex sex) {
        if (sex == Sex.MALE){
            return maleRadioBtn.isChecked();
        } else if (sex == Sex.FEMALE) {
            return femaleRadioBtn.isChecked();
        }else{
            throw new IllegalArgumentException("NO argument of type 'Sex' was passed to the method - 'isSexChecked'");
        }
    }
    @Override
    public boolean isPrivacyPolicyCheckboxChecked(){
        return privacyPolicyCheckbox.isChecked();
    }
    @Override
    public String getTextInputField(InputField inputField) {
        if (inputField == InputField.NAME) {
            return nameInputField.getText();
        } else if (inputField == InputField.PASSWORD) {
            return passwordInputField.getText();
        }else {
            throw new IllegalArgumentException("NO argument of type 'InputField' was passed to the method - 'getTextInputField'");
        }
    }

    @Override
    public boolean isPageOpened(long timeout) {
        return loginBtn.isElementPresent();
    }

    @Override
    public boolean isPageOpened() {
        return isPageOpened(TIMEOUT);
    }
}