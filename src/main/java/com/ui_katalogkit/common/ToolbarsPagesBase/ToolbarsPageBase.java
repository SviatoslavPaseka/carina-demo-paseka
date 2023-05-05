package com.ui_katalogkit.common.ToolbarsPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.ToolbarsPagesBase.enums.ToolbarName;
import org.openqa.selenium.WebDriver;

public abstract class ToolbarsPageBase extends ParentPageBase {
    public ToolbarsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextToolbarDescription(ToolbarName toolbarName);

    public abstract String getTextToolbarItem(ToolbarName toolbarName);

    public abstract ParentPageBase clickToolbarItem(ToolbarName toolbarName);
}
