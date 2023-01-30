package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;

public enum NavMenuButton {
    WEB_VIEW("Web View", WebViewPageBase.class), CHARTS("Charts", ChartsPageBase.class),
    MAP("Map", MapPageBase.class), UI_ELEMENTS("UI Elements", UIElementsPageBase.class);

    private String value;
    private Class<? extends AbstractPage> pageClass;

    NavMenuButton(String value, Class<? extends AbstractPage> page) {
        this.value = value;
        this.pageClass = page;
    }

    public String getValue() {
        return value;
    }

    public Class<? extends AbstractPage> getPageClass() {
        return pageClass;
    }
}
