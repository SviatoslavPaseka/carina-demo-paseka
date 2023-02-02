package com.mfp.android;

import com.mfp.common.DiaryPageBase;
import com.mfp.common.PlansPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

    public DiaryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat" +
            "//preceding-sibling::android.widget.TextView")
    private ExtendedWebElement title;

    @Override
    public boolean isOpened(){
        return title.isElementPresent();
    }
}
