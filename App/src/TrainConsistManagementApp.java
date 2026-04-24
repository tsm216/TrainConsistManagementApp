import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // UC17 Requirement: Use an array of String bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("======================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("======================================\n");

        // Display original list using Arrays.toString()
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // UC17 Requirement: Perform alphabetical sorting using the built-in library
        Arrays.sort(bogieNames);

        // Display sorted list
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}