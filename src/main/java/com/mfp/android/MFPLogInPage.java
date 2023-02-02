package com.mfp.android;

import com.mfp.common.MFPLogInPageBase;
import com.mfp.common.MFPWelcomePageBase;
import com.mfp.common.UserTutorialPageBase;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MFPLogInPageBase.class)
public class MFPLogInPage extends MFPLogInPageBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(id = "com.myfitnesspal.android:id/email_address_edit")
    private ExtendedWebElement emailAdressField;

    @FindBy(id = "com.myfitnesspal.android:id/password_edit")
    private ExtendedWebElement passwordField;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement loginButton;

    public MFPLogInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeEmail(String email) {
        emailAdressField.type(email);
    }

    @Override
    public void typePassword(String password) {
        passwordField.type(password);
    }

    @Override
    public UserTutorialPageBase clickLoginButton() {
        loginButton.click();
        return initPage(getDriver(), UserTutorialPageBase.class);
    }

    @Override
    public UserTutorialPageBase defaultLogin(){
        return login(R.TESTDATA.get("credentials.mfp.email"),
                    R.TESTDATA.get("credentials.mfp.password"));
    }

    @Override
    public UserTutorialPageBase login(String email, String password){
        MFPWelcomePageBase welcomePage = initPage(getDriver(), MFPWelcomePageBase.class);
        welcomePage.assertPageOpened();
        MFPLogInPageBase logInPage = welcomePage.clickLoginButton();
        logInPage.assertPageOpened();

        typeEmail(email);
        typePassword(password);
        return logInPage.clickLoginButton();
    }

    @Override
    public boolean isOpened(){
        return emailAdressField.isElementPresent()
                && passwordField.isElementPresent()
                && loginButton.isElementPresent();
    }
}