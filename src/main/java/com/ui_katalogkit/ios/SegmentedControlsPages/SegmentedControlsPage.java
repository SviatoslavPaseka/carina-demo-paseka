package com.ui_katalogkit.ios.SegmentedControlsPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.SegmentedControlsPagesBase.SegmentedControlsPageBase;
import com.ui_katalogkit.common.SegmentedControlsPagesBase.enums.SegmentedControlsMenuName;
import com.ui_katalogkit.common.SegmentedControlsPagesBase.enums.SegmentedControlsName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SegmentedControlsPageBase.class)
public class SegmentedControlsPage extends SegmentedControlsPageBase {
    public SegmentedControlsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Segmented Controls']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement segmentedControlMenuName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='false']/following-sibling::XCUIElementTypeCell[1]/child::XCUIElementTypeSegmentedControl/child::*[@name='%s']")
    private ExtendedWebElement segmentedControl;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextFromSegmentedControlMenuName(SegmentedControlsMenuName menuName){
        return segmentedControlMenuName.format(menuName.getValue()).getText();
    }

    @Override
    public void clickOnSegmentedControlTabByMenuNameAndSegmentedControlName(SegmentedControlsMenuName menuName, SegmentedControlsName controlsName){

        if (controlsName == SegmentedControlsName.AIRPLANE || controlsName == SegmentedControlsName.GIFT || controlsName == SegmentedControlsName.BURST){
            segmentedControl.format(SegmentedControlsMenuName.CUSTOM_SEGMENTS.getValue(), controlsName.getValue()).click();
        }else {
            segmentedControl.format(menuName.getValue(), controlsName.getValue()).click();
        }
    }

    @Override
    public boolean isSegmentedControlTabSelected(SegmentedControlsMenuName menuName, SegmentedControlsName controlsName){

        if (controlsName == SegmentedControlsName.AIRPLANE || controlsName == SegmentedControlsName.GIFT || controlsName == SegmentedControlsName.BURST){
            return segmentedControl.format(SegmentedControlsMenuName.CUSTOM_SEGMENTS.getValue(), controlsName.getValue()).getText().equals("1");
        }else {
            return segmentedControl.format(menuName.getValue(), controlsName.getValue()).getText().equals("1");
        }
    }

    @Override
    public boolean isSegmentedControlTabEnabled(SegmentedControlsMenuName menuName, SegmentedControlsName controlsName){

        if (controlsName == SegmentedControlsName.AIRPLANE || controlsName == SegmentedControlsName.GIFT || controlsName == SegmentedControlsName.BURST){
            return Boolean.parseBoolean(segmentedControl.format(SegmentedControlsMenuName.CUSTOM_SEGMENTS.getValue(), controlsName.getValue()).getAttribute("enabled"));
        }else {
            return Boolean.parseBoolean(segmentedControl.format(menuName.getValue(), controlsName.getValue()).getAttribute("enabled"));
        }
    }
}