package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavMenuBtn;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavigationMenuPageBase;
import com.qaprosoft.carina.demo.utils.android.NavigationMenuButtonFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NavigationMenuPageBase.class)
public class NavigationMenuPage extends NavigationMenuPageBase {

    public NavigationMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.solvd.carinademoapplication:id/navigation_header_container")
    private ExtendedWebElement header;
    @FindBy(xpath = "//*[@resource-id = 'com.solvd.carinademoapplication:id/design_menu_item_text'][@text = '%s']")
    private ExtendedWebElement menuButton;

    /*
    * It takes the name of the menu button as a parameter
    * and returns using the NavigationMenuButtonFactory - AbstractPage,
    * which later needs to be converted to one of the page types:
    * WebViewPagebase
    * ChartsPageBase
    * MapPageBase
    * UIElementsPageBase
    */
    @Override
    public AbstractPage clickMenuBtn(NavMenuBtn navMenuBtn) {
        menuButton.format(navMenuBtn.getValue()).click();
        return NavigationMenuButtonFactory.getPageByName(navMenuBtn, driver);
    }

    @Override
    public boolean isOpened() {
        return header.isElementPresent();
    }
}