package com.mfp.common.enums;

import com.mfp.common.CustomSummaryPageBase;
import com.mfp.common.DiaryPageBase;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum CustomDashboardButtons {
    CALORIE_FOCUS("rbCaloriesRem", DiaryPageBase.class), MACRONUTRIENT_FOCUS("rbMacrosRem", DiaryPageBase.class),
    HEART_HEALTHY("rbHeartHealthy", DiaryPageBase.class), LOW_CARB("rbLowCarb", DiaryPageBase.class),
    CUSTOM("rbCustomSummary", CustomSummaryPageBase.class);

    private final String buttonId;

    private final Class<? extends AbstractPage> pageClass;

    CustomDashboardButtons(String buttonId, Class<? extends AbstractPage> pageClass) {
        this.buttonId = buttonId;
        this.pageClass = pageClass;
    }

    public String getButtonId() {
        return buttonId;
    }

    public Class<? extends AbstractPage> getPageClass() {
        return pageClass;
    }
}
