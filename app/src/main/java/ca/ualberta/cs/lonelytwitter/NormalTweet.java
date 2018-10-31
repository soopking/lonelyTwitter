package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
public class NormalTweet extends Tweet {
    NormalTweet() {
        super();
    }

    NormalTweet(String message) {
=======
/**
 * Created by watts1 on 9/13/16.
 */
public class NormalTweet extends Tweet implements Tweetable {

    public NormalTweet(String message){
>>>>>>> lab-intenttesting
        super(message);
    }

    @Override
    public Boolean isImportant() {
<<<<<<< HEAD
        return false;
=======
        return Boolean.FALSE;
>>>>>>> lab-intenttesting
    }
}
