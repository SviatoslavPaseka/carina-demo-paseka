package com.mfp.common.enums;

import com.mfp.common.*;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum BottomBarButton {
    DASHBOARD("dashboard", DashboardPageBase.class), DIARY("diary", DiaryPageBase.class),
    NEWSFEED("newsfeed", NewsfeedPageBase.class), PLANS("plans", PlansPageBase.class),
    MORE("more", MorePageBase.class);

    private String value;
    private Class<? extends AbstractPage> pageClass;

    BottomBarButton(String value, Class<? extends AbstractPage> pageClass) {
        this.value = value;
        this.pageClass = pageClass;
    }

    public String getValue() {
        return value;
    }

    public Class<? extends AbstractPage> getPageClass() {
        return pageClass;
    }
}
