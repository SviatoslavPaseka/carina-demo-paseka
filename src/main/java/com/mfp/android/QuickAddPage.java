package com.mfp.android;

import com.mfp.common.QuickAddPageBase;
import com.mfp.common.enums.NutrientsQuickAdd;
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

    @FindBy(id = "com.myfitnesspal.android:id/tvQuick" + "%s")
    private ExtendedWebElement nutrientField;

    @FindBy(xpath = "//android.widget.Button[@content-desc='NO THANKS']")
    private ExtendedWebElement failureTrackingTime;

    @Override
    public void typeNutrient(int value, NutrientsQuickAdd nutrientsQuickAdd) {
        nutrientField.format(nutrientsQuickAdd.getNameInDOMId()).type(String.valueOf(value));
    }

    @Override
    public int getCaloriesInteger() {
        return Integer.parseInt(calories.getText());
    }

    @Override
    public boolean isOpened() {
        failureTrackingTime.click();

        return calories.isElementPresent()
                && nutrientField.format(NutrientsQuickAdd.FAT.getNameInDOMId()).isElementPresent();
    }
}