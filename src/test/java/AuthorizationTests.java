import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTests {

    @Test
    void rozetkaAuthorizationTest() {
        open("https://rozetka.com.ua/");

        $(byName("signin")).click();
        $("#auth_email").setValue("+380675977021");
        $("#auth_pass").setValue("Rozetka20").pressEnter();

        $(".header-topline__user-link").shouldHave(text("380675977021"));
    }

    @Test
    void rozetkaGoodSearchTest() {
        open("https://rozetka.com.ua/");

        $("input[type='text']").setValue("Ночник").pressEnter();

        $$(".catalog-grid__cell").shouldHave(sizeGreaterThanOrEqual(1));
    }

}
