package com.ui_katalogkit.ios.StackViewsPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.StackViewsPagesBase.StackViewsPageBase;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.IncrementDecrement;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.NumberOfSquare;
import com.ui_katalogkit.common.StackViewsPagesBase.enums.TypeDetail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = StackViewsPageBase.class)
public class StackViewsPage  extends StackViewsPageBase {
    public StackViewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Stack Views']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Showing/hiding views']")
    private ExtendedWebElement showingHidingText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']")
    private ExtendedWebElement detailText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Footer Label']")
    private ExtendedWebElement footerLabel;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Add/remove views']")
    private ExtendedWebElement addRemoveText;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']/following-sibling::XCUIElementTypeButton")
    private ExtendedWebElement detailChanger;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Add/remove views']/following-sibling::*[@name='stepper %s']")
    private ExtendedWebElement addRemoveChangers;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']/following-sibling::XCUIElementTypeTextField")
    private ExtendedWebElement textField;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Add/remove views']/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/child::XCUIElementTypeOther[%s]")
    private ExtendedWebElement square;

    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public boolean isDetailTextPresent(TypeDetail typeDetail){
        return detailText.format(typeDetail.getValue()).isElementPresent(3);
    }

    @Override
    public String getTextFromDetailTextPresent(TypeDetail typeDetail){
        Assert.assertTrue(isDetailTextPresent(typeDetail), "[STACK VIEWS] detail label " + typeDetail.getValue() + " is not present");
        return detailText.format(typeDetail.getValue()).getText();
    }

    @Override
    public boolean isTextFieldPresent(TypeDetail typeDetail){
        return textField.format(typeDetail.getValue()).isElementPresent(3);
    }

    @Override
    public void typeTextToTextField(TypeDetail typeDetail, String text){
        Assert.assertTrue(isTextFieldPresent(typeDetail), "[STACK VIEWS] text field " + typeDetail.getValue() + " is not present");
        textField.format(typeDetail.getValue()).type(text);
    }

    @Override
    public String getTextFromTextField(TypeDetail typeDetail){
        Assert.assertTrue(isTextFieldPresent(typeDetail), "[STACK VIEWS] text field " + typeDetail.getValue() + " is not present");
        return textField.format(typeDetail.getValue()).getText();
    }

    @Override
    public boolean isDetailChangerPresent(TypeDetail typeDetail){
        return detailChanger.format(typeDetail.getValue()).isElementPresent(3);
    }

    @Override
    public void clickDetailChanger(TypeDetail typeDetail){
        Assert.assertTrue(isDetailChangerPresent(typeDetail), "[STACK VIEWS] changer " + typeDetail.getValue() + " is not present");
        detailChanger.format(typeDetail.getValue()).click();
    }

    @Override
    public boolean isAddRemoveChangerEnabled(IncrementDecrement incrementDecrement){
        return Boolean.parseBoolean(addRemoveChangers.format(incrementDecrement.getValue()).getAttribute("enabled"));
    }

    @Override
    public void clickAddRemoveChanger (IncrementDecrement incrementDecrement){
        Assert.assertTrue(isAddRemoveChangerEnabled(incrementDecrement), "[STACK VIEWS] add remove changer " + incrementDecrement.getValue() + " is not enabled");
        addRemoveChangers.format(incrementDecrement.getValue()).click();
    }

    @Override
    public boolean isSquarePresent(NumberOfSquare numberOfSquare){
        return square.format(numberOfSquare.getNumber()).isElementPresent(3);
    }
}