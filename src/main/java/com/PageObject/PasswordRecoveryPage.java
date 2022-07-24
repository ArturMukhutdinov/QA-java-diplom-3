package com.PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PasswordRecoveryPage {

    // button Войти
    @FindBy(how = How.CSS,using = ".Auth_link__1fOlj")
    public SelenideElement enterButton;

    // click Enter button
    public void clickEnterButtonOnForgotPassPage() {
        enterButton.click();
    }

}
