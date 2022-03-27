package com.PageObject;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    public static final String BASE_URL = "https://stellarburgers.nomoreparties.site/";

        //локатор кнопки Личный Кабинет
        @FindBy(how = How.CLASS_NAME,using = "AppHeader_header__link__3D_hX")
        private SelenideElement personalAccount;

        //локатор кнопки Войти в аккаунт
        @FindBy(how = How.CLASS_NAME,using = "button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg")
        private SelenideElement enterInPersonalAccount;

        //локатор кнопки Конструктор
        @FindBy(how = How.CLASS_NAME,using = "AppHeader_header__linkText__3q_va ml-2")
        private SelenideElement constructorButton;

        //локатор логотипа Stellar Burgers
        @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/header/nav/div/a/svg")
        private SelenideElement linkStellarBurgers;

        //локатор кнопки выбора списка булок
        @FindBy(how = How.XPATH, using = ".//span [contains(text(),'Булки')]")
        private SelenideElement bunButton;

        //локатор кнопки выбора списка соусов
        @FindBy(how = How.XPATH, using = ".//span [contains(text(),'Соусы')]")
        private SelenideElement sauceButton;

        //локатор кнопки выбора списка начинок
        @FindBy(how = How.XPATH, using = ".//span [contains(text(),'Начинки')]")
        private SelenideElement staffButton;



    public MainPage() {
    }

        //метод кнопки Личный Кабинет
        public void clickPersonalAccount() {
            personalAccount.click();
        }
        //метод кнопки Войти в аккаунт
        public void clickEnterInPersonalAccount() {
            enterInPersonalAccount.click();
        }
        //метод кнопки Конструктор
        public void clickConstructorButton() {
            constructorButton.click();
        }

        //метод логотипа Stellar Burgers
        public void clickLinkStellarBurgers() {
            linkStellarBurgers.click();
        }


    }
