package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavMenuButton;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavigationMenuPageBase;
import org.openqa.selenium.WebDriver;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NavigationMenuPageBase.class)
public class NavigationMenuPage extends NavigationMenuPageBase {
    private static final String THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID = "This method is not yet implemented for iOS";

    public NavigationMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage clickMenuButton(NavMenuButton navMenuButton) {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }
}