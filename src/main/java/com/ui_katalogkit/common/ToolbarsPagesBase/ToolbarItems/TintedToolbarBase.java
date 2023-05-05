package com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems;

import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class TintedToolbarBase extends ParentPageBase {

    public TintedToolbarBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickRefreshButton();

    public abstract void clickShareButton();
}