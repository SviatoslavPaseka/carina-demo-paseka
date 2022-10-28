package com.qaprosoft.carina.demo.gui.components.enums;

public enum HeaderMenuButtons {
	HOME("Home"), NEWS("News"),REVIEWS("Reviews"),
	VIDEOS("Videos"), FEATURED("Featured"), PHONE_FINDER("Phone Finder"),
	DEALS("Deals"), MERCH("Merch"), COVARAGE("Coverage"), CONTACT("Contact");
	
	private final String value;

	private HeaderMenuButtons(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
