package com.mfp.android;

import com.mfp.common.DeleteModalWindowPageBase;
import com.mfp.common.DiaryPageBase;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DeleteModalWindowPageBase.class)
public class DeleteModalWindowPage extends DeleteModalWindowPageBase {
    public DeleteModalWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement deleteButton;

    @Override
    public DiaryPageBase accessDelete(){
        deleteButton.click();
        return initPage(getDriver(), DiaryPageBase.class);
    }
}
