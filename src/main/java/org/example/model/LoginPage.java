package org.example.model;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private final SelenideElement loginField = $x("//*[@id=\"field_email\"]");
    private final SelenideElement passwordField = $x("//*[@id=\"field_password\"]");
    private final SelenideElement submitButton = $x("//*[@id=\"tabpanel-login-3412093035\"]/form/div[4]/input");
    public void login(String email, String password){
        loginField.setValue(email);
        passwordField.setValue(password);
        //submitButton.click(); постоянно меняется xpath  у кнопки не могу на данном этапе найти ее
    }
}

