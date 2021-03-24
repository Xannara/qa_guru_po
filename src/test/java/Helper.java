import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Helper {

    TestData testData = new TestData();

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    public void fillForm() {
        $("#firstName").setValue(testData.firstName);
        $("#lastName").setValue(testData.lastName);
        $("#userEmail").setValue(testData.email);
        $(byText(testData.gender)).click();
        $("#userNumber").setValue(testData.mobileNumber);

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("10");
        $(".react-datepicker__year-select").selectOptionByValue("1986");
        $(".react-datepicker__day--025").click();

        $("#subjectsInput").setValue(testData.subject).pressEnter();

        $("[for='hobbies-checkbox-1']").click();
        $("#uploadPicture").uploadFromClasspath("first.png");
        $("#currentAddress").setValue(testData.address);

        $("#state").click();
        $(byText(testData.state)).click();
        $("#city").click();
        $(byText(testData.city)).click();

        $("#submit").click();

    }

    public void checkData() {
        $(".modal-content").shouldBe(visible).shouldHave(text(testData.firstName),
                text(testData.lastName),
                text(testData.email),
                text(testData.gender),
                text(testData.mobileNumber),
                text("25 November,1986"),
                text(testData.subject),
                text("Sports"),
                text("first.png"),
                text(testData.address),
                text(testData.state),
                text(testData.city));
    }
}
