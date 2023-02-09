package com.mfp.ios;

import com.mfp.common.QuickAddPageBase;
import com.mfp.common.enums.NutrientsQuickAdd;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = QuickAddPageBase.class)
public class QuickAddPage extends QuickAddPageBase implements IMobileUtils{
    public QuickAddPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeNutrient(int value, NutrientsQuickAdd nutrient) {
        throw new NotImplementedException();
    }

    @Override
    public int getCalories() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isOpened() {
        throw new NotImplementedException();
    }
}