package com.mfp.ios;

import com.mfp.common.*;
import com.mfp.common.constants.IConstants;
import com.mfp.common.enums.BottomBarButton;
import com.mfp.common.enums.NameOfMealDiary;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {
    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened(){
        throw new NotImplementedException();
    }


    @Override
    public Integer getGoalCaloriesInteger(){
        throw new NotImplementedException();
    }

    @Override
    public Integer getRemainingCaloriesInteger(){
        throw new NotImplementedException();
    }

    /*
    * This method clears all entries in the user's diary.
    * BUT if user's diary is already clear,
    * the method will not clear anything
     */
    @Override
    public DiaryPageBase clearUserDiary(){
        throw new NotImplementedException();
    }

    @Override
    public boolean isMoreButtonByNamePresent(NameOfMealDiary nameOfMealDiary) {
        throw new NotImplementedException();
    }

    @Override
    public MoreMenuPageBase clickMoreButtonByName(NameOfMealDiary nameOfMealDiary) {
        throw new NotImplementedException();
    }

    @Override
    public boolean isMoreOptionsForDashboardPresent(){
        throw new NotImplementedException();
    }

    @Override
    public CustomDashboardPageBase clickMoreOptionsForDashboard(){
        throw new NotImplementedException();
    }
}