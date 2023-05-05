package com.ui_katalogkit.common.ButtonsPagesBase;

import com.ui_katalogkit.common.ButtonsPagesBase.enums.DescriptionsButton;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.WebDriver;

public abstract class ButtonsPageBase extends ParentPageBase {
    public ButtonsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextFromDescriptionTextByDescription(DescriptionsButton descriptionsButton);

    public abstract String getButtonByDescription(DescriptionsButton descriptionsButton);
}
