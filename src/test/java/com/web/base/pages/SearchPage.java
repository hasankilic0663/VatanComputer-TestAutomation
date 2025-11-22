package com.web.base.pages;

import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.BeinCheckBox;
import com.web.base.pageElement.BeinTextBox;
import com.web.base.pageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SearchPage {
    private static final Log log = LogFactory.getLog(SearchPage.class);
    private static BeinTextBox TXT_Search=new BeinTextBox(PageElementModel.selectorNames.ID,"navbar-search-input");
    private static BeinButton BTN_Search = new BeinButton(PageElementModel.selectorNames.CLASS_NAME,"search__button");

    private static BeinButton BTN_Filter= new BeinButton(PageElementModel.selectorNames.XPATH,"//span[.='70000 - 99999 TL']");
    //span[.='70000 - 99999 TL']

    private static BeinButton BTN_UrunSec = new BeinButton(PageElementModel.selectorNames.XPATH,"//img[@src='https://cdn.vatanbilgisayar.com/Upload/PRODUCT/lenovo/thumb/83e2002dtr_small.jpg']");
//span[.='Sepete Ekle']

    private static BeinButton BTN_SepeteEkle= new BeinButton(PageElementModel.selectorNames.XPATH,"//span[.='Sepete Ekle']");


    private static BeinButton goToBasketButton =
            new BeinButton(PageElementModel.selectorNames.CSS_SELECTOR,
                    ".btn.btn-dark-blue.goToBasket");

    public void searchArama() throws InterruptedException {
        log.debug("Search kelimesi yapılır.");
        TXT_Search.type("Lenovo");
        BTN_Search.waitUntilVisibleAndClick();
        BTN_Filter.scrollToElement();
        Thread.sleep(2000);
        BTN_Filter.waitUntilVisibleAndClick();
        Thread.sleep(3000);
        BTN_UrunSec.scrollToElement();
        BTN_UrunSec.click();
        Thread.sleep(1000);
        BTN_SepeteEkle.waitUntilVisibleAndClick();
        Thread.sleep(2000);
        goToBasketButton.waitUntilVisibleAndClick();
        Thread.sleep(2000);



    }



}
