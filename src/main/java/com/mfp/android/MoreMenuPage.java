package com.mfp.android;

import com.mfp.common.MoreMenuPageBase;
import com.mfp.common.enums.ButtonInMoreMenu;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MoreMenuPageBase.class)
public class MoreMenuPage extends MoreMenuPageBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public MoreMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement button;

    @FindBy(id = "com.myfitnesspal.android:id/listViewList")
    private ExtendedWebElement container;

    @Override
    public AbstractPage clickOnButton(ButtonInMoreMenu ButtonsInMoreMenu){
        button.format(ButtonsInMoreMenu.getNameOfButton()).click();
        return initPage(getDriver(), ButtonsInMoreMenu.getPageClass());
    }

    @Override
    public boolean isButtonPresent(ButtonInMoreMenu ButtonsInMoreMenu){
        LOGGER.info("LOCATOR: " + button.format(ButtonsInMoreMenu.getNameOfButton()).getNameWithLocator());
        return button.format(ButtonsInMoreMenu.getNameOfButton()).isElementPresent();
    }

    @Override
    public boolean isOpened(){
        return container.isElementPresent();
    }
}
