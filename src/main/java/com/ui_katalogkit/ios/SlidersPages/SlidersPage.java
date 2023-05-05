package com.ui_katalogkit.ios.SlidersPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.SlidersPagesBase.SlidersPageBase;
import com.ui_katalogkit.common.SlidersPagesBase.enums.SliderName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SlidersPageBase.class)
public class SlidersPage extends SlidersPageBase {
    Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public SlidersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Sliders']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement sliderMenuName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='false']/following-sibling::XCUIElementTypeCell[1]/child::XCUIElementTypeSlider")
    private ExtendedWebElement slider;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getSliderNameText(SliderName sliderName){
        return sliderMenuName.format(sliderName.getValue()).getText();
    }

    @Override
    public String getValueFromSlider(SliderName sliderName){
        return slider.format(sliderName.getValue()).getAttribute("value");
    }

    @Override
    public void moveSliderPointer(SliderName sliderName, double to){
//        LOGGER.info("___"  + String.valueOf(to));
//        LOGGER.info("___" + String.valueOf(Double.valueOf(to/100)));
//        LOGGER.info("___" + String.valueOf(Math.round(Double.valueOf(to/100)*100.0)/100.0));
        slider.format(sliderName.getValue()).type(String.valueOf(Math.round(Double.valueOf(to/100)*100.0)/100.0));
    }
}