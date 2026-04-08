import java.util.*;

// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie Class
class GoodsBogie {
    private String type;   // Rectangular, Cylindrical
    private String cargo;  // Petroleum, Coal, etc.

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // Step 3: Validation Logic
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe: Cannot assign Petroleum to Rectangular bogie"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            // Step 4: Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Step 5: Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    public void display() {
        System.out.println(type + " Bogie carrying: " +
                (cargo != null ? cargo : "No Cargo"));
    }
}

// Step 6: Main Application
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");


        b1.assignCargo("Petroleum");

        // Unsafe assignment (handled)
        b2.assignCargo("Petroleum");

        // Continue execution
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie Status:");
        b1.display();
        b2.display();
    }
}