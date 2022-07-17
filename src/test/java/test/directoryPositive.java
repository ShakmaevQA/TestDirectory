package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static java.lang.Thread.sleep;

public class directoryPositive {

    @BeforeAll
    static void beforeAll() {
       browserSize = "1920x1080";
    }

    @Test
    void directoryTest() throws InterruptedException {

        //Адрес
        open("http://85.113.47.244:21480");

        //Вход на сайт
        $("#inputLogin").setValue("admin");
        $("#inputPassword").setValue("Admin777!");
        $("#loginButton").click();

        //Вход в систему
        sleep(Long.parseLong("10000"));
        $(".btn").click();
        $(".btn").click();
        $(".btn").click();

        //Вход в справочники
        $(".spravochniki").click();
        $(byText("Справочник ОКТМО")).click();









    }



}
