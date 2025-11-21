package com.web.base.pages;

import com.web.base.pageElement.BeinButton;
import com.web.base.pageElement.BeinTextBox;
import com.web.base.pageElement.PageElementModel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoginPage {
    private static final Log log = LogFactory.getLog(LoginPage.class);
    private static BeinTextBox TXT_Email=new BeinTextBox(PageElementModel.selectorNames.CSS_SELECTOR,"input[data-cy=\"unified-email-input\"]\n");
    private static BeinTextBox TXT_Password=new BeinTextBox(PageElementModel.selectorNames.ID,"pass");
    public static String USER_EMAIL = System.getenv("USER_EMAIL");
    public static String USER_PASSWORD = System.getenv("USER_PASSWORD");
    private static BeinButton BTN_Login=new BeinButton(PageElementModel.selectorNames.ID,"login-button");

    public void fillLoginForm(){
        log.debug("Fiiling Login Form");
        TXT_Email.type(USER_EMAIL);
    }
}
