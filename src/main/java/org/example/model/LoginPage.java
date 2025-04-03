package org.example.model;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private final SelenideElement loginField = $x("//*[@id=\"field_email\"]");
    private final SelenideElement passwordField = $x("//*[@id=\"field_password\"]");
    private final SelenideElement submitButton = $x("//*[@class=\"button-pro __wide\"]");
    private final UserPage userPage = new UserPage();
    public UserPage login (String email, String password){
        loginField.setValue(email);
        passwordField.setValue(password);
        submitButton.click();
        return userPage;
    }
}

