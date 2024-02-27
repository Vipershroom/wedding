import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        LocalDate date;
        Person bride;
        Person groom;

        Scanner s = new Scanner(System.in);
        System.out.println("When is the wedding?");
        System.out.println("Please enter in this format (YYYY-MM-DD)");

        // Make sure a valid date is selected
        while (true) {
            try {
                String n = s.nextLine();
                date = LocalDate.parse(n);
                if (date.isAfter(LocalDate.now())) {
                    break;
                }
                System.out.println("Dates must be in the future!");
                System.out.println("Please enter in this format (YYYY-MM-DD)");

            } catch (Exception e) {
                System.out.println("Error parsing date, Please try again");
            }
        }

        System.out.println("Please enter the first and last name of the bride");
        System.out.println("Names should be seperated by a space");
        while (true) {
            String[] name = s.nextLine().split(" ");
            if (name.length < 2 || name[0].matches(".*\\d.*") || name[1].matches(".*\\d.*")) {
                System.out.println("Please enter both the first and last name");
                continue;
            }

            bride = new Person(name[0], name[1]);

            System.out.println("Please enter the first and last name of the groom");
            System.out.println("Names should be seperated by a space");
            name = s.nextLine().split(" ");
            if (name.length < 2 || name[0].matches(".*\\d.*") || name[1].matches(".*\\d.*")) {
                System.out.println("Please enter both the first and last name");
                continue;
            }
            groom = new Person(name[0], name[1]);

        }




    }
}
