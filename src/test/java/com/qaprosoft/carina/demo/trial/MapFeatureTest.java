package com.qaprosoft.carina.demo.trial;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MapFeatureTest implements IAbstractTest, IMobileUtils {
    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "2")
    public void verifyMapFeatureTest(){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        LoginPageBase loginPage = welcomePage.clickNextBtn();

        WebViewPageBase webViewPage = loginPage.defaultLogin();

        NavigationMenuPageBase navigationMenuPage = webViewPage.clickToolbarMenuButton();

        Assert.assertTrue(navigationMenuPage.isOpened(), "[NAVIGATION MENU] page is not opened");

        MapPageBase mapPage = (MapPageBase) navigationMenuPage.clickMenuBtn(NavMenuBtn.MAP);
        Assert.assertTrue(mapPage.isOpened(), "[MAP] Page is not opened after taping on 'Map link'");
        Assert.assertTrue(mapPage.isZoomButtonPresent(ZoomBtn.IN), "[MAP] Zoom IN button isn't present");
        Assert.assertTrue(mapPage.isZoomButtonPresent(ZoomBtn.OUT), "[MAP] Zoom OUT button isn't present");

        Assert.assertTrue(mapPage.getZoomBtnYCoordinate(ZoomBtn.IN) < mapPage.getZoomBtnYCoordinate(ZoomBtn.OUT),
                            "[MAP]Zoom out above a zoom in");
    }
}
