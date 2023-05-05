package com.ui_katalogkit.ios.PageControlPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.PageControlPagesBase.PageControlPageBase;
import com.ui_katalogkit.common.PageControlPagesBase.enums.NumberClicks;
import com.ui_katalogkit.common.PageControlPagesBase.enums.SideOfMove;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PageControlPageBase.class)
public class PageControlPage extends PageControlPageBase {
    public PageControlPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Page Control']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypePageIndicator")
    private ExtendedWebElement pageIndicator;


    @FindBy(xpath = "//XCUIElementTypePageIndicator/preceding-sibling::XCUIElementTypeOther")
    private ExtendedWebElement pageWithColor;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public void clickOnPageIndicator(NumberClicks numberClicks) {
        for (int i = 0; i < numberClicks.getNumber(); i++) {
            pageIndicator.click();
        }
    }

    @Override
    public void movePage(SideOfMove sideOfMove, NumberClicks numberClicks){
        for (int i = 0; i < numberClicks.getNumber(); i++) {
            pageIndicator.sendKeys(sideOfMove.getKeys());
        }
    }

    @Override
    public String getNumberOfPage() {
        return pageIndicator.getAttribute("value");
    }
}