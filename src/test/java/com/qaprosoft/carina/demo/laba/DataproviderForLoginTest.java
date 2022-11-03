package com.qaprosoft.carina.demo.laba;

import org.testng.annotations.DataProvider;

public class DataproviderForLoginTest{
//	final String nickanameTest = "testNick3";
//    final String emailTest = "kpitya01@gmail.com";
//    final String passTest = "768124zzXX#";
	@DataProvider(parallel = false, name = "DP1")
    public static Object[][] dataprovider() {
        return new Object[][]{
                {"", "", "Заповніть це поле."},
                {"some@gmail.com", "", "Заповніть це поле."},
                {"", "qwe22ut##", "Заповніть це поле."},
                {"some@email.com", "1111", "Виберіть потрібний формат."},
                {"email-without.com", "7355608zxC", "Електронна адреса має містити знак \"@\". В електронній адресі \"email-without.com\" знака \"@\" немає."},
                {"kpitya01@gmail.com", "qwert", "Виберіть потрібний формат."},
                {"kpitya01@", "qwert123123", "Введіть частину електронної адреси після знака \"@\". Електронна адреса \"kpitya01@\" неповна."},
                {"@gmail.com", "qwert", "Введіть частину електронної адреси до знака \"@\". Електронна адреса \"@gmail.com\" неповна."},
        		};
    }
}
