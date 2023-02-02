package com.mfp.android;

import com.mfp.common.MFPCommonPageBase;
import com.mfp.common.componentsBase.BottomNavigationBarBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MFPCommonPage extends MFPCommonPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/bottomNavigationBar")
    private BottomNavigationBarBase bottomNavigationBar;
    public MFPCommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isBottomNavigationBarPresent(){
        return bottomNavigationBar.isPresent();
    }

    @Override
    public AbstractPage clickMenuIcon(BottomBarButton bottomBarButton){
        return bottomNavigationBar.clickMenuIcon(bottomBarButton);
    }
}
