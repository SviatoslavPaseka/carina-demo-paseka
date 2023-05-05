package com.ui_katalogkit.ios.AlertViewsPages.alertWindows;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.AlertConfirmCancelPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.AlertDestructivePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AlertDestructivePageBase.class)
public class AlertDestructivePage extends AlertDestructivePageBase {
    public AlertDestructivePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='A message should be a short, complete sentence.']")
    private ExtendedWebElement message;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Destructive Choice']")
    private ExtendedWebElement destructiveButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Safe Choice']")
    private ExtendedWebElement safeButton;

    @Override
    public boolean isOpened() {
        return message.isElementPresent(3) && destructiveButton.isElementPresent(3);
    }

    @Override
    public AlertViewsPageBase clickDestructiveButton(){
        Assert.assertTrue(destructiveButton.isElementPresent());
        destructiveButton.click();
        return initPage(getDriver(), AlertViewsPageBase.class);
    }

    @Override
    public AlertViewsPageBase clickSafeButton(){
        Assert.assertTrue(safeButton.isElementPresent());
        safeButton.click();
        return initPage(getDriver(), AlertViewsPageBase.class);
    }

    @Override
    public String getMessageText(){
        return message.getText();
    }
}
