package com.mfp.android;

import com.mfp.common.DeleteModalWindowPageBase;
import com.mfp.common.DiaryPageBase;
import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.QuickAddPageBase;
import com.mfp.common.constants.IConstants;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

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

    @FindBy(xpath = "(//android.widget.Button[@resource-id='com.myfitnesspal.android:id/more'])[1]")
    private ExtendedWebElement moreButtonInBreakFast;

    @FindBy(xpath = "//android.widget.TextView[@text='Quick Add']/..")
    private ExtendedWebElement quickAddButton;

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
    * BUT if user's diary is already clear (also exercise and water),
    * the method will not clear anything,
    * because there will be no edit diary button on the page
     */
    @Override
    public void clearUserDiary(){

        if (editActionButton.isElementNotPresent(IConstants.FIVE_SECONDS)){
            return;
        }

        Assert.assertTrue(editActionButton.isElementPresent(), "[DIARY PAGE] edit diary button is not present");
        editActionButton.click();

        Assert.assertTrue(selectAll.isElementPresent(), "[DIARY PAGE] select all checkbox is not present on edition mode after taping on edit diary button");
        selectAll.check();

        Assert.assertTrue(deleteButton.isElementPresent(), "[DIARY PAGE] delete button is not present on edition mode after taping on edit diary button");
        deleteButton.click();

        initPage(getDriver(), DeleteModalWindowPageBase.class).accessDelete();
    }

    @Override
    public boolean isBreakfastMoreButtonPresent() {
        return moreButtonInBreakFast.isElementPresent();
    }

    @Override
    public boolean isQuickAddButtonPresent() {
        return quickAddButton.isElementPresent();
    }

    @Override
    public void clickBreakfastMoreButton() {
        moreButtonInBreakFast.click();
    }

    @Override
    public QuickAddPageBase clickQuickAddButton() {
        quickAddButton.click();
        return initPage(getDriver(), QuickAddPageBase.class);
    }
}