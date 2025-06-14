public class BagDemo {
    public static void main(String[] args) {
        Bag<String> voteBag = new Bag<>();

        voteBag.add("CandidateA");
        voteBag.add("CandidateB");
        voteBag.add("CandidateA");
        voteBag.add("CandidateC");
        voteBag.add("CandidateA");

        System.out.println("Vote Counts:");
        System.out.println(voteBag); // Uses overridden toString()

        System.out.println("Total votes cast: " + voteBag.size());
        System.out.println("Votes for CandidateA: " + voteBag.count("CandidateA"));
    }
}
