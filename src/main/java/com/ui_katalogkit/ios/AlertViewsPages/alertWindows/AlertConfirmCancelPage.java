package com.ui_katalogkit.ios.AlertViewsPages.alertWindows;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.AlertConfirmCancelPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AlertConfirmCancelPageBase.class)
public class AlertConfirmCancelPage extends AlertConfirmCancelPageBase {
    public AlertConfirmCancelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='A message should be a short, complete sentence.']")
    private ExtendedWebElement message;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Confirm']")
    private ExtendedWebElement confirmButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
    private ExtendedWebElement cancelButton;

    @Override
    public boolean isOpened() {
        return message.isElementPresent(3) && confirmButton.isElementPresent(3);
    }

    @Override
    public AlertViewsPageBase clickCancel(){
        Assert.assertTrue(cancelButton.isElementPresent());
        cancelButton.click();
        return initPage(getDriver(), AlertViewsPageBase.class);
    }

    @Override
    public AlertViewsPageBase clickConfirm(){
        Assert.assertTrue(confirmButton.isElementPresent());
        confirmButton.click();
        return initPage(getDriver(), AlertViewsPageBase.class);
    }

    @Override
    public String getMessageText(){
        return message.getText();
    }
}