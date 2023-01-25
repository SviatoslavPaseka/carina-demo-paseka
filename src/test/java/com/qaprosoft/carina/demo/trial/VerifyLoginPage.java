package com.qaprosoft.carina.demo.trial;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.LoginPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyLoginPage implements IAbstractTest, IMobileUtils {
    @Test()
    public void verifyLoginPage(){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        LoginPage loginPage = (LoginPage) welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(8000), "LoginPage is not opened");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.getNameInputField().isElementPresent(), "Name input field is not present");
        softAssert.assertTrue(loginPage.getPasswordInputField().isElementPresent());
        softAssert.assertTrue(loginPage.getPrivacyPolicyCheckbox().isElementPresent());
        softAssert.assertTrue(loginPage.getFemaleRadioBtn().isElementPresent());
        softAssert.assertTrue(loginPage.getMaleRadioBtn().isElementPresent());

        softAssert.assertFalse(loginPage.getMaleRadioBtn().isChecked());
        softAssert.assertFalse(loginPage.getFemaleRadioBtn().isChecked());
        softAssert.assertFalse(loginPage.getPrivacyPolicyCheckbox().isChecked());

        loginPage.typeName("SomeName");
        softAssert.assertEquals(loginPage.getNameInputField().getText(), "SomeName");
        loginPage.typePassword("Password");
        softAssert.assertEquals(loginPage.getPasswordInputField().getText(), "Password");

        loginPage.selectMaleSex();
        softAssert.assertTrue(loginPage.getMaleRadioBtn().isChecked());

        loginPage.checkPrivacyPolicyCheckbox();
        softAssert.assertTrue(loginPage.getPrivacyPolicyCheckbox().isChecked());

        Assert.assertTrue(loginPage.isLoginBtnActive(), "Login button is not active");

        CarinaDescriptionPageBase carinaDescriptionPage = loginPage.clickLoginBtn();

        Assert.assertTrue(carinaDescriptionPage.isPageOpened());
    }

}
