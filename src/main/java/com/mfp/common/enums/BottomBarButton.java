package com.mfp.common.enums;

import com.mfp.common.*;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum BottomBarButton {
    DASHBOARD("dashboard", "Dashboard", DashboardPageBase.class), DIARY("diary", "Diary", DiaryPageBase.class),
    NEWSFEED("newsfeed", "Newsfeed", NewsfeedPageBase.class), PLANS("plans", "Plans", PlansPageBase.class),
    MORE("more", "More", MorePageBase.class);

    private String value;
    private String valueInId;
    private Class<? extends AbstractPage> pageClass;

    BottomBarButton(String value, String valueInId, Class<? extends AbstractPage> pageClass) {
        this.value = value;
        this.valueInId = valueInId;
        this.pageClass = pageClass;
    }

    public String getValue() {
        return value;
    }

    public Class<? extends AbstractPage> getPageClass() {
        return pageClass;
    }

    public String getValueInId() {
        return valueInId;
    }
}
