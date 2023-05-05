package com.ui_katalogkit.ios.SearchPages.SearchBarPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.SearchPagesBase.SearchBarPagesBase.CustomSearchBarBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomSearchBarBase.class)
public class CustomSearchBar extends CustomSearchBarBase {

    public CustomSearchBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Custom Search Bar']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Search']")
    private ExtendedWebElement backToSearchPage;

    @FindBy(xpath = "//XCUIElementTypeSearchField")
    private ExtendedWebElement searchField;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='bookmark']")
    private ExtendedWebElement bookmark;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
    private ExtendedWebElement cancelButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Clear text']")
    private ExtendedWebElement clearTextButton;


    @Override
    public boolean isOpened() {
        return pageName.isElementPresent(3);
    }

    @Override
    public SearchPageBase backToSearchPage(){
        backToSearchPage.click();
        return initPage(getDriver(), SearchPageBase.class);
    }

    @Override
    public void typeTextToSearchField(String text){
        searchField.type(text);
    }

    @Override
    public void clickOnBookmark(){
        bookmark.click();
    }
    @Override
    public void clickOnCancelButton(){
        cancelButton.click();
    }

    @Override
    public String getTextCancelButton(){
        return cancelButton.getText();
    }

    @Override
    public boolean isClearTextButtonPresent(){
        return clearTextButton.isElementPresent();
    }

    @Override
    public void clickOnClearTextButton(){
        Assert.assertTrue(isClearTextButtonPresent(), "[DEFAULT SEARCH BAR] Clear text button is not present (cause you don't input any text in search field)");
        clearTextButton.click();
    }
}