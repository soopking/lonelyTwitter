package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));

        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
        assertEquals(returnedTweet.getClass(), tweet.getClass());
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Tweet");
        NormalTweet tweet2 = new NormalTweet("Tweet2");
        tweets.addTweet(tweet);
        tweets.addTweet(tweet2);
        ArrayList<Tweet> returnedList = tweets.getTweets();
        assertTrue(returnedList.contains(tweet));
        assertTrue(returnedList.contains(tweet2));
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertEquals(tweets.getCount().intValue(), 1);
        tweets.addTweet(new NormalTweet("Tweet2"));
        assertEquals(tweets.getCount().intValue(), 2);
    }
}
