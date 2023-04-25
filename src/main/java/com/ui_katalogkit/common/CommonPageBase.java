package com.ui_katalogkit.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CommonPageBase extends ParentPageBase {
    public CommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract UiCatalogPageBase tapBackButton();

}