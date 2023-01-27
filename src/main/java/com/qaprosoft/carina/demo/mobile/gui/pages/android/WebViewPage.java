package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ContactUsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MapPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WebViewPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @FindBy(xpath = "//*[@class='t708__icon']")
    private ExtendedWebElement contactUsLink;
    @FindBy(id = "toolbar")
    private ExtendedWebElement toolbar;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private ExtendedWebElement toolbarMenuButton;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text = 'Map']")
    private ExtendedWebElement mapLink;

    public WebViewPage(WebDriver driver) {
        super(driver);
        LOGGER.info("Map is clickable: " + mapLink.isClickable());
    }

    @Override
    public ContactUsPageBase goToContactUsPage() {
        contactUsLink.click();
        return initPage(getDriver(), ContactUsPageBase.class);
    }

    @Override
    public boolean isOpened() {
        return toolbar.isElementPresent();
    }

    @Override
    public void clickToolbarMenuButton(){
        toolbarMenuButton.click();
    }
    @Override
    public MapPageBase clickMapLink(){
        LOGGER.info("Map is clickable: " + mapLink.isClickable());
        mapLink.click();
        return initPage(getDriver(), MapPageBase.class);
    }
}
