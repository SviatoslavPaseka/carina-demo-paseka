package com.ui_katalogkit.common.UiCatalogPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.openqa.selenium.WebDriver;

public abstract class UiCatalogPageBase extends ParentPageBase {

    public UiCatalogPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract String getTextFromPageName();

    public abstract ParentPageBase tapToElementByName(UiKitCatalogNames names);

    public abstract String getTextFromElementSubText(UiKitCatalogNames names);

    public abstract String getTextFromElementName(UiKitCatalogNames names);
}
