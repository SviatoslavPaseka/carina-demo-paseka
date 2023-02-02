package com.mfp.android;

import com.mfp.common.MFPLogInPageBase;
import com.mfp.common.UserTutorialPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Properties;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MFPLogInPageBase.class)
public class MFPLogInPage extends MFPLogInPageBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private static final String TEST_DATA_PROPERTIES_FILE = "/Users/sviatoslavpaseka/trialPeriod/carina-demo-paseka/src/main/resources/_testdata.properties";
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
    public void clickLoginButton() {
        loginButton.click();
    }

    @Override
    public UserTutorialPageBase defaultLogin(){
        FileReader reader= null;
        Properties properties = null;
        try {
            reader = new FileReader(TEST_DATA_PROPERTIES_FILE);
            properties = new Properties();
            properties.load(reader);
        } catch (FileNotFoundException ex){
            LOGGER.error(ex.getMessage());
            LOGGER.error("Not found properties file with name: " + TEST_DATA_PROPERTIES_FILE);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            LOGGER.error("Cannot read from properties file: " + TEST_DATA_PROPERTIES_FILE);
        }
        LOGGER.info("Typing email...");
        typeEmail(properties.getProperty("credentials.mfp.email"));
        LOGGER.info("Typing password...");
        typePassword(properties.getProperty("credentials.mfp.password"));

        clickLoginButton();
        return initPage(getDriver(), UserTutorialPageBase.class);
    }

}
