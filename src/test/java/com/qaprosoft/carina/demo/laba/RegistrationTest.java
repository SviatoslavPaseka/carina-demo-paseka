package com.qaprosoft.carina.demo.laba;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.LoginMenu;
import com.qaprosoft.carina.demo.gui.components.enums.SocialConnectButtons;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.zebrunner.agent.core.annotation.TestLabel;

public class RegistrationTest implements IAbstractTest{
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	@Test()
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
	public void signupTest() {
		final String nickanameTest = "testNick4";
	    final String emailTest = "sob@i.ua";
	    final String passTest = "768124zzXX#";
		
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        //next task: create socialButtonsFACTORY
        SignUpPage signUpPage = homePage.getHeaderMenu().openSignupPage();
        signUpPage.open();
        Assert.assertTrue(signUpPage.isPageOpened(), "SignUp page is not opened");
        
        signUpPage.inputRegistrationData(nickanameTest, emailTest, passTest);
       
        Assert.assertTrue(signUpPage.isSubmitButtonClickable(), "Cannot click on submit button");
        signUpPage.clickSubmit();
        
        Assert.assertTrue(signUpPage.isConfirmationPresent(), "Registration success");
	}
	
	@Test()
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"web", "acceptance"})
	public void loginTest() {
//		final String nickanameTest = "testNick3";
	    final String emailTest = "kpitya01@gmail.com";
	    final String passTest = "768124zzXX#";
		
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        LoginMenu loginForm = homePage.getHeaderMenu().openLoginForm();
        Assert.assertTrue(homePage.getHeaderMenu().isLoginFormOpened(), "Login form is not opened");
        
        LOGGER.info("try to input login data");
        loginForm.inputRegistrationData(emailTest, passTest);
        LOGGER.info("data was inputed, try to click login button");
        loginForm.loginClick();
        
        Assert.assertTrue(homePage.isPageOpened(), "Loging failed!");
	}
}