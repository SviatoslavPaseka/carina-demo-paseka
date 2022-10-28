package com.qaprosoft.carina.demo.laba;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.components.LoginMenu;
import com.qaprosoft.carina.demo.gui.components.enums.HeaderMenuButtons;
import com.qaprosoft.carina.demo.gui.components.enums.SocialConnectButtons;
import com.qaprosoft.carina.demo.gui.pages.ContactPage;
import com.qaprosoft.carina.demo.gui.pages.CoveragePage;
import com.qaprosoft.carina.demo.gui.pages.DealsPage;
import com.qaprosoft.carina.demo.gui.pages.FeaturedPage;
import com.qaprosoft.carina.demo.gui.pages.ForgotPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.MerchPage;
import com.qaprosoft.carina.demo.gui.pages.NewsPage;
import com.qaprosoft.carina.demo.gui.pages.Phone_FinderPage;
import com.qaprosoft.carina.demo.gui.pages.ReviewsPage;
import com.qaprosoft.carina.demo.gui.pages.VideosPage;
import com.zebrunner.agent.core.annotation.TestLabel;

public class GuiComponentsTest implements IAbstractTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

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
        Assert.assertEquals(loginMenu.getColorLoginButton(), "rgba(213, 0, 0, 1)", "Login button has another color during the hover");
        softAssert.assertAll();
	}
	
	@Test()
	@MethodOwner(owner = "qpsdemo")
	@TestLabel(name = "feature", value = { "web", "acceptance" })
	public void headerComponentTest() {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        SoftAssert softAssert = new SoftAssert();
        
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        Assert.assertTrue(headerMenu.getBurgerButton().isPresent(), "Burger button is not present");
        headerMenu.getBurgerButton().click();
        
        for (HeaderMenuButtons button: HeaderMenuButtons.values()) {
			AbstractUIObject uiObject = headerMenu.clickHeaderMenuButton(button);
			//add assert
			uiObject.open();
			switch (button) {
			case HOME:
				softAssert.assertTrue(uiObject.isPageOpened(new HomePage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case NEWS:
				softAssert.assertTrue(uiObject.isPageOpened
						(new NewsPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case REVIEWS:
				softAssert.assertTrue(uiObject.isPageOpened
						(new ReviewsPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case VIDEOS:
				softAssert.assertTrue(uiObject.isPageOpened
						(new VideosPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case FEATURED:
				softAssert.assertTrue(uiObject.isPageOpened
						(new FeaturedPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case PHONE_FINDER:
				softAssert.assertTrue(uiObject.isPageOpened
						(new Phone_FinderPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case DEALS:
				softAssert.assertTrue(uiObject.isPageOpened
						(new DealsPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case MERCH:
				softAssert.assertTrue(uiObject.isPageOpened
						(new MerchPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case COVARAGE:
				softAssert.assertTrue(uiObject.isPageOpened
						(new CoveragePage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			case CONTACT:
				softAssert.assertTrue(uiObject.isPageOpened
						(new ContactPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
				break;
			default:
				break;
			}
		}
	}
	
	@Test()
	@MethodOwner(owner = "qpsdemo")
	@TestLabel(name = "feature", value = { "web", "acceptance" })
	public void footerComponentTest() {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        FooterMenu footerMenu = homePage.getFooterMenu();
        
        for (HeaderMenuButtons button: HeaderMenuButtons.values()) {
			footerMenu.clickFooterMenuButton(button);
			homePage.getHeaderMenu().clickHeaderMenuButton(HeaderMenuButtons.HOME);
		}
	}
}