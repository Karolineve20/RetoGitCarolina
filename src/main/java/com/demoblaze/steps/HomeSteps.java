package com.demoblaze.steps;

import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeSteps {
    @Page
    HomePage homePage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        homePage.openUrl("https://www.demoblaze.com/");
    }

    @Step("Dar clic en boton Login")
    public void darClicCuenta(){
        homePage.getDriver().findElement(homePage.getBtnMicuenta()).click();
    }


}
