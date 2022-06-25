package com.myfristproject;

import com.github.javafaker.Faker;
import com.github.javafaker.Yoda;
import org.junit.Test;

import javax.sound.midi.Soundbank;

public class Day05_JavaFaker {
    // fake data = mock data: data that is not real --> fake ssn, name, address
    // we can use fake data to test
    // we can use java faker class to generate fake data
    /*
     * Where do you get your data?
     * 1. BA=business analyst
     * 2. Test Lead
     * 3. Manual Test- We have a manual tester that is in the project for a long time. he/she provides test data
     * 4. Tech Lead = Team Tech = Dev Lead
     * */

    @Test
    public void fakerTest() {
//        1. get Faker dependency
//        2. Create a Faker object
        Faker faker = new Faker();
        // 3. generate fake data
        String fName = faker.name().firstName();
        System.out.println(fName);
        String lName = faker.name().lastName();
        System.out.println(lName);
        String fullName = faker.name().fullName();
        System.out.println(fullName);
        String username = faker.name().username();
        System.out.println(username);
        String title = faker.name().title();
        System.out.println(title);

        String city = faker.address().city();
        System.out.println(city);
        String state = faker.address().state();
        System.out.println(state);
        String phoneNumber = faker.phoneNumber().cellPhone();
        System.out.println(phoneNumber);
        String email = faker.internet().emailAddress();
        System.out.println(email);
        String randomZipCode = faker.number().digit();
        System.out.println(randomZipCode);
        String fakeEmail = faker.name().firstName() + faker.internet().emailAddress() + faker.number().digit();
        System.out.println(fakeEmail);
        String lol = faker.leagueOfLegends().rank();
        System.out.println(lol);
    }






}
