package com.mfp.android;

import com.mfp.common.CustomSummaryPageBase;
import com.mfp.common.DiaryPageBase;
import com.mfp.common.enums.NutrientsCustomSummary;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase implements IMobileUtils{
    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/cb%s")
    private ExtendedWebElement nutrientCheckbox;

    @FindBy(xpath = "//*[@content-desc = 'Done']")
    private ExtendedWebElement acceptButton;

    @FindBy(xpath = "//*[contains(@text, 'Custom Summary')]")
    private ExtendedWebElement title;
    @Override
    public boolean isNutrientCheckboxChecked(NutrientsCustomSummary nutrientCustomSummary){
        swipe(nutrientCheckbox.format(nutrientCustomSummary.getButtonId()));
        return nutrientCheckbox.format(nutrientCustomSummary.getButtonId()).isChecked();
    }

    @Override
    public DiaryPageBase clickAcceptButton(){

        acceptButton.click();
        return initPage(getDriver(), DiaryPageBase.class);
    }

    @Override
    public boolean isOpened(){
        return title.isElementPresent()
                && acceptButton.isElementPresent();
    }
}
