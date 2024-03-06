package labs.la1;

public class VoteTester {
    public static void main(String[] args) {
        VoteGG voteGG = new VoteGG();
        VoteGG voteGG2 = new VoteGG();
        voteGG.addVote();
        voteGG.addVote();
        voteGG.addVote();
        voteGG.addVote();

        voteGG.totalVotes();
    }
}
