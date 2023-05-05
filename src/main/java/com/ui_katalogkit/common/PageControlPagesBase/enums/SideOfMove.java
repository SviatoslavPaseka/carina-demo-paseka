package com.ui_katalogkit.common.PageControlPagesBase.enums;

import org.openqa.selenium.Keys;

public enum SideOfMove {
    RIGHT(Keys.ARROW_RIGHT), LEFT(Keys.ARROW_LEFT);

    private Keys keys;

    SideOfMove(Keys keys) {
        this.keys = keys;
    }

    public Keys getKeys() {
        return keys;
    }
}
