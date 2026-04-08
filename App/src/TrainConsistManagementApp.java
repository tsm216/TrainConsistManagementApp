import java.util.*;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void display() {
        System.out.println(type + " Bogie carrying " + cargo);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create goods bogie list
        List<GoodsBogie> goodsList = new ArrayList<>();
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Open", "Coal"));
        goodsList.add(new GoodsBogie("Box", "Grain"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Apply safety validation using allMatch()
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ");
        } else {
            System.out.println("Train is NOT SAFE ");
        }

        // Step 4: Display bogie details
        System.out.println("\nGoods Bogie Details:");
        goodsList.forEach(GoodsBogie::display);
    }
}
