package com.ui_katalogkit.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.enums.UiKitCatalogNames;
import org.openqa.selenium.WebDriver;

public abstract class UiCatalogPageBase extends ParentPageBase {

    public UiCatalogPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract String getTextFromPageName();

    public abstract ParentPageBase tapToElementByName(UiKitCatalogNames names);
}
