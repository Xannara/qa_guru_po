package pages;

import com.github.javafaker.Faker;

public class TestData {

    Faker faker = new Faker();

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String gender = "Female";
    String mobileNumber = faker.number().digits(10);
    String subject = "Computer Science";
    String address = faker.address().streetAddress();
    String state = "NCR";
    String city = "Delhi";
}
