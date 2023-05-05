package com.ui_katalogkit.common.SlidersPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SlidersPagesBase.enums.SliderName;
import org.openqa.selenium.WebDriver;

public abstract class SlidersPageBase extends ParentPageBase {
    public SlidersPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getSliderNameText(SliderName sliderNameEnum);

    public abstract String getValueFromSlider(SliderName sliderNameEnum);

    public abstract void moveSliderPointer(SliderName sliderName, double to);
}