package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.FillFormPage;

public class FillFormTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void selenideFillFormTest() {

    FillFormPage fillFormPage = new FillFormPage();

    fillFormPage.openPage();
    fillFormPage.fillForm();
    fillFormPage.checkData();
    }
}
