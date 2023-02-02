package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.UIElementsPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = UIElementsPageBase.class)
public class UIElementsPage extends UIElementsPageBase implements IMobileUtils {
    private static final String THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID = "This method is not yet implemented for iOS";


    public UIElementsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeText(String text) {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public void typeEmail(String email) {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public String getEmail(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public String getText(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public String getDate(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public void typeDate(String date) {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public void clickOnMaleRadioButton() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public void clickOnFemaleRadioButton() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public void clickOnOtherRadioButton() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public boolean isFemaleRadioButtonSelected(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public boolean isOthersRadioButtonSelected(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public void checkCopy() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public boolean isCopyChecked(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public void swipeToFemaleRadioButton() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }
}
