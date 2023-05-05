package com.ui_katalogkit.common.CommonPagesBase;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import org.openqa.selenium.WebDriver;

public abstract class CommonPageBase extends ParentPageBase {
    public CommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract UiCatalogPageBase tapBackButton();

}