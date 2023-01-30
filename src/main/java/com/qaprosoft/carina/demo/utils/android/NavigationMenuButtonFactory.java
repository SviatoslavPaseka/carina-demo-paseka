package com.qaprosoft.carina.demo.utils.android;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.ChartsPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.MapPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.UIElementsPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.WebViewPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.NavMenuBtn;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class NavigationMenuButtonFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private static AbstractPage abstractPage;

    public static AbstractPage getPageByName (NavMenuBtn navMenuBtn, WebDriver driver){

        switch (navMenuBtn){
            case WEB_VIEW:{
                abstractPage = new WebViewPage(driver);
                break;
            }
            case CHARTS:{
                abstractPage = new ChartsPage(driver);
                break;
            }
            case MAP: {
                abstractPage = new MapPage(driver);
                break;
            }
            case UI_ELEMENTS:{
                abstractPage = new UIElementsPage(driver);
                break;
            }
            default:{

            }
        }
        return abstractPage;
    }
}