package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MapPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ZoomButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MapPageBase.class)
public class MapPage extends MapPageBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//android.widget.TextView[@text = 'Map']")
    private ExtendedWebElement mapLabel;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Zoom in']")
    private ExtendedWebElement zoomIn;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Zoom in']/following-sibling::*")
    private ExtendedWebElement zoomOut;

    public MapPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isZoomButtonPresent(ZoomButton zoomBth) {
        if (zoomBth == ZoomButton.IN) {
            return zoomIn.isElementPresent();
        } else {
            return zoomOut.isElementPresent();
        }
    }
    @Override
    public boolean isOpened(){
        return mapLabel.isElementPresent();
    }

    @Override
    public int getZoomBtnYCoordinate(ZoomButton zoomBtn){
        if (zoomBtn == ZoomButton.IN){
            return zoomIn.getLocation().getY();
        }else {
            return zoomOut.getLocation().getY();
        }
    }
    @Override
    public boolean isZoomInAboveZoomOut(){
        LOGGER.info("Zoom out: " + zoomOut.getAttribute("content-desc"));
        return zoomOut.getAttribute("content-desc").trim().equals("Zoom out");
    }
}