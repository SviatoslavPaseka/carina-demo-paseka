package com.ui_katalogkit.common.ToolbarsPagesBase.enums;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems.CustomToolbarBase;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems.DefaultToolbarBase;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarItems.TintedToolbarBase;

public enum ToolbarName {
    DEFAULT("Default", DefaultToolbarBase.class),
    TINTED("Tinted", TintedToolbarBase.class),
    CUSTOM("Custom", CustomToolbarBase.class);

    private String value;
    private Class<? extends ParentPageBase> pageClass;

    public String getValue() {
        return value;
    }

    public Class<? extends ParentPageBase> getPageClass() {
        return pageClass;
    }

    ToolbarName(String value, Class<? extends ParentPageBase> pageClass) {
        this.value = value;
        this.pageClass = pageClass;
    }
}