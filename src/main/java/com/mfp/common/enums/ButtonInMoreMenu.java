package com.mfp.common.enums;

import com.mfp.common.QuickAddPageBase;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum ButtonInMoreMenu {
    QUICK_ADD("quick_add", "Quick Add", QuickAddPageBase.class),
    REMINDERS("reminders", "Reminders", null);

    private String value;
    private String nameOfButton;
    private Class<? extends AbstractPage> pageClass;

    ButtonInMoreMenu(String value, String nameOfButton, Class<? extends AbstractPage> pageClass) {
        this.value = value;
        this.nameOfButton = nameOfButton;
        this.pageClass = pageClass;
    }

    public String getValue() {
        return value;
    }

    public String getNameOfButton() {
        return nameOfButton;
    }

    public Class<? extends AbstractPage> getPageClass() {
        return pageClass;
    }
}
