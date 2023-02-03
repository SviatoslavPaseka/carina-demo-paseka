package com.mfp.android;

import com.mfp.android.components.BottomNavigationBar;
import com.mfp.common.*;
import com.mfp.common.componentsBase.BottomNavigationBarBase;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MFPCommonPageBase.class)
public class MFPCommonPage extends MFPCommonPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/bottomNavigationBar")
    private BottomNavigationBar bottomNavigationBar;

    @FindBy(id = "com.myfitnesspal.android:id/progressPleaseWait")
    private ExtendedWebElement spinner;


    public MFPCommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BottomNavigationBarBase getBottomNavigationBar() {
        return bottomNavigationBar;
    }

    @Override
    public DashboardPageBase login(String email, String password){
        MFPWelcomePageBase welcomePage = initPage(getDriver(), MFPWelcomePageBase.class);
        Assert.assertTrue(welcomePage.isOpened(), "[WELCOME PAGE] is not opened");
        MFPLogInPageBase logInPage = welcomePage.clickLoginButton();
        Assert.assertTrue(logInPage.isOpened(), "[LOGIN PAGE] is not opened after taping login button on welcome page");

        logInPage.typeEmail(email);
        logInPage.typePassword(password);
        Assert.assertTrue(logInPage.isLoginButtonEnabled(), "[LOGIN PAGE] login button is not enabled after filling email and password");
        waitUntil(ExpectedConditions.invisibilityOf(spinner.getElement()), 20);
        UserTutorialPageBase userTutorialPage = logInPage.clickLoginButton();
        return userTutorialPage.clickCloseButton();
    }

    @Override
    public DashboardPageBase defaultLogin(){
        return login(R.TESTDATA.get("credentials.mfp.email"),
                R.TESTDATA.get("credentials.mfp.password"));
    }
}
