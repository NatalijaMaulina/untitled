package lekcija6.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);

        System.out.println(faker.address().city() + faker.address().streetAddress() + faker.address().buildingNumber());
        System.out.println(faker.phoneNumber());
        System.out.println(faker.name().lastName());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.chuckNorris().fact());

    }
}
