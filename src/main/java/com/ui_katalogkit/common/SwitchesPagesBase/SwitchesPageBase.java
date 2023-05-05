package com.ui_katalogkit.common.SwitchesPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SwitchesPagesBase.enums.SwitcherName;
import org.openqa.selenium.WebDriver;

public abstract class SwitchesPageBase extends ParentPageBase {
    public SwitchesPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextFromTextAboveSwitcher(SwitcherName switcherName);

    public abstract void clickSwitcher(SwitcherName switcherName);

    public abstract boolean switcherStatus(SwitcherName switcherName);
}
