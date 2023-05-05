package com.ui_katalogkit.common.UiCatalogPagesBase.enums;

import com.ui_katalogkit.common.*;
import com.ui_katalogkit.common.ActivityIndicatorsPagesBase.ActivityIndicatorsPageBase;
import com.ui_katalogkit.common.AlertViewsPagesBase.AlertViewsPageBase;
import com.ui_katalogkit.common.ButtonsPagesBase.ButtonsPageBase;
import com.ui_katalogkit.common.DatePickerPagesBase.DatePickerPageBase;
import com.ui_katalogkit.common.ImageViewPagesBase.ImageViewPageBase;
import com.ui_katalogkit.common.PageControlPagesBase.PageControlPageBase;
import com.ui_katalogkit.common.PickerViewPagesBase.PickerViewPageBase;
import com.ui_katalogkit.common.ProgressViewsPagesBase.ProgressViewsPageBase;
import com.ui_katalogkit.common.SearchPagesBase.SearchPageBase;
import com.ui_katalogkit.common.SegmentedControlsPagesBase.SegmentedControlsPageBase;
import com.ui_katalogkit.common.SlidersPagesBase.SlidersPageBase;
import com.ui_katalogkit.common.StackViewsPagesBase.StackViewsPageBase;
import com.ui_katalogkit.common.SteppersPagesBase.SteppersPageBase;
import com.ui_katalogkit.common.SwitchesPagesBase.SwitchesPageBase;
import com.ui_katalogkit.common.TextFieldsPagesBase.TextFieldsPageBase;
import com.ui_katalogkit.common.ToolbarsPagesBase.ToolbarsPageBase;
import com.ui_katalogkit.common.WebViewPagesBase.WebViewPageBase;

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