package com.mfp.ios.components;


import com.mfp.common.componentsBase.BottomNavigationBarBase;
import com.mfp.common.enums.BottomBarButton;
import com.qaprosoft.carina.core.foundation.exception.NotImplementedException;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.ICustomTypePageFactory;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = BottomNavigationBarBase.class)
public class BottomNavigationBar extends BottomNavigationBarBase implements ICustomTypePageFactory {

    public BottomNavigationBar(WebDriver driver) {
        super(driver);
    }
    public BottomNavigationBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public AbstractPage clickMenuIcon (BottomBarButton barButton){
        throw new NotImplementedException();
    }

    @Override
    public boolean isBottomNavBarPresent (){
        throw new NotImplementedException();
    }

    @Override
    public Boolean isBottomNavBarClickable(BottomBarButton bottomBarButton){
        throw new NotImplementedException();
    }
}
