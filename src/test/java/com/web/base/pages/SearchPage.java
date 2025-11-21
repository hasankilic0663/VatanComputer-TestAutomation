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

    private static BeinButton checkBox = new BeinButton(PageElementModel.selectorNames.XPATH,"//*[text()='70000 - 99999 TL']");

    //span[.='70000 - 99999 TL']
    public void searchArama() throws InterruptedException {
        log.debug("Search kelimesi yapılır.");
        TXT_Search.type("Lenovo");
        BTN_Search.waitUntilVisibleAndClick();
        checkBox.scrollToElement();
        Thread.sleep(3000);


    }



}
