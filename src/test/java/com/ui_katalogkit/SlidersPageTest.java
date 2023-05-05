package com.ui_katalogkit;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.ui_katalogkit.common.SlidersPagesBase.SlidersPageBase;
import com.ui_katalogkit.common.SlidersPagesBase.enums.SliderName;
import com.ui_katalogkit.common.UiCatalogPagesBase.UiCatalogPageBase;
import com.ui_katalogkit.common.UiCatalogPagesBase.enums.UiKitCatalogNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class SlidersPageTest implements IAbstractTest, IMobileUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @BeforeTest
    public void before(){
        LOGGER.info("BEFORE BLOCK");
    }

    @Test()
    @MethodOwner(owner = "spaseka", platform = "IOS")
    @TestRailCases(testCasesId = "1")
    public void checkingAllFunctionality() {
        LOGGER.info("Start test");
        UiCatalogPageBase uiCatalogPage = initPage(getDriver(), UiCatalogPageBase.class);

        SlidersPageBase slidersPage = (SlidersPageBase) uiCatalogPage.tapToElementByName(UiKitCatalogNames.SLIDERS);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT));

        slidersPage.moveSliderPointer(SliderName.DEFAULT, 0);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 1);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 5);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 10);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 30);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 45);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 50);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 55);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 70);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 95);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
        slidersPage.moveSliderPointer(SliderName.DEFAULT, 100);

        LOGGER.info(slidersPage.getValueFromSlider(SliderName.DEFAULT) + "\n");
    }

}