package com.web.base.pages;

import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.BeinLabel;
import com.web.base.pageElement.BeinTextBox;
import com.web.base.pageElement.PageElementModel;
import junit.framework.Assert;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.assertj.core.api.Assertions;

public class LoginPage {
    private static final Log log = LogFactory.getLog(LoginPage.class);
    private static BeinTextBox TXT_Email=new BeinTextBox(PageElementModel.selectorNames.ID,"email");
    private static BeinTextBox TXT_Password=new BeinTextBox(PageElementModel.selectorNames.ID,"pass");
    public static String USER_EMAIL = System.getenv("USER_EMAIL");
    public static String USER_PASSWORD = System.getenv("USER_PASSWORD");
    private static BeinButton BTN_Login=new BeinButton(PageElementModel.selectorNames.ID,"login-button");
    private static BeinButton BTN_Hesabim=new BeinButton(PageElementModel.selectorNames.ID,"btnMyAccount");
    private static BeinButton BTN_Uyegilim=new BeinButton(PageElementModel.selectorNames.CSS_SELECTOR,"[href='/uyeBilgi/uyeBilgi']");



    private static BeinLabel label_EmailDogrulama=new BeinLabel(PageElementModel.selectorNames.CSS_SELECTOR,"input.form-control.email-input");

    private static BeinButton BTN_Cookie = new BeinButton(PageElementModel.selectorNames.XPATH,"//button[@class='cc-nb-okagree']");

    public void fillLoginForm(){
        log.debug("Fiiling Login Form");
        BTN_Cookie.clickAndWait();
        TXT_Email.type(USER_EMAIL);
        TXT_Password.type(USER_PASSWORD);

        BTN_Login.clickAndWait();


    }
    public void loginAssert(){
        BTN_Hesabim.clickAndWait();
        BTN_Uyegilim.clickAndWait();
        Assert.assertEquals("Hata oldu asdsad",USER_EMAIL,label_EmailDogrulama.getLabelTextAndTextBox());

    }
}
