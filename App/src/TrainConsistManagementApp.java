import java.util.*;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create and populate bogie list
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 80));

        // Step 2: Use Stream to calculate total seating capacity
        int totalCapacity = bogieList.stream()
                .map(b -> b.getCapacity())   // Extract capacity
                .reduce(0, Integer::sum);    // Aggregate (sum)

        // Step 3: Display result
        System.out.println("Total Seating Capacity of Train: " + totalCapacity);

        // Step 4: Verify original list remains unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}