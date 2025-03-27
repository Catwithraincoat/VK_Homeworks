package org.example.test;

import com.codeborne.selenide.Configuration;
import org.example.model.LoginPage;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void login(){
        Configuration.holdBrowserOpen = true;

        open("https://ok.ru/dk?st.cmd=anonymMain&st.fflo=on&st.fstlb=on&st.lgn=on");

        loginPage.login("paw.2016@yandex.ru", "1234");
    }
}
