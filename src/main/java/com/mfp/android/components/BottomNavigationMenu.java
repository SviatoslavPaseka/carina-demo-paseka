package com.mfp.android.components;

import com.mfp.common.componentsBase.BottomNavigationMenuBase;
import com.mfp.common.enums.MenuButton;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = BottomNavigationMenuBase.class)
public class BottomNavigationMenu extends BottomNavigationMenuBase implements ICustomTypePageFactory {

    @FindBy(id = "com.myfitnesspal.android:id/action_%s")
    private ExtendedWebElement menuIcon;


    public BottomNavigationMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage clickMenuIcon (MenuButton menuButton){
        menuIcon.format(menuButton.getValue()).click();
        return initPage(getDriver(), menuButton.getPages());
    }

}
