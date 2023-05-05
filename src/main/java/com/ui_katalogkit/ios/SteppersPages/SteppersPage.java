package com.ui_katalogkit.ios.SteppersPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.SteppersPagesBase.SteppersPageBase;
import com.ui_katalogkit.common.SteppersPagesBase.enums.IncrementDecrement;
import com.ui_katalogkit.common.SteppersPagesBase.enums.TextStepper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SteppersPageBase.class)
public class SteppersPage extends SteppersPageBase {
    Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public SteppersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Steppers']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement textAboveStepper;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='false']/following-sibling::XCUIElementTypeCell[1]/child::XCUIElementTypeButton[@name='%s']")
    private ExtendedWebElement changerButton;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='false']/following-sibling::XCUIElementTypeCell[1]/child::XCUIElementTypeStaticText")
    private ExtendedWebElement valueOfStepper;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextAboveStepper(TextStepper textStepper){
        return textAboveStepper.format(textStepper.getValue()).getText();
    }

    @Override
    public boolean isChangerButtonEnabled(TextStepper textStepper, IncrementDecrement incrementDecrement){
        return Boolean.parseBoolean(changerButton.format(textStepper.getValue(), incrementDecrement.getValue()).getAttribute("enabled"));
    }

    @Override
    public void clickOnChangerButton(TextStepper textStepper, IncrementDecrement incrementDecrement){
        Assert.assertTrue(isChangerButtonEnabled(textStepper, incrementDecrement), "[STEPPERS] Changer button " + textStepper.getValue()+ " " + incrementDecrement.getValue() + " is not enabled");
        changerButton.format(textStepper.getValue(), incrementDecrement.getValue()).click();
    }


    @Override
    public void clickOnChangerButton(TextStepper textStepper, IncrementDecrement incrementDecrement, int numberTimes){
        if (numberTimes < 0 || numberTimes > 10){
            Assert.fail("[STEPPERS] number of clicking must be in range (0-10)");
        }
        for (int i = 1; i <= numberTimes; i++) {
            LOGGER.info("Click number: " + i);
            clickOnChangerButton(textStepper, incrementDecrement);
        }
    }

    @Override
    public String getValueOfStepper(TextStepper textStepper){
        return valueOfStepper.format(textStepper.getValue()).getText();
    }
}