package com.qaprosoft.carina.demo.laba;

import java.lang.invoke.MethodHandles;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.LoginMenu;
import com.qaprosoft.carina.demo.gui.components.enums.SocialConnectButtons;
import com.qaprosoft.carina.demo.gui.pages.ForgotPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.zebrunner.agent.core.annotation.TestLabel;

public class LoginTest implements IAbstractTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	private static final String RED_COLOR= "rgba(213, 0, 0, 1)";
	@Test()
	@MethodOwner(owner = "qpsdemo")
	@TestLabel(name = "feature", value = { "web", "acceptance" })
	public void loginModalFormTest() {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        SoftAssert softAssert = new SoftAssert();
        
        LoginMenu loginMenu = homePage.getHeaderMenu().openLoginForm();
        
        Assert.assertTrue(homePage.getHeaderMenu().isLoginFormOpened(), "Login form is not opened");
        
        softAssert.assertEquals(loginMenu.getLoginTitle().getText(), "Login", "Login form hasn't 'login' title");
        
        Assert.assertTrue(loginMenu.getEmailInput().isPresent(), "Email field is not present");
        Assert.assertTrue(loginMenu.getPasswordInput().isPresent(), "Password field is not present");
        
        loginMenu.inputRegistrationData("some@email.com", "somePassword123");
        
        loginMenu.inputRegistrationData("", "");
        
        Assert.assertTrue(loginMenu.getLoginButton().isPresent(), "Login button is not present");
        loginMenu.loginClick();
        
        Assert.assertTrue(loginMenu.getForgotPassword().isPresent(), "Forgot password link doesnt present");
        ForgotPage forgotPage =  loginMenu.forgotPasswordClick();
        forgotPage.open();
        softAssert.assertTrue(forgotPage.isPageOpened(), "Forgot password page is not opened!");
        
        forgotPage.getHeaderMenu().clickSocialConnectButton(SocialConnectButtons.LOGIN);
        Assert.assertEquals(loginMenu.getColorLoginButton(), RED_COLOR, "Login button has another color during the hover");
        softAssert.assertAll();
	}
	
	@Test()
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
	public void succesfullLoginTest() {
//		final String nickanameTest = "testNick3";
	    final String emailTest = "kpitya01@gmail.com";
	    final String passTest = "768124zzXX#";

		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		LOGGER.info("------" + HomePage.class.getName() + "----------");
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        LoginMenu loginForm = homePage.getHeaderMenu().openLoginForm();
        Assert.assertTrue(homePage.getHeaderMenu().isLoginFormOpened(), "Login form is not opened");
        
        LOGGER.info("try to input login data and click login button");
        Assert.assertTrue(loginForm.getLoginButton().isClickable(), "Login button is not clickable");
        loginForm.inputRegistrationDataWithClick(emailTest, passTest);
        
        Assert.assertTrue(homePage.isPageOpened(), "Loging failed!");
	}
	
	@Test(dataProvider = "DP1", dataProviderClass = DataproviderForLoginTest.class)
    @MethodOwner(owner = "qpsdemo")
	public void loginTest(String emailTest, String passTest, String expected) {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        LoginMenu loginForm = homePage.getHeaderMenu().openLoginForm();
        Assert.assertTrue(homePage.getHeaderMenu().isLoginFormOpened(), "Login form is not opened");
        
        LOGGER.info("try to input login data and click login button");
        Assert.assertTrue(loginForm.getLoginButton().isClickable(), "Login button is not clickable");
        loginForm.inputRegistrationData(emailTest, passTest);
        
        Assert.assertEquals(loginForm.getValidationMessage(), expected, "incorrect validation message");
	}
}
