package com.mfp.common.enums;

import com.mfp.common.QuickAddPageBase;
import com.mfp.common.RemaindersPageBase;
import com.qaprosoft.carina.core.gui.AbstractPage;

public enum ButtonInMoreMenu {
    QUICK_ADD("quick_add", "Quick Add", QuickAddPageBase.class),
    REMINDERS("reminders", "Reminders", RemaindersPageBase.class);

    private String buttonId;
    private String nameOfButton;
    private Class<? extends AbstractPage> pageClass;

    ButtonInMoreMenu(String value, String nameOfButton, Class<? extends AbstractPage> pageClass) {
        this.buttonId = value;
        this.nameOfButton = nameOfButton;
        this.pageClass = pageClass;
    }

    public String getButtonId() {
        return buttonId;
    }

    public String getNameOfButton() {
        return nameOfButton;
    }

    public Class<? extends AbstractPage> getPageClass() {
        return pageClass;
    }
}
