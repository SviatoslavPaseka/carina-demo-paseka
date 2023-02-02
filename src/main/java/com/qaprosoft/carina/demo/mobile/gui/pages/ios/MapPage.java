package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MapPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ZoomButton;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MapPageBase.class)
public class MapPage extends MapPageBase {
    private static final String THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID = "This method is not yet implemented for iOS";

    public MapPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isZoomButtonPresent(ZoomButton zoomBth) {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }
    @Override
    public boolean isOpened(){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public int getZoomBtnYCoordinate(ZoomButton zoomBtn){
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }

    @Override
    public boolean isZoomInAboveZoomOut() {
        throw new UnsupportedOperationException(THIS_METHOD_IS_DEFINED_ONLY_IN_ANDROID);
    }
}
