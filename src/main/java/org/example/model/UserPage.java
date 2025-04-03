package org.example.model;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserPage {
    private final SelenideElement userName = $x("//*[@id=\"hook_Block_MiddleColumnAnonUserHead\"]/anonym-user-head/div/div/div[2]/span/h1");
    private final SelenideElement dateBirth = $x("*[@id=\"hook_Block_MiddleColumnAnonUserHead\"]/anonym-user-head/div/div/div[2]/div[1]/button[1]/div//*[@id=\"hook_Block_MiddleColumnAnonUserHead\"]/anonym-user-head/div/div/div[2]/div[1]/button[1]/div");
    private final SelenideElement userPageButton = $x("//*[@data-l=\"t,userPage\"]");
    public String getUsername(){
        return userName.getText();
    }
    public String getDateBirth(){
        return dateBirth.getText();
    }
    public void toUserPage(){
        userPageButton.click();
    }



}
