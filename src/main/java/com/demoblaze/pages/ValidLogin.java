package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
public class ValidLogin extends PageObject {
    private By txtUser = By.id("loginusername");

    private By txtPassword = By.id("loginpassword");

    public By getTxtUser() {
        return txtUser;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

}