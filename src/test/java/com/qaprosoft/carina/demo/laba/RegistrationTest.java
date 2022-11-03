package com.qaprosoft.carina.demo.laba;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.SignUpPage;
import com.zebrunner.agent.core.annotation.TestLabel;

public class RegistrationTest implements IAbstractTest{
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
        Assert.assertTrue(signUpPage.isSubmitButtonClickable(), "Cannot click on submit button");
        
        signUpPage.registerNewAccount(nickanameTest, emailTest, passTest);
       
        Assert.assertTrue(signUpPage.isConfirmationPresent(), "Registration failed");
	}
}