package com.qaprosoft.carina.demo.trial;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.LoginPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPageTest implements IAbstractTest, IMobileUtils {
    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "1")
    public void verifyLoginPageTest(){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        LoginPage loginPage = (LoginPage) welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(), "LoginPage is not opened");

        Assert.assertTrue(loginPage.isSpecifiedElementPresent("nameInputField"));
        Assert.assertTrue(loginPage.isSpecifiedElementPresent("passwordInputField"));
        Assert.assertTrue(loginPage.isSpecifiedElementPresent("radio_male"));
        Assert.assertTrue(loginPage.isSpecifiedElementPresent("radio_female"));
        Assert.assertTrue(loginPage.isSpecifiedElementPresent("checkbox"));
        Assert.assertTrue(loginPage.isSpecifiedElementPresent("login_button"));

        Assert.assertFalse(loginPage.isSpecifiedSelectorChecked("radio_male"));
        Assert.assertFalse(loginPage.isSpecifiedSelectorChecked("radio_female"));
        Assert.assertFalse(loginPage.isSpecifiedSelectorChecked("checkbox"));

        loginPage.typeName("SomeName");
        Assert.assertEquals(loginPage.getTextFromSpecifiedElement("nameInputField"), "SomeName");
        loginPage.typePassword("Password");
        Assert.assertEquals(loginPage.getTextFromSpecifiedElement("passwordInputField"), "Password");

        loginPage.selectMaleSex();
        Assert.assertTrue(loginPage.isSpecifiedSelectorChecked("radio_male"));

        loginPage.checkPrivacyPolicyCheckbox();
        Assert.assertTrue(loginPage.isSpecifiedSelectorChecked("checkbox"));

        Assert.assertTrue(loginPage.isLoginBtnActive(), "Login button is not active");

        CarinaDescriptionPageBase carinaDescriptionPage = loginPage.clickLoginBtn();

        Assert.assertTrue(carinaDescriptionPage.isPageOpened());
    }
}
