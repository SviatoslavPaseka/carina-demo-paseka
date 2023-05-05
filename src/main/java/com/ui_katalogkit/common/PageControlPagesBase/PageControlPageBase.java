package com.ui_katalogkit.common.PageControlPagesBase;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.PageControlPagesBase.enums.NumberClicks;
import com.ui_katalogkit.common.PageControlPagesBase.enums.SideOfMove;
import com.ui_katalogkit.common.ParentPageBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public abstract class PageControlPageBase extends ParentPageBase {
    public PageControlPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnPageIndicator(NumberClicks numberClicks);

    public abstract void movePage(SideOfMove sideOfMove, NumberClicks numberClicks);

    public abstract String getNumberOfPage();
}
