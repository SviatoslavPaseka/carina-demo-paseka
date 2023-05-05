package com.ui_katalogkit.ios.SearchPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchPageBase;
import com.ui_katalogkit.common.SearchPagesBase.enums.SearchBarName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SearchPageBase.class)
public class SearchPage extends SearchPageBase {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Search']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='Search Bars'][@accessible='true']")
    private ExtendedWebElement searchBarsMenuText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']")
    private ExtendedWebElement searchBar;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']/following-sibling::XCUIElementTypeStaticText")
    private ExtendedWebElement searchBarDescription;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextFromSearchBarsMenu(){
        return searchBarsMenuText.getText();
    }

    @Override
    public String getTextFromSearchBar(SearchBarName searchBarName){
        return searchBar.format(searchBarName.getValue()).getText();
    }

    @Override
    public String getTextFromSearchBarDescription(SearchBarName searchBarName){
        return searchBarDescription.format(searchBarName.getValue()).getText();
    }

    @Override
    public ParentPageBase clickOnSearchBar(SearchBarName searchBarName){
        searchBar.format(searchBarName.getValue()).click();
        return initPage(getDriver(), searchBarName.getPageClass());
    }
}