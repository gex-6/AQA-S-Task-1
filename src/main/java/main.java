import com.github.javafaker.Faker;

public class main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println(Faker.instance().address().fullAddress());
        System.out.println(Faker.instance().chuckNorris().fact());

    }

}
