package com.ui_katalogkit.ios.PickerViewPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.PickerViewPagesBase.PickerViewPageBase;
import com.ui_katalogkit.common.PickerViewPagesBase.enums.ColorPicker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PickerViewPageBase.class)
public class PickerViewPage extends PickerViewPageBase {
    public PickerViewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Picker View']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypePickerWheel[@name='%s color component value']")
    private ExtendedWebElement colorPickerWheel;

    @FindBy(xpath = "//XCUIElementTypePicker/following-sibling::XCUIElementTypeOther")
    private ExtendedWebElement boardWithColor;


    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public void setColorShadeByColor(ColorPicker colorPicker, int colorShade){
        Assert.assertTrue(colorShade > 0 && colorShade < 256, "[PICKER VIEW] Color shade value is not in range (0, 255)");
        colorPickerWheel.format(colorPicker.getValue()).type(String.valueOf(colorShade));
    }

    @Override
    public String getColorShadeFromColorWheelByColor(ColorPicker colorPicker){
        return colorPickerWheel.format(colorPicker.getValue()).getText();
    }
}