package com.web.base.pages;

import com.thoughtworks.gauge.Step;
import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.BeinTextBox;
import com.web.base.pageElement.PageElementModel;
import com.web.base.utils.driver.Driver;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final Log log = LogFactory.getLog(HomePage.class);
    private static BeinButton BTN_Login=new BeinButton(PageElementModel.selectorNames.ID,"btnMyAccount");
    private static BeinButton btnLogin_Dropdown =
            new BeinButton(PageElementModel.selectorNames.XPATH, "//li[contains(.,'Giriş Yap')]");
    private static BeinButton july1 =
            new BeinButton(PageElementModel.selectorNames.XPATH, "(//div[@class='PriceSurgePicker-Day__circle PriceSurgePicker-Day__circle--filled PriceSurgePicker-Day__circle--selected PriceSurgePicker-Day__circle--wide'])[1]");
    private static BeinButton july6 =
            new BeinButton(PageElementModel.selectorNames.XPATH, "//div[@role='button' and contains(@aria-label,'Jul 06 2026') and @aria-disabled='false'");
    private static BeinButton nextMonth=
            new BeinButton(PageElementModel.selectorNames.XPATH, "//button[@aria-label='Next Month']");


    public static  String sehirText = System.getenv("SEHIR");
    private static BeinTextBox searchSehirArama = new BeinTextBox(PageElementModel.selectorNames.XPATH,
            "//input[@id='textInput']");


    public void loginSet() {
        log.info("loginSet Çalıştı");

        BTN_Login.clickAndWait(2);


        btnLogin_Dropdown.waitUntilVisibleAndClick();



    }


    public void searchSehirAramaSet() throws InterruptedException {
        log.info("Şehir arama başladı.");

    }

}
