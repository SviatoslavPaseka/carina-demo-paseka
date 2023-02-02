package com.mfp.common.enums;

import com.mfp.common.*;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum MenuButton {
    DASHBOARD("dashboard", DashboardPageBase.class), DIARY("diary", DiaryPageBase.class),
    NEWSFEED("newsfeed", NewsfeedPageBase.class), PLANS("plans", PlansPageBase.class),
    MORE("more", MorePageBase.class);

    private String value;
    private Class<? extends AbstractPage> pages;

    MenuButton(String value, Class<? extends AbstractPage> pages) {
        this.value = value;
        this.pages = pages;
    }

    public String getValue() {
        return value;
    }

    public Class<? extends AbstractPage> getPages() {
        return pages;
    }
}
