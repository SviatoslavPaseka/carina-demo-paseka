package com.ui_katalogkit.ios.AlertViewsPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.enums.AlertPageDescriptionTexts;
import com.ui_katalogkit.common.AlertViewsPagesBase.enums.AlertViewsItem;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AlertViewsPageBase.class)
public class AlertViewsPage extends AlertViewsPageBase {
    public AlertViewsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Views']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement descriptionText;

    @FindBy(id = "%s")
    private ExtendedWebElement alertViewItem;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getDescriptionText(AlertPageDescriptionTexts descriptionTexts){
        return descriptionText.format(descriptionTexts.getValue()).getText();
    }

    @Override
    public ParentPageBase tapAlertViewItem(AlertViewsItem itemName){
        alertViewItem.format(itemName.getValue()).click();
        return initPage(getDriver(), itemName.getItemClass());
    }
}