import com.github.javafaker.Faker;
import java.util.*;

public class WelcomeFromChuck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhat is your name? Write it here: ");
        String userName = scanner.nextLine();
        System.out.print("Chuck norris appreciates you, " + userName + ". " +
                "\nAnd also, " + Faker.instance().chuckNorris().fact());
    }
}