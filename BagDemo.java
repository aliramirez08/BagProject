public class BagDemo {
    public static void main(String[] args) {
        // Create a Bag of Strings
        Bag<String> bag = new Bag<>();

        // Add elements (with duplicates)
        bag.add("apple");
        bag.add("banana");
        bag.add("apple");
        bag.add("orange");
        bag.add("banana");
        bag.add("apple");

        // Print bag contents
        bag.printContents();

        // Test contains() method
        System.out.println("\nDoes the bag contain 'apple'? " + bag.contains("apple")); // true
        System.out.println("Does the bag contain 'grape'? " + bag.contains("grape"));   // false

        // Test count() method
        System.out.println("\nCount of 'apple': " + bag.count("apple"));   // 3
        System.out.println("Count of 'banana': " + bag.count("banana"));   // 2
        System.out.println("Count of 'grape': " + bag.count("grape"));     // 0

        // Remove one 'apple'
        bag.remove("apple");

        // Print contents again
        System.out.println("\nAfter removing one 'apple':");
        bag.printContents();

        // Test contains() and count() for removed element
        System.out.println("\nDoes the bag contain 'apple'? " + bag.contains("apple")); // true
        System.out.println("Count of 'apple': " + bag.count("apple"));   // 2

        // Remove 'apple' two more times
        bag.remove("apple");
        bag.remove("apple");

        System.out.println("\nAfter removing all 'apple':");
        bag.printContents();
        System.out.println("Does the bag contain 'apple'? " + bag.contains("apple")); // false
        System.out.println("Count of 'apple': " + bag.count("apple"));   // 0
    }
}
