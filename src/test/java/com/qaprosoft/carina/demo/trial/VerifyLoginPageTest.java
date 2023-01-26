package com.qaprosoft.carina.demo.trial;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPageTest implements IAbstractTest, IMobileUtils {
    @Test()
    @MethodOwner(owner = "spaseka", platform = "android")
    @TestRailCases(testCasesId = "1")
    public void verifyLoginPageTest(){
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        LoginPageBase loginPage = welcomePage.clickNextBtn();
        Assert.assertTrue(loginPage.isPageOpened(), "LoginPage is not opened");

        Assert.assertTrue(loginPage.isInputFieldPresent(InputField.NAME), "[LOGIN] Name input field isn't present");
        Assert.assertTrue(loginPage.isInputFieldPresent(InputField.PASSWORD), "[LOGIN] Password input field isn't present");
        Assert.assertTrue(loginPage.isSexRadioButtonPresent(Sex.MALE), "[LOGIN] Male radio button isn't present");
        Assert.assertTrue(loginPage.isSexRadioButtonPresent(Sex.FEMALE), "[LOGIN] Female radio button isn't present");
        Assert.assertTrue(loginPage.isPrivacyPolicyCheckboxPresent(), "[LOGIN] Privacy policy checkbox isn't present");
        Assert.assertTrue(loginPage.isLoginButtonPresent(), "[LOGIN] Login button isn't present");

        Assert.assertFalse(loginPage.isSexRadioButtonChecked(Sex.MALE), String.format("[LOGIN] %s radio button is checked by default.", Sex.MALE.getValue()));
        Assert.assertFalse(loginPage.isSexRadioButtonChecked(Sex.FEMALE), String.format("[LOGIN] %s radio button is checked by default.", Sex.FEMALE.getValue()));
        Assert.assertFalse(loginPage.isPrivacyPolicyCheckboxChecked(), "[LOGIN] Privacy policy checkbox is checked by default.");

        loginPage.typeName("SomeName");
        Assert.assertEquals(loginPage.getTextInputField(InputField.NAME), "SomeName");
        loginPage.typePassword("Password");
        Assert.assertEquals(loginPage.getTextInputField(InputField.PASSWORD), "Password");

        loginPage.selectSex(Sex.MALE);
        Assert.assertTrue(loginPage.isSexRadioButtonChecked(Sex.MALE), "[LOGIN] Male radio button isn't checked on login page after taping");

        loginPage.checkPrivacyPolicyCheckbox();
        Assert.assertTrue(loginPage.isPrivacyPolicyCheckboxChecked(), "[LOGIN] Privacy policy checkbox isn't checked after taping");

        Assert.assertTrue(loginPage.isLoginBtnActive(), "[LOGIN] Login button is not active after filling all the necessary conditions");

        WebViewPageBase webViewPage = loginPage.clickLoginBtn();

        Assert.assertTrue(webViewPage.isOpened(), "[WEB VIEW] Web view page isn't opened after taping to login button");
    }
}