package com.demoblaze.steps;

import com.demoblaze.pages.ValidLogin;
import com.demoblaze.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

public class LoginSteps {
    @Page
    ValidLogin user;

    @Step("Esperar")
    public void esperar() {
        new WebDriverWait(user.getDriver(), Duration.ofSeconds(5)).withMessage("Hola");
    }

    @Step("Pulsar Login")
    public void pulsarLogin() {
        ((JavascriptExecutor) user.getDriver()).executeScript("logIn()");
    }

    @Step("Ingresar Usuario")
    public void ingresarUsuario() {
        ArrayList<Map<String, String>> users;
        try {
            users =
                    DatosExcel.leerExcel("C:src\\test\\resources\\Data\\Ingreso.xlsx", "Login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String userName = users.get(0).get("Username");
        String password = users.get(0).get("Password");

        user.getDriver().findElement(user.getTxtUser()).sendKeys(userName);
        user.getDriver().findElement(user.getTxtPassword()).sendKeys(password);
    }

}
