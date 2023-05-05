package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.PickerViewPagesBase.PickerViewPageBase;
import com.ui_katalogkit.common.PickerViewPagesBase.enums.ColorPicker;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class PickerViewPageTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void clickingOnPageIndicators() {
        LOGGER.info("Start test");
        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);

        PickerViewPageBase pickerViewPage = (PickerViewPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.PICKER_VIEW);

        for (ColorPicker colorPicker: ColorPicker.values()) {
            pickerViewPage.setColorShadeByColor(colorPicker, 100);
        }

        for (ColorPicker colorPicker: ColorPicker.values()) {
            LOGGER.info(pickerViewPage.getColorShadeFromColorWheelByColor(colorPicker));
        }

    }
}
