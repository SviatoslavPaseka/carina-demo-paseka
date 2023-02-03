package com.mfp.common;

import com.mfp.common.componentsBase.BottomNavigationBarBase;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MFPCommonPageBase extends AbstractPage {
    public MFPCommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract BottomNavigationBarBase getBottomNavigationBar();

    public abstract DashboardPageBase login(String email, String password);

    public abstract DashboardPageBase defaultLogin();
}
