package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaDescriptionPageBase extends AbstractPage {

    public CarinaDescriptionPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract WebViewPageBase navigateToWebViewPage();

    public abstract ChartsPageBase navigateToChartsPage();

    public abstract MapPageBase navigateToMapPage();

    public abstract UIElementsPageBase navigateToUIElementsPage();

}
