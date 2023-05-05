package com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems;

import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class DefaultToolbarBase extends ParentPageBase {

    public DefaultToolbarBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickDeleteButton();

    public abstract void clickActionButton();
}