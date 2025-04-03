package org.example.test;


import com.codeborne.selenide.Configuration;
import org.example.model.LoginPage;
import org.example.model.UserPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static com.codeborne.selenide.Selenide.*;


public class LoginPageTest {
    private UserPage userPage;
    LoginPage loginPage = new LoginPage();


    @Test
    @DisplayName("Проверка залогиниться под нужным пользователем")
    public void login() throws InterruptedException {
        Configuration.holdBrowserOpen = true;

        open("https://ok.ru/dk?st.cmd=anonymMain&st.fflo=on&st.fstlb=on&st.lgn=on");

        userPage = loginPage.login("technopol41", "technopolisPassword");
        userPage.toUserPage();


        Thread.sleep(3000);

        String currentUrl = webdriver().driver().url();
        System.out.println("Current URL: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("586090036350"));
    }
}
