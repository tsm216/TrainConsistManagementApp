import java.util.Arrays;
import java.util.Scanner;

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("================================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }
        System.out.println("\n");

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
            System.out.println("\nResult: Bogie " + key + " not found in the consist.");
        }

        scanner.close();
    }
}