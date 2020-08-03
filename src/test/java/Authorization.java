import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Authorization {

    @Test
    void AuthorizationRozetka() {
        open("https://rozetka.com.ua/");

         $x("//a[@class='header-topline__user-link link-dashed']").click();
         $("#auth_email").setValue("+380675977021");
         $("#auth_pass").setValue("Rozetka20");
         $x("//button[contains(text(),'Войти')]").click();

         $("input[type='text']").setValue("Ночник").pressEnter();
        System.out.println($$("span[class='goods-tile__title']").size());


    }

}
