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

        // === First Assignment Functionality ===
        System.out.println("Initial Vote Count:");
        voteBag.printContents();

        System.out.println("\nChecking for specific candidate presence:");
        System.out.println("Candidate 101 present? " + voteBag.contains(101));
        System.out.println("Candidate 105 present? " + voteBag.contains(105));

        System.out.println("\nVote counts:");
        System.out.println("Candidate 101: " + voteBag.count(101));
        System.out.println("Candidate 102: " + voteBag.count(102));
        System.out.println("Candidate 105: " + voteBag.count(105));

        System.out.println("\nRemoving a vote from Candidate 101...");
        voteBag.remove(101);

        System.out.println("\nUpdated Vote Count:");
        voteBag.printContents();

        System.out.println("\nRemoving all votes for Candidate 103...");
        voteBag.remove(103); // one vote

        System.out.println("\nFinal Vote Count:");
        voteBag.printContents();

        // === Second Assignment Functionality ===

        // 1. Print total vote size
        System.out.println("\nTotal number of votes in the bag (including duplicates): " + voteBag.size());

        // 2. Simulate another voting bag (e.g., votes from another region)
        Bag<Integer> newVotes = new Bag<>();
        newVotes.add(104);
        newVotes.add(101);
        newVotes.add(102);
        newVotes.add(104);

        System.out.println("\nVotes from another region:");
        newVotes.printContents();

        // 3. Merge newVotes into voteBag
        voteBag.merge(newVotes);
        System.out.println("\nMerged Vote Bag:");
        voteBag.printContents();

        // 4. Create a new bag with only distinct candidates
        Bag<Integer> distinctCandidates = voteBag.distinct();
        System.out.println("\nDistinct Candidates (Each appears only once):");
        distinctCandidates.printContents();
    }
}
