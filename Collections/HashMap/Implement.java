import java.util.*;
class Implement {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 28);

        // Accessing values using keys
        System.out.println("Age of John: " + hashMap.get("John"));
        System.out.println("Age of Alice: " + hashMap.get("Alice"));

        // Removing a key-value pair
        hashMap.remove("Bob");

        // Checking if a key exists
        if (hashMap.containsKey("Bob")) {
            System.out.println("Bob's age is: " + hashMap.get("Bob"));
        } else {
            System.out.println("Bob's age is not available.");
        }

        // Checking if the HashMap is empty
        System.out.println("Is the HashMap empty? " + hashMap.isEmpty());

        // Getting the size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());
    }
}
