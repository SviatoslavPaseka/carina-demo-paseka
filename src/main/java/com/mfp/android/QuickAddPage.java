package com.mfp.android;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.QuickAddPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = QuickAddPageBase.class)
public class QuickAddPage extends QuickAddPageBase {
    public QuickAddPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickCalories")
    private ExtendedWebElement calories;

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickFat")
    private ExtendedWebElement fatField;

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickCarbs")
    private ExtendedWebElement carbohydratesField;

    @FindBy(id = "com.myfitnesspal.android:id/tvQuickProtein")
    private ExtendedWebElement proteinField;

    @FindBy(xpath = "//android.widget.Button[@content-desc='NO THANKS']")
    private ExtendedWebElement failureTrackingTime;

    @Override
    public void typeFat(int value) {
        fatField.type(String.valueOf(value));
    }

    @Override
    public void typeCarbohydrates(int value) {
        carbohydratesField.type(String.valueOf(value));
    }

    @Override
    public void typeProtein(int value) {
        proteinField.type(String.valueOf(value));
    }

    @Override
    public int getCaloriesInteger() {
        return Integer.parseInt(calories.getText());
    }

    @Override
    public boolean isOpened() {
        failureTrackingTime.click();

        return calories.isElementPresent()
                && fatField.isElementPresent()
                && proteinField.isElementPresent();
    }
}