package com.mfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DeleteModalWindowPageBase extends AbstractPage {

    public DeleteModalWindowPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void accessDelete();
}
