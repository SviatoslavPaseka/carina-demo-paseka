package com.ui_katalogkit.common.SegmentedControlsPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SegmentedControlsPagesBase.enums.SegmentedControlsMenuName;
import com.ui_katalogkit.common.SegmentedControlsPagesBase.enums.SegmentedControlsName;
import org.openqa.selenium.WebDriver;

public abstract class SegmentedControlsPageBase extends ParentPageBase {
    public SegmentedControlsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextFromSegmentedControlMenuName(SegmentedControlsMenuName menuName);

    public abstract void clickOnSegmentedControlTabByMenuNameAndSegmentedControlName(SegmentedControlsMenuName menuName, SegmentedControlsName controlsName);

    public abstract boolean isSegmentedControlTabSelected(SegmentedControlsMenuName menuName, SegmentedControlsName controlsName);

    public abstract boolean isSegmentedControlTabEnabled(SegmentedControlsMenuName menuName, SegmentedControlsName controlsName);
}
