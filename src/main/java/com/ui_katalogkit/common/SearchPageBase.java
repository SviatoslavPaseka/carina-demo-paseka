package com.ui_katalogkit.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SearchPageBase extends ParentPageBase {
    public SearchPageBase(WebDriver driver) {
        super(driver);
    }
}
