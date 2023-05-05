package com.ui_katalogkit.common.AlertViewsPagesBase.enums;

import com.ui_katalogkit.common.AlertViewsPagesBase.alertWindows.*;
import com.ui_katalogkit.common.ParentPageBase;

public enum AlertViewsItem {
    SIMPLE("Simple", AlertSimplePageBase.class),
    OKAY_CANCEL("Okay / Cancel", AlertOkayCancelPageBase.class),
    OTHER("Other", AlertOtherPageBase.class),
    TEXT_ENTRY("Text Entry", AlertTextEntryPageBase.class),
    SECURE_TEXT_ENTRY("Secure Text Entry", AlertSecureTextEntryPageBase.class),
    CONFIRM_CANCEL("Confirm / Cancel", AlertConfirmCancelPageBase.class),
    DESTRUCTIVE("Destructive", AlertDestructivePageBase.class);

    private String value;
    private Class<? extends ParentPageBase> itemClass;

    AlertViewsItem(String value, Class<? extends ParentPageBase> itemClass) {
        this.value = value;
        this.itemClass = itemClass;
    }

    public String getValue() {
        return value;
    }

    public Class<? extends ParentPageBase> getItemClass() {
        return itemClass;
    }
}