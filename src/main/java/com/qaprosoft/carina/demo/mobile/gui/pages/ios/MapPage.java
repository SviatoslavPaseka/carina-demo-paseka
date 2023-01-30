package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MapPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ZoomBtn;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MapPageBase.class)
public class MapPage extends MapPageBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//android.widget.TextView[@text = 'Map']")
    private ExtendedWebElement mapLabel;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Zoom in']")
    private ExtendedWebElement zoomIn;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Zoom out']")
    private ExtendedWebElement zoomOut;

    public MapPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isZoomButtonPresent(ZoomBtn zoomBth) {
        throw  new NotImplementedException("Isn't realized in IOS");
    }
    @Override
    public boolean isOpened(){
        throw  new NotImplementedException("Isn't realized in IOS");
    }

    @Override
    public int getZoomBtnYCoordinate(ZoomBtn zoomBtn){
        throw  new NotImplementedException("Isn't realized in IOS");
    }
}
