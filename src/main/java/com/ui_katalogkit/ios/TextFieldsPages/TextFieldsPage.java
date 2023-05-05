package com.ui_katalogkit.ios.TextFieldsPages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.ui_katalogkit.common.TextFieldsPagesBase.enums.TextFieldName;
import com.ui_katalogkit.common.TextFieldsPagesBase.TextFieldsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = TextFieldsPageBase.class)
public class TextFieldsPage extends TextFieldsPageBase {
    public TextFieldsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Text Fields']")
    private ExtendedWebElement pageName;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='true']")
    private ExtendedWebElement textAboveTextField;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='%s'][@accessible='false']/following-sibling::XCUIElementTypeCell[1]/child::XCUIElementTypeTextField")
    private ExtendedWebElement textField;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Clear text']")
    private ExtendedWebElement clearTextInSearchTextFieldButton;

    @FindBy(xpath = "//XCUIElementTypeKey[@name='%s']")
    private ExtendedWebElement keyOnKeyBoard;


    @Override
    public boolean isOpened() {
        return pageName.isElementPresent();
    }

    @Override
    public String getTextFromTextAboveTextField(TextFieldName textFieldName){
        return textAboveTextField.format(textFieldName.getValue()).getText();
    }

    @Override
    public String getTextFromTextField(TextFieldName textFieldName){
        return textField.format(textFieldName.getValue()).getAttribute("value");
    }

    @Override
    public void typeTextToTextField(TextFieldName textFieldName, String text){
        textField.format(textFieldName.getValue()).type(text);
    }

    @Override
    public boolean isClearButtonPresent(){
        return clearTextInSearchTextFieldButton.isElementPresent(3);
    }

    @Override
    public void clearTextInSearchTextField(){
        Assert.assertTrue(isClearButtonPresent(), "[TEXT FIELD] clear button is not present (this is possible because the search field is empty)");
        clearTextInSearchTextFieldButton.click();
    }

    @Override
    public void clickOnTextField(TextFieldName textFieldName){
        textField.format(textFieldName.getValue()).click();
    }
}