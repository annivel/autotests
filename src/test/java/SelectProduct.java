import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelectProduct {

    @Test
    void SelectThePeanutButter() {
     // open the browser and search the website
        String factory = "maslotom";
        open("https://duckduckgo.com/");
        $("input[name='q']").setValue(factory).pressEnter();

        // select the found website
        $("div[data-domain='maslotom.com']").click();

        //scroll to "pasta" and click it
        $("ul[class='child-cat-list'] a[href='/basic']").scrollTo().click();
        // move to element and
       $x("//a[@href = '/product/arahisova-pasta-klasichna-180-sklo']/span[contains(text(),'паста')]").click();
       $x("//div[@class='row buy-row']//span[contains(text(),'Купити')]").click();
      /*  $("div[class='p-image-wrapper text-center'] span[class='buy-text flex-fill h-100']").click();
*/









    }


}
