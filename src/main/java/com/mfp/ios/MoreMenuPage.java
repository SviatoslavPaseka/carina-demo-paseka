package com.mfp.ios;

import com.mfp.common.MoreMenuPageBase;
import com.mfp.common.enums.ButtonInMoreMenu;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MoreMenuPageBase.class)
public class MoreMenuPage extends MoreMenuPageBase {
      public MoreMenuPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public AbstractPage clickOnButton(ButtonInMoreMenu ButtonsInMoreMenu){
        throw new NotImplementedException();
    }

    @Override
    public boolean isButtonPresent(ButtonInMoreMenu ButtonsInMoreMenu){
        throw new NotImplementedException();
    }

    @Override
    public boolean isOpened(){
        throw new NotImplementedException();
    }
}
