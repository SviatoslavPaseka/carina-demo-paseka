package com.mfp.ios;

import com.mfp.common.DeleteModalWindowPageBase;
import com.mfp.common.DiaryPageBase;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DeleteModalWindowPageBase.class)
public class DeleteModalWindowPage extends DeleteModalWindowPageBase {
    public DeleteModalWindowPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase clickDeleteButton(){
        throw new NotImplementedException();
    }
}
