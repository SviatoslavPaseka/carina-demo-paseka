package com.ui_katalogkit.common.SteppersPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SteppersPagesBase.enums.IncrementDecrement;
import com.ui_katalogkit.common.SteppersPagesBase.enums.TextStepper;
import org.openqa.selenium.WebDriver;

public abstract class SteppersPageBase extends ParentPageBase {
    public SteppersPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getTextAboveStepper(TextStepper textStepper);

    public abstract boolean isChangerButtonEnabled(TextStepper textStepper, IncrementDecrement incrementDecrement);

    public abstract void clickOnChangerButton(TextStepper textStepper, IncrementDecrement incrementDecrement);

    public abstract void clickOnChangerButton(TextStepper textStepper, IncrementDecrement incrementDecrement, int numberTimes);

    public abstract String getValueOfStepper(TextStepper textStepper);
}
