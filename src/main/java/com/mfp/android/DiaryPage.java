package com.mfp.android;

import com.mfp.common.DiaryPageBase;
import com.mfp.common.componentsBase.BottomNavigationMenuBase;
import com.mfp.common.enums.MenuButton;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DiaryPage extends DiaryPageBase {

    public DiaryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "com.myfitnesspal.android:id/bottomNavigationBar")
    private BottomNavigationMenuBase bottomNavigationMenu;
    @Override
    public AbstractPage openPageInMenu (MenuButton menuButton){
        return bottomNavigationMenu.clickMenuIcon(menuButton);
    }
}
