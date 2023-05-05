package com.ui_katalogkit.ios.AlertViewsPages.alertWindows;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.AlertOtherPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.AlertSecureTextEntryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.lang.invoke.MethodHandles;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AlertSecureTextEntryPageBase.class)
public class AlertSecureTextEntryPage extends AlertSecureTextEntryPageBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public AlertSecureTextEntryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='A Short Title Is Best']")
    private ExtendedWebElement title;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='A message should be a short, complete sentence.']")
    private ExtendedWebElement message;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
    private ExtendedWebElement cancelButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='OK']")
    private ExtendedWebElement okButton;

    @FindBy(xpath = "//XCUIElementTypeSecureTextField")
    private ExtendedWebElement secureTextEntry;

    @Override
    public boolean isOpened() {
        return title.isElementPresent(3) && okButton.isElementPresent();
    }

    @Override
    public String getTitleText(){
        return title.getText();
    }

    @Override
    public String getMessageText(){
        return message.getText();
    }

    @Override
    public boolean isOkButtonEnabled(){
        return Boolean.parseBoolean(okButton.getAttribute("enabled"));
    }

    @Override
    public AlertViewsPageBase clickOk(){
        Assert.assertTrue(okButton.isElementPresent());
        if (isOkButtonEnabled()){
            okButton.click();
            return initPage(getDriver(), AlertViewsPageBase.class);
        }else {
            LOGGER.warn("[ALERT SECURE TEXT ENTRY] OK button is not enabled (It can be because you don't input text to field)");
            return null;
        }
    }

    @Override
    public AlertViewsPageBase clickCancel(){
        Assert.assertTrue(cancelButton.isElementPresent());
        cancelButton.click();
        return initPage(getDriver(), AlertViewsPageBase.class);
    }

    @Override
    public void enterText(String value){
        secureTextEntry.type(value);
    }

    @Override
    public String getTextFromTextEntry(){
        return secureTextEntry.getAttribute("value");
    }
}