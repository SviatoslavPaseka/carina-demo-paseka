package com.qaprosoft.carina.demo.utils;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;
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

public class HeaderElementFactory {
	private static AbstractPage abstractPage;

	public static AbstractPage getPage(WebDriver driver, HeaderMenuButtons headerMenuButton) {
		switch (headerMenuButton) {
		case HOME:
			abstractPage = new HomePage(driver);
			break;
		case NEWS:
			abstractPage = new NewsPage(driver);
			break;
		case REVIEWS:
			abstractPage = new ReviewsPage(driver);
			break;
		case VIDEOS:
			abstractPage = new VideosPage(driver);
			break;
		case FEATURED:
			abstractPage = new FeaturedPage(driver);
			break;
		case PHONE_FINDER:
			abstractPage = new Phone_FinderPage(driver);
			break;
		case DEALS:
			abstractPage = new DealsPage(driver);
			break;
		case MERCH:
			abstractPage = new MerchPage(driver);
			break;
		case COVARAGE:
			abstractPage = new CoveragePage(driver);
			break;
		case CONTACT:
			abstractPage = new ContactPage(driver);
			break;
		default:
			abstractPage = null;
			break; 
		}
		return abstractPage;
	}
}
