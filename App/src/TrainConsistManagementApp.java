import java.util.*;

class PassengerBogie {
    private String id;
    private int capacity;

    public PassengerBogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie[" + id + ", Capacity: " + capacity + "]";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        PassengerBogie[] bogies = {
                new PassengerBogie("B1", 72),
                new PassengerBogie("B2", 54),
                new PassengerBogie("B3", 108),
                new PassengerBogie("B4", 40),
                new PassengerBogie("B5", 64)
        };

        System.out.println("Original List of Bogies:");
        displayBogies(bogies);

        bubbleSortByCapacity(bogies);

        System.out.println("\nSorted List of Bogies (Ascending Capacity):");
        displayBogies(bogies);
    }

    public static void bubbleSortByCapacity(PassengerBogie[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].getCapacity() > array[j + 1].getCapacity()) {
                    PassengerBogie temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBogies(PassengerBogie[] array) {
        for (PassengerBogie bogie : array) {
            System.out.println(bogie);
        }
    }
}