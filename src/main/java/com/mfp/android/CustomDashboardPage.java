package com.mfp.android;

import com.mfp.common.CustomDashboardPageBase;
import com.mfp.common.DiaryPageBase;
import com.mfp.common.enums.CustomDashboardButtons;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomDashboardPageBase.class)
public class CustomDashboardPage extends CustomDashboardPageBase {
    public CustomDashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/%s")
    private ExtendedWebElement optionOfDashboard;

    @FindBy(xpath = "//*[contains(@text, 'Custom Dashboard')]")
    private ExtendedWebElement title;
    @Override
    public boolean isOptionOfDashboardPresent(CustomDashboardButtons customDashboardButtons){
        return optionOfDashboard.format(customDashboardButtons.getButtonId()).isElementPresent();
    }

    @Override
    public AbstractPage clickOnOptionOfDashboardByName(CustomDashboardButtons customDashboardButton){
       optionOfDashboard.format(customDashboardButton.getButtonId()).click();

       return initPage(getDriver(), customDashboardButton.getPageClass());
    }

    @Override
    public boolean isOpened(){
        return title.isElementPresent();
    }

}