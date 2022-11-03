package com.qaprosoft.carina.demo.laba;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.enums.HeaderMenuButtons;
import com.qaprosoft.carina.demo.gui.pages.ContactPage;
import com.qaprosoft.carina.demo.gui.pages.CoveragePage;
import com.qaprosoft.carina.demo.gui.pages.DealsPage;
import com.qaprosoft.carina.demo.gui.pages.FeaturedPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.qaprosoft.carina.demo.gui.pages.MerchPage;
import com.qaprosoft.carina.demo.gui.pages.NewsPage;
import com.qaprosoft.carina.demo.gui.pages.Phone_FinderPage;
import com.qaprosoft.carina.demo.gui.pages.ReviewsPage;
import com.qaprosoft.carina.demo.gui.pages.VideosPage;
import com.zebrunner.agent.core.annotation.TestLabel;

public class FooterTest implements IAbstractTest{
	@Test()
	@MethodOwner(owner = "qpsdemo")
	@TestLabel(name = "feature", value = { "web", "acceptance" })
	public void footerComponentTest() {
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
        
        FooterMenu footerMenu = homePage.getFooterMenu();
        
        SoftAssert softAssert = new SoftAssert();
        
        for (HeaderMenuButtons button: HeaderMenuButtons.values()) {
        	AbstractPage page = footerMenu.clickFooterMenuButton(button);
			//add assert
			page.open();
			switch (button) {
				case HOME:
					softAssert.assertTrue(page.isPageOpened(new HomePage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case NEWS:
					softAssert.assertTrue(page.isPageOpened
							(new NewsPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case REVIEWS:
					softAssert.assertTrue(page.isPageOpened
							(new ReviewsPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case VIDEOS:
					softAssert.assertTrue(page.isPageOpened
							(new VideosPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case FEATURED:
					softAssert.assertTrue(page.isPageOpened
							(new FeaturedPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case PHONE_FINDER:
					softAssert.assertTrue(page.isPageOpened
							(new Phone_FinderPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case DEALS:
					softAssert.assertTrue(page.isPageOpened
							(new DealsPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case MERCH:
					softAssert.assertTrue(page.isPageOpened
							(new MerchPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case COVARAGE:
					softAssert.assertTrue(page.isPageOpened
							(new CoveragePage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				case CONTACT:
					softAssert.assertTrue(page.isPageOpened
							(new ContactPage(getDriver())), "Page: " + button.getValue() + " is not opened!");
					break;
				default:
					break;
			}
		}
        softAssert.assertAll();
	}
}
