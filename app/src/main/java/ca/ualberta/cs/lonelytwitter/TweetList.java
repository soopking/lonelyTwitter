package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public Boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(Integer index) {
        return tweets.get(index);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public Integer getCount() {
        return tweets.size();
    }
}
