package com.qaprosoft.carina.demo.gui.components.enums;

public enum SocialConnectButtons {
	TIPUS("1", "TIPUS"), YOUTUBE("2", "YOUTUBE"), INSTAGRAM("3", "INSTAGRAM"), 
	RSS("4", "RSS"), ARENAEV("5", "ARENAEV"), MERCH("6", "MERCH"),
	LOGIN("7", "LOGIN"), SIGNUP("8", "SIGNUP");
	
	private final String number;
	private final String value;

	private SocialConnectButtons(String number, String value) {
		this.number = number;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String getNumber() {
		return number;
	}
}
