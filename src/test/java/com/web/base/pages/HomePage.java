package com.web.base.pages;

import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.BeinTextBox;
import com.web.base.pageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final Log log = LogFactory.getLog(HomePage.class);
    private static BeinButton BTN_Login=new BeinButton(PageElementModel.selectorNames.XPATH,"//*[@id=\"page-header\"]/section/div[2]/div[1]/div[3]/div[1]/div/button");
    private static BeinButton firstCity =
            new BeinButton(PageElementModel.selectorNames.XPATH, "(//li[@aria-label='Destinasyon Antalya, Türkiye (Şehir)'])[1]");
    private static BeinButton july1 =
            new BeinButton(PageElementModel.selectorNames.XPATH, "(//div[@class='PriceSurgePicker-Day__circle PriceSurgePicker-Day__circle--filled PriceSurgePicker-Day__circle--selected PriceSurgePicker-Day__circle--wide'])[1]");
    private static BeinButton july6 =
            new BeinButton(PageElementModel.selectorNames.XPATH, "//div[@role='button' and contains(@aria-label,'Jul 06 2026') and @aria-disabled='false'");
    private static BeinButton nextMonth=
            new BeinButton(PageElementModel.selectorNames.XPATH, "//button[@aria-label='Next Month']");

    private static BeinButton loginButton = new BeinButton(PageElementModel.selectorNames.XPATH, "(//button[contains(@data-element-name,'sign-in-button')])[1]");
    public static  String sehirText = System.getenv("SEHIR");
    private static BeinTextBox searchSehirArama = new BeinTextBox(PageElementModel.selectorNames.XPATH,
            "//input[@id='textInput']");
    public void loginPageEnter(){
        log.info("ENTERING LOGIN PAGE");
        BTN_Login.clickAndWait(2);
    }

    public void loginSet() {
        log.info("loginSet Çalıştı");



        loginButton.click();
    }

    public void searchSehirAramaSet() throws InterruptedException {
        log.info("Şehir arama başladı.");
        searchSehirArama.waitUntilVisibleAndType(sehirText);

        firstCity.waitUntilVisibleAndClick();
        nextMonth.waitUntilVisibleAndClick();
        nextMonth.waitUntilVisibleAndClick();
        nextMonth.waitUntilVisibleAndClick();
        nextMonth.waitUntilVisibleAndClick();
        nextMonth.waitUntilVisibleAndClick();
        nextMonth.waitUntilVisibleAndClick();
        nextMonth.waitUntilVisibleAndClick();
        Thread.sleep(2000);
        //searchSehirArama.type(String.valueOf(Keys.TAB));
        // firstCity.click();
        july1.click();
        july6.click();
    }

}
