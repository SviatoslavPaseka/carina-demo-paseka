package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavMenuButton;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavigationMenuPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NavigationMenuPageBase.class)
public class NavigationMenuPage extends NavigationMenuPageBase {

    public NavigationMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.solvd.carinademoapplication:id/navigation_header_container")
    private ExtendedWebElement header;
    @FindBy(xpath = "//*[@resource-id = 'com.solvd.carinademoapplication:id/design_menu_item_text'][@text = '%s']")
    private ExtendedWebElement menuButton;

    @Override
    public AbstractPage clickMenuButton(NavMenuButton navMenuButton) {
       throw new NotImplementedException("Isn't realized on IOS");
    }

    @Override
    public boolean isOpened() {
        throw new NotImplementedException("Isn't realized on IOS");
    }
}