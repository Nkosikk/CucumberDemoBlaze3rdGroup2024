package utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateTestData {

    WebDriver driver;
    static Faker faker = new Faker();

    // Generate a random date of birth
    static Date dateOfBirth = faker.date().birthday();

    // Create a SimpleDateFormat to extract the month
    static SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM"); // Full month name

    static SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy"); // Year


    public String name = faker.name().name();
    public String country = faker.address().country();
    public String city = faker.address().city();
    public String creditCard = faker.business().creditCardType();
    public String month = monthFormat.format(dateOfBirth);
    public String year = yearFormat.format(dateOfBirth);


}
