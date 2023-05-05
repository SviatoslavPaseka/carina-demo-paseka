package com.ui_katalogkit.ios.ImageViewPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.ImageViewPagesBase.ImageViewPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ImageViewPageBase.class)
public class ImageViewPage extends ImageViewPageBase {
    public ImageViewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Image View']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeImage[@name='Animated']")
    private ExtendedWebElement animatedImage;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public boolean isImagePresent(){
        return animatedImage.isElementPresent();
    }

    @Override
    public ExtendedWebElement getAnimatedImage() {
        return animatedImage;
    }
}
