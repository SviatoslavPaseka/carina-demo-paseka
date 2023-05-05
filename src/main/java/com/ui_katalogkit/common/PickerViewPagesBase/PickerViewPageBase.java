package com.ui_katalogkit.common.PickerViewPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.PickerViewPagesBase.enums.ColorPicker;
import org.openqa.selenium.WebDriver;

public abstract class PickerViewPageBase extends ParentPageBase {
    public PickerViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void setColorShadeByColor(ColorPicker colorPicker, int colorShade);

    public abstract String getColorShadeFromColorWheelByColor(ColorPicker colorPicker);
}
