package com.ui_katalogkit.common.WebViewPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class WebViewPageBase extends ParentPageBase {
    public WebViewPageBase(WebDriver driver) {
        super(driver);
    }

}
