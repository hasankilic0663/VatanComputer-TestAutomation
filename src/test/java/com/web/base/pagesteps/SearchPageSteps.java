package com.web.base.pagesteps;

import com.thoughtworks.gauge.Step;
import com.web.base.pages.LoginPage;
import com.web.base.pages.SearchPage;

public class SearchPageSteps {
    SearchPage searchPage=new SearchPage();

    @Step("İlgili arama yapılır.")
    public void searchKelime() throws InterruptedException {

        searchPage.searchArama();

    }

}
