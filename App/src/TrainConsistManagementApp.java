import java.util.Arrays;
import java.util.Scanner;

// Custom Exception for UC20
class EmptyTrainException extends Exception {
    public EmptyTrainException(String message) {
        super(message);
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println(" UC20 - Exception Handling in Search ");
        System.out.println("================================================\n");

        // Real-world scenario: An empty array representing a train with no bogies added
        String[] bogieIds = {};

        try {
            // Goal: Prevent search operations on an empty train
            performSearch(bogieIds, scanner);
        } catch (EmptyTrainException e) {
            // Catching the fail-fast exception to prevent misleading output or waste computation
            System.err.println("Error: " + e.getMessage());
            System.out.println("Please add bogies to the train before searching.");
        } finally {
            scanner.close();
            System.out.println("\nApplication Terminated.");
        }
    }

    public static void performSearch(String[] bogieIds, Scanner scanner) throws EmptyTrainException {
        // Defensive check: Throwing an exception early (Fail-Fast)
        if (bogieIds == null || bogieIds.length == 0) {
            throw new EmptyTrainException("Cannot perform search: The train consist is empty.");
        }

        Arrays.sort(bogieIds);
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.next();

        int low = 0;
        int high = bogieIds.length - 1;
        int resultIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                resultIndex = mid;
                break;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (resultIndex != -1) {
            System.out.println("\nResult: Bogie " + key + " found at index " + resultIndex + ".");
        } else {
            System.out.println("\nResult: Bogie " + key + " not found.");
        }
    }
}