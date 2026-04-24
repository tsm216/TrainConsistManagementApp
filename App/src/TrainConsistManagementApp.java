import java.util.Scanner;

public class TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIDs, String searchKey) {
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("--- Train Consist Management: Linear Search ---");
        System.out.print("Enter Bogie ID to search: ");

        String searchKey = scanner.next();

        boolean isFound = searchBogie(bogieIDs, searchKey);

        if (isFound) {
            System.out.println("Result: Bogie " + searchKey + " found in the consist.");
        } else {
            System.out.println("Result: Bogie " + searchKey + " not found.");
        }

        scanner.close();
    }
}