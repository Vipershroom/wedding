import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        LocalDate date;
        Person bride;
        Person groom;
        Couple couple;
        String loc;
        Wedding wedding;

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

        // Assure the correct information is set for the bride
        while (true) {
            String[] name = s.nextLine().split(" ");
            if (name.length < 2 || name[0].matches(".*\\d.*") || name[1].matches(".*\\d.*")) {
                System.out.println("Please enter both the first and last name");
                continue;
            }

            bride = new Person(name[0], name[1]);
            break;
        }
        // Assure the correct information is set for the groom
        while (true) {
            System.out.println("Please enter the first and last name of the groom");
            System.out.println("Names should be seperated by a space");
            String[] name = s.nextLine().split(" ");
            if (name.length < 2 || name[0].matches(".*\\d.*") || name[1].matches(".*\\d.*")) {
                System.out.println("Please enter both the first and last name");
                continue;
            }
            groom = new Person(name[0], name[1]);
            break;
        }

        couple = new Couple(groom, bride);

        // Assure a location is set
        while (true) {
            System.out.println("Please enter a location");
            loc = s.nextLine();
            if (!loc.isEmpty()) {
                break;
            }
        }

        // Display the wedding details
        wedding = new Wedding(date, couple, loc);
        System.out.println("Here is your wedding");
        System.out.println("Wedding of: " + wedding.get_couple().get_bride().get_first_name() + " " + wedding.get_couple().get_bride().get_last_name() + " and " + wedding.couple.get_groom().get_first_name() + " " + wedding.get_couple().get_groom().get_last_name());
        System.out.println("Scheduled to happen on: " + wedding.get_date());
        System.out.println("At: " + wedding.get_location());

    }
}
