package com.mfp.android;

import com.mfp.common.*;
import com.mfp.common.constants.IConstants;
import com.mfp.common.enums.BottomBarButton;
import com.mfp.common.enums.NameOfMealDiary;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public DiaryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']" +
            "/child::*[contains(@text, '%s')]")
    private ExtendedWebElement title;

    @FindBy(id = "com.myfitnesspal.android:id/goal")
    private ExtendedWebElement goalCalories;

    @FindBy(id = "com.myfitnesspal.android:id/remaining_diary")
    private ExtendedWebElement remainingCalories;

    @FindBy(id = "com.myfitnesspal.android:id/edit_action_item")
    private ExtendedWebElement editActionButton;

    @FindBy(id = "com.myfitnesspal.android:id/select_all")
    private ExtendedWebElement selectAll;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Delete']")
    private ExtendedWebElement deleteButton;

    @FindBy(xpath = "//*[@text = '%s']/parent::*/parent::*/following-sibling::*[1]/descendant::*/*[@resource-id = 'com.myfitnesspal.android:id/more']")
    private ExtendedWebElement moreButtonByName;

    @FindBy(xpath = "//*[contains(@text, 'Nutrients Remaining')]/following-sibling::*")
    private ExtendedWebElement moreOptionsForDashboard;

    @Override
    public boolean isOpened(){
        return title.format(BottomBarButton.DIARY.getValueInId()).isElementPresent()
                && !initPage(getDriver(), MFPCommonPageBase.class)
                .getBottomNavigationBar().isBottomNavBarClickable(BottomBarButton.DIARY);
    }


    @Override
    public Integer getGoalCaloriesInteger(){
        return Integer.parseInt(StringUtils.remove(goalCalories.getText(), ','));
    }

    @Override
    public Integer getRemainingCaloriesInteger(){
        return Integer.parseInt(StringUtils.remove(remainingCalories.getText(), ','));
    }

    /*
    * This method clears all entries in the user's diary.
    * BUT if user's diary is already clear,
    * the method will not clear anything
     */
    @Override
    public DiaryPageBase clearUserDiary(){

        if (editActionButton.isElementNotPresent(IConstants.FIVE_SECONDS)){
            LOGGER.info("Method didn't clear anything, because diary is already clear");
            return initPage(getDriver(), DiaryPageBase.class);
        }

        Assert.assertTrue(editActionButton.isElementPresent(), "[DIARY PAGE] edit diary button is not present");
        editActionButton.click();

        Assert.assertTrue(selectAll.isElementPresent(), "[DIARY PAGE] select all checkbox is not present on edition mode after taping on edit diary button");
        selectAll.check();

        Assert.assertTrue(deleteButton.isElementPresent(), "[DIARY PAGE] delete button is not present on edition mode after taping on edit diary button");
        deleteButton.click();

        return initPage(getDriver(), DeleteModalWindowPageBase.class).clickDeleteButton();
    }

    @Override
    public boolean isMoreButtonByNamePresent(NameOfMealDiary nameOfMealDiary) {
        return moreButtonByName.format(nameOfMealDiary.getValue()).isElementPresent();
    }

    @Override
    public MoreMenuPageBase clickMoreButtonByName(NameOfMealDiary nameOfMealDiary) {
        Assert.assertTrue(isMoreButtonByNamePresent(nameOfMealDiary), "[DIARY] MoreButton is not present after taping on "+ nameOfMealDiary.getValue() + " more");
        moreButtonByName.format(nameOfMealDiary.getValue()).click();
        return initPage(getDriver(), MoreMenuPageBase.class);
    }

    @Override
    public boolean isMoreOptionsForDashboardPresent(){
        return moreOptionsForDashboard.isElementPresent();
    }

    @Override
    public CustomDashboardPageBase clickMoreOptionsForDashboard(){
        moreOptionsForDashboard.click();
        return initPage(getDriver(), CustomDashboardPageBase.class);
    }
}