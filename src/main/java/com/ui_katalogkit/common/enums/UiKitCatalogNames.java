package com.ui_katalogkit.common.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.ui_katalogkit.common.*;

public enum UiKitCatalogNames {
    ACTIVITY_INDICATORS("Activity Indicators", ActivityIndicatorsPageBase.class),
    ALERT_VIEWS("Alert Views", AlertViewsPageBase.class),
    BUTTONS("Buttons", ButtonsPageBase.class),
    DATE_PICKER("Date Picker", DatePickerPageBase.class),
    IMAGE_VIEW("Image View", ImageViewPageBase.class),
    PAGE_CONTROL("Page Control", PageControlPageBase.class),
    PICKER_VIEW("Picker View", PickerViewPageBase.class),
    PROGRESS_VIEWS("Progress Views", ProgressViewsPageBase.class),
    SEARCH("Search", SearchPageBase.class),
    SEGMENTED_CONTROLS("Segmented Controls", SegmentedControlsPageBase.class),
    SLIDERS("Sliders", SlidersPageBase.class),
    STACK_VIEWS("Stack Views", StackViewsPageBase.class),
    STEPPERS("Steppers", SteppersPageBase.class),
    SWITCHES("Switches", SwitchesPageBase.class),
    TEXT_FIELDS("Text Fields", TextFieldsPageBase.class),
    //TEXT_VIEW("Text View", TextFieldsPageBase.class),
    TOOLBARS("Toolbars", ToolbarsPageBase.class),
    WEB_VIEW("Web View", WebViewPageBase.class);

    private String elementName;
    private Class<? extends ParentPageBase> pageClass;

    UiKitCatalogNames(String elementName, Class <? extends ParentPageBase> pageClass) {
        this.elementName = elementName;
        this.pageClass = pageClass;
    }

    public String getElementName() {
        return elementName;
    }

    public Class<? extends ParentPageBase> getPageClass() {
        return pageClass;
    }
}