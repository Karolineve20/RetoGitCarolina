
package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageTwo extends PageObject {

    private By btnMicuenta = By.xpath("//*[@id='login2']");

    public By getBtnMicuenta() {
        return btnMicuenta;
    }

}