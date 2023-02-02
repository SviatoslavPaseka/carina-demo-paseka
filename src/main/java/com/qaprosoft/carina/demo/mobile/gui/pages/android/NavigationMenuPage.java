package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavMenuButton;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavigationMenuPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NavigationMenuPageBase.class)
public class NavigationMenuPage extends NavigationMenuPageBase {

    public NavigationMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.solvd.carinademoapplication:id/navigation_header_container")
    private ExtendedWebElement header;
    @FindBy(xpath = "//*[contains(@resource-id, 'com.solvd.carinademoapplication:id/design_menu_item_text') and contains(@text, '%s')]")
    private ExtendedWebElement menuButton;

    @Override
    public AbstractPage clickMenuButton(NavMenuButton navMenuButton) {
        menuButton.format(navMenuButton.getValue()).click();
        return initPage(navMenuButton.getPageClass(), getDriver());
    }

    @Override
    public boolean isOpened() {
        return header.isElementPresent();
    }
}