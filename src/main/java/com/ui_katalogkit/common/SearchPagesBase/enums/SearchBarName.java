package com.ui_katalogkit.common.SearchPagesBase.enums;

import com.ui_katalogkit.common.ParentPageBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchBarPagesBase.CustomSearchBarBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchBarPagesBase.DefaultSearchBarBase;

public enum SearchBarName {
    DEFAULT( "Default", DefaultSearchBarBase.class), CUSTOM("Custom", CustomSearchBarBase.class);

    private String value;
    private Class<? extends ParentPageBase> pageClass;

    SearchBarName(String value, Class<? extends ParentPageBase> pageClass) {
        this.value = value;
        this.pageClass = pageClass;
    }

    public String getValue() {
        return value;
    }

    public Class<? extends ParentPageBase> getPageClass() {
        return pageClass;
    }
}