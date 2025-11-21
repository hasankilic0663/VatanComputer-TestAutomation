package com.web.base.pageElement;

import org.openqa.selenium.WebElement;

public class BeinLabel extends PageElementModel {

    public BeinLabel(selectorNames selectorName, String selectorValue) {
        super(selectorName, selectorValue);
    }

    public String getLabelText(){
        return getWebElement().getText();
    }


    public String getLabelTextAndTextBox(){
        WebElement element = getWebElement();
        String text = element.getText();
        if(text.isEmpty() && element.getTagName().equals("input")){
            text = element.getAttribute("value");
        }
        return text;
    }
}
