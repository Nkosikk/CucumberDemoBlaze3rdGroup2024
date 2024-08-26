package utils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class generateTestData {
    static Faker faker = new Faker();

    public static String fullName = faker.name().fullName();
    public static String country = faker.country().name();
    public static String city = faker.country().capital();
    public static String creditCard = faker.finance().creditCard();
    public static int month = faker.random().nextInt(12);

    //random year  -- five years from now
   /* int minYear = 2024;
    int maxYear = 2029;*/
    public int randomYear = faker.number().numberBetween(2024, 2029 +1);

   /* @Test
    public void test(){
        System.out.println(fullName);
        System.out.println(country);
        System.out.println(city );
        System.out.println(creditCard);
        System.out.println(month);
        System.out.println(randomYear );
    }*/

}
