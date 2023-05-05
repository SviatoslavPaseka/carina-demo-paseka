package com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems;

import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class CustomToolbarBase extends ParentPageBase {

    public CustomToolbarBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickWarningButton();

    public abstract void clickButtonButton();
}