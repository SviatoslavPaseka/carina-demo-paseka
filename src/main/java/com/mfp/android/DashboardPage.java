package com.mfp.android;

import com.mfp.common.DashboardPageBase;
import com.mfp.common.componentsBase.BottomNavigationMenuBase;
import com.mfp.common.enums.MenuButton;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DashboardPageBase.class)
public class DashboardPage extends DashboardPageBase {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/bottomNavigationBar")
    private BottomNavigationMenuBase bottomNavigationMenu;
    @Override
    public AbstractPage openPageInMenu (MenuButton menuButton){
        return bottomNavigationMenu.clickMenuIcon(menuButton);
    }
}
