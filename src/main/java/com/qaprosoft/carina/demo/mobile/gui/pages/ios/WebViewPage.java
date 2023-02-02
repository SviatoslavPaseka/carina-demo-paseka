package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ContactUsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavigationMenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    private static final String THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID = "This method is not yet implemented for iOS";

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public WebViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactUsPageBase goToContactUsPage() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public NavigationMenuPageBase clickToolbarMenuButton(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }
}