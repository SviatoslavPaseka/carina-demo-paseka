package com.mfp;

import com.mfp.common.MFPLogInPageBase;
import com.mfp.common.MFPWelcomePageBase;
import com.mfp.common.UserTutorialPageBase;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class BottomMenuItemTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "3")
    public void checkingBottomMenuItemsLeadsEachItemPage(){
        MFPWelcomePageBase welcomePage = initPage(getDriver(), MFPWelcomePageBase.class);

        MFPLogInPageBase logInPage = welcomePage.clickLoginButton();

        UserTutorialPageBase userTutorialPage = logInPage.defaultLogin();

        userTutorialPage.clickCloseButton();
        LOGGER.info("End");
    }
}
