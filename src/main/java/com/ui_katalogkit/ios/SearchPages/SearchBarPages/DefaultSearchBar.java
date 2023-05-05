package com.ui_katalogkit.ios.SearchPages.SearchBarPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.SearchPagesBase.SearchBarPagesBase.DefaultSearchBarBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchPageBase;
import com.ui_katalogkit.common.SearchPagesBase.enums.Scopes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DefaultSearchBarBase.class)
public class DefaultSearchBar extends DefaultSearchBarBase {
    Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public DefaultSearchBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Default Search Bar']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Search']")
    private ExtendedWebElement backToSearchPage;

    @FindBy(xpath = "//XCUIElementTypeSearchField")
    private ExtendedWebElement searchField;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
    private ExtendedWebElement cancelButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Scope %s']")
    private ExtendedWebElement scopeButton;

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
    public void clickOnCancelButton(){
        cancelButton.click();
    }

    @Override
    public String getTextCancelButton(){
        return cancelButton.getText();
    }

    @Override
    public void clickOnScope (Scopes scope){
        scopeButton.format(scope.getValue()).click();
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

    @Override
    public boolean isScopeSelected(Scopes scope){
        return scopeButton.format(scope.getValue()).getText().equals("1");
    }
}