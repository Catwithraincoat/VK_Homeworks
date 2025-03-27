package org.example.test;


import com.codeborne.selenide.Configuration;
import org.example.model.UserPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class UserPageTest {
    UserPage userPage = new UserPage();

    @Test
    public void userPageTest() {
        Configuration.holdBrowserOpen = true;

        open("https://ok.ru/profile/910107964110");

        Assert.assertEquals(userPage.getUsername(), "Анастасия Павлова");

    }
    @Test
    public void userPageTestDateBirth() {
        Configuration.holdBrowserOpen = true;

        open("https://ok.ru/profile/910107964110");

        Assert.assertEquals(userPage.getDateBirth(), "28 November (21 years)");

    }
}
