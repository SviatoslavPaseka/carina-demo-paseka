package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.HeaderMenu;

public class ForgotPage extends AbstractPage{

	public ForgotPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "header")
	private HeaderMenu headerMenu;
	
	@FindBy(id = "footmenu")
	private FooterMenu footerMenu;

	public HeaderMenu getHeaderMenu() {
		return headerMenu;
	}

	public FooterMenu getFooterMenu() {
		return footerMenu;
	}
}