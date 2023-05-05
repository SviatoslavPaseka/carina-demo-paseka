package com.ui_katalogkit.ios.AlertViewsPages.alertWindows;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.AlertSimplePageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.AlertTextEntryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AlertTextEntryPageBase.class)
public class AlertTextEntryPage extends AlertTextEntryPageBase {
    public AlertTextEntryPage(WebDriver driver) {
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

    @FindBy(xpath = "//XCUIElementTypeTextField")
    private ExtendedWebElement textEntry;

    @Override
    public boolean isOpened() {
        return title.isElementPresent(3) && okButton.isElementPresent(3);
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
    public AlertViewsPageBase clickOk(){
        Assert.assertTrue(okButton.isElementPresent());
        okButton.click();
        return initPage(getDriver(), AlertViewsPageBase.class);
    }

    @Override
    public AlertViewsPageBase clickCancel(){
        Assert.assertTrue(cancelButton.isElementPresent());
        cancelButton.click();
        return initPage(getDriver(), AlertViewsPageBase.class);
    }

    @Override
    public void enterText(String value){
        textEntry.type(value);
    }

    @Override
    public String getTextFromTextEntry(){
        return textEntry.getAttribute("value");
    }
}