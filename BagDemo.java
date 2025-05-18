public class BagDemo {

    public static void main(String[] args) {
        // Create a Bag to track votes using candidate ID numbers
        Bag<Integer> voteBag = new Bag<>();

        // Simulate incoming votes (some candidates receive multiple votes)
        voteBag.add(101); // Candidate 101
        voteBag.add(102); // Candidate 102
        voteBag.add(101);
        voteBag.add(103); // Candidate 103
        voteBag.add(101);
        voteBag.add(102);

        // Print current vote counts
        System.out.println("Initial Vote Count:");
        voteBag.printContents();

        // Check if certain candidates received any votes
        System.out.println("\nChecking for specific candidate presence:");
        System.out.println("Candidate 101 present? " + voteBag.contains(101));
        System.out.println("Candidate 105 present? " + voteBag.contains(105));

        // Get count of votes for each candidate
        System.out.println("\nVote counts:");
        System.out.println("Candidate 101: " + voteBag.count(101));
        System.out.println("Candidate 102: " + voteBag.count(102));
        System.out.println("Candidate 105: " + voteBag.count(105));

        // Remove one vote from candidate 101
        System.out.println("\nRemoving a vote from Candidate 101...");
        voteBag.remove(101);

        // Updated bag contents
        System.out.println("\nUpdated Vote Count:");
        voteBag.printContents();

        // Remove all votes from candidate 103
        System.out.println("\nRemoving all votes for Candidate 103...");
        voteBag.remove(103); // once (only one vote)

        System.out.println("\nFinal Vote Count:");
        voteBag.printContents();
    }
}
