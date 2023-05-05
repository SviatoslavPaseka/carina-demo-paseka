package com.ui_katalogkit.common.ImageViewPagesBase;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class ImageViewPageBase extends ParentPageBase {
    public ImageViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isImagePresent();

    public abstract ExtendedWebElement getAnimatedImage();
}
