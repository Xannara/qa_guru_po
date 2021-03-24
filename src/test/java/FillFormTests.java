import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FillFormTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void selenideFillFormTest() {

    Helper helper = new Helper();

    helper.openPage();
    helper.fillForm();
    helper.checkData();
    }
}
