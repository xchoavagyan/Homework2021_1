package com.company;

public class Product {
    //2.Design a class Product containing counts of both upvotes and downvotes,
    //return what vote count should be displayed.
    //This is calculated by subtracting the number of downvotes from upvotes.
    //Examples
    //getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
    //getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31
    //getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0
    //Note
    //You can expect only positive integers for vote counts.

    private int upVotes;
    private int downVotes;

    public Product() {
        upVotes = 0;
        downVotes = 0;
    }
    public void addUpVote(){
        upVotes++;
    }
    public void addDownVote(){
        downVotes++;
    }

    public int getVoteCount(){
        return upVotes-downVotes;
    }
}
