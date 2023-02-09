package com.mfp.android;

import com.mfp.common.CustomSummaryPageBase;
import com.mfp.common.DiaryPageBase;
import com.mfp.common.enums.CheckingCheckbox;
import com.mfp.common.enums.NutrientsCustomSummary;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase implements IMobileUtils{

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/cb%s")
    private ExtendedWebElement nutrientCheckbox;

    @FindBy(xpath = "//*[@content-desc = 'Done']")
    private ExtendedWebElement acceptButton;

    @FindBy(xpath = "//*[contains(@text, 'Custom Summary')]")
    private ExtendedWebElement title;

    @FindBy(id = "com.myfitnesspal.android:id/tvNutrientSelected")
    private ExtendedWebElement selectedInfo;
    @Override
    public boolean isNutrientCheckboxChecked(NutrientsCustomSummary nutrientCustomSummary){
        swipe(nutrientCheckbox.format(nutrientCustomSummary.getButtonId()), Direction.VERTICAL, 2, 1000);
        return nutrientCheckbox.format(nutrientCustomSummary.getButtonId()).isChecked();
    }

    @Override
    public void checkNutrientCheckbox(NutrientsCustomSummary nutrientCustomSummary, CheckingCheckbox checkingCheckbox){
        swipe(nutrientCheckbox.format(nutrientCustomSummary.getButtonId()), Direction.VERTICAL, 2, 1000);
        if (checkingCheckbox == CheckingCheckbox.CHECK){
            LOGGER.info("Checkbox with name: " + nutrientCustomSummary.name().toLowerCase() + " is checked");
            nutrientCheckbox.format(nutrientCustomSummary.getButtonId()).check();
        }else {
            LOGGER.info("Checkbox with name: " + nutrientCustomSummary.name().toLowerCase() + " is unchecked");
            nutrientCheckbox.format(nutrientCustomSummary.getButtonId()).uncheck();
        }
    }

    @Override
    public DiaryPageBase clickAcceptButton(){
        acceptButton.click();
        return initPage(getDriver(), DiaryPageBase.class);
    }

    @Override
    public boolean isAcceptButtonEnabled(){
        return Boolean.parseBoolean(acceptButton.getAttribute("enabled"));
    }
    @Override
    public boolean isOpened(){
        return title.isElementPresent()
                && acceptButton.isElementPresent();
    }

    @Override
    public String getTextFromSelectedInfo(){
        swipe(selectedInfo, Direction.DOWN, 2, 1000);
        return selectedInfo.getText().trim();
    }
}