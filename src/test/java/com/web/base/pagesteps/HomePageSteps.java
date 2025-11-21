package com.web.base.pagesteps;

import com.thoughtworks.gauge.Step;
import com.web.base.pages.HomePage;
//HomePage
public class HomePageSteps extends HomePage {
    HomePage homePage=new HomePage();

    @Step("Login sayfasına gidilir.")
    public void goLogin(){
        homePage.loginPageEnter();
    }

    @Step("Login sayfasına gideriz")
    public void loginGecis() {
        loginSet();

    }
    @Step("Sehir arama yapılır")
    public void sehirAramaYap() throws InterruptedException {
        searchSehirAramaSet();
    }

}
