package com.mfp.ios;

import com.mfp.common.CustomSummaryPageBase;
import com.mfp.common.DiaryPageBase;
import com.mfp.common.enums.CheckingCheckbox;
import com.mfp.common.enums.NutrientsCustomSummary;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase implements IMobileUtils{
    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isNutrientCheckboxChecked(NutrientsCustomSummary nutrientCustomSummary){
        throw new NotImplementedException();
    }

    @Override
    public void checkNutrientCheckbox(NutrientsCustomSummary nutrientCustomSummary, CheckingCheckbox checkingCheckbox){
        throw new NotImplementedException();
    }

    @Override
    public DiaryPageBase clickAcceptButton(){
        throw new NotImplementedException();
    }

    @Override
    public boolean isAcceptButtonEnabled(){
        throw new NotImplementedException();
    }
    @Override
    public boolean isOpened(){
        throw new NotImplementedException();
    }

    @Override
    public String getTextFromSelectedInfo(){
        throw new NotImplementedException();
    }
}