public class BagDemo {
    public static void main(String[] args) {
        // === Region A Votes ===
        Bag<Integer> regionAVotes = new Bag<>();
        regionAVotes.add(101);
        regionAVotes.add(102);
        regionAVotes.add(101);
        regionAVotes.add(103);
        regionAVotes.add(101);
        regionAVotes.add(102);

        System.out.println(" Region A Vote Counts:");
        System.out.print(regionAVotes);

        System.out.println("Total Votes in Region A: " + regionAVotes.size());
        System.out.println("Votes for Candidate 101 in Region A: " + regionAVotes.count(101));

        // === Region B Votes ===
        Bag<Integer> regionBVotes = new Bag<>();
        regionBVotes.add(101);
        regionBVotes.add(104);
        regionBVotes.add(104);
        regionBVotes.add(102);
        regionBVotes.add(105);

        System.out.println("\n Region B Vote Counts:");
        System.out.print(regionBVotes);

        System.out.println("Total Votes in Region B: " + regionBVotes.size());
        System.out.println("Votes for Candidate 104 in Region B: " + regionBVotes.count(104));

        // === Merging Region B into Region A ===
        System.out.println("\n Merging Region B votes into Region A...");
        regionAVotes.merge(regionBVotes);

        System.out.println("\n Combined Vote Counts (Region A + B):");
        System.out.print(regionAVotes);

        System.out.println("Total Combined Votes: " + regionAVotes.size());

        // === Distinct Candidates ===
        System.out.println("\n Distinct Candidates in Combined Results:");
        for (Integer candidate : regionAVotes.distinct()) {
            System.out.println("- Candidate ID: " + candidate);
        }

        // === Optional: Remove a candidate's votes
        System.out.println("\n Removing all votes for Candidate 103...");
        while (regionAVotes.remove(103)) {
            // Keep removing until gone
        }

        System.out.println(" Updated Vote Count After Removal:");
        System.out.print(regionAVotes);
    }
}
