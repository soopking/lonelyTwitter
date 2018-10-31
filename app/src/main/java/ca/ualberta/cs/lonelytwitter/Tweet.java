package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

<<<<<<< HEAD
public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;

    //Empty argument constructor with default values
    Tweet() {
        //Must use the 'this' keyword in order to specify the current object message = message does nothing!
        this.date = new Date();
        this.message = "I am default message schwa!";
    }

    //Overloading: so that we can specify the tweet content
    Tweet(String message) {
        this.date = new Date();
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS ) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() { return this.date; }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

    //No method body implemented! We leave that up to the subclasses (they MUST implement it)
    public abstract Boolean isImportant();
=======
/**
 * Created by watts1 on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    public abstract Boolean isImportant();




    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }
>>>>>>> lab-intenttesting
}
