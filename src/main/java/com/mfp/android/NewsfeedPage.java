package com.mfp.android;

import com.mfp.common.DiaryPageBase;
import com.mfp.common.NewsfeedPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsfeedPageBase.class)
public class NewsfeedPage extends NewsfeedPageBase {
    public NewsfeedPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='com.myfitnesspal.android:id/toolbar']" +
            "/android.widget.TextView")
    private ExtendedWebElement title;

    @Override
    public boolean isOpened(){
        return title.isElementPresent();
    }
}
