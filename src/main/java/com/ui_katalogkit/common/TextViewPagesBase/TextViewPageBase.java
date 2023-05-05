package com.ui_katalogkit.common.TextViewPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class TextViewPageBase extends ParentPageBase {
    public TextViewPageBase(WebDriver driver) {
        super(driver);
    }
}
