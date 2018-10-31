package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD

import java.util.Date;

public class ImportantTweet extends Tweet {

    //Empty argument constructor with default values
    ImportantTweet() {
        //Call the parent constructor to: avoid duplication!
        super();
    }

    ImportantTweet(String message) {
=======
/**
 * Created by watts1 on 9/13/16.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
>>>>>>> lab-intenttesting
        super(message);
    }

    @Override
<<<<<<< HEAD
    public Boolean isImportant() {
        return true;
    }
=======
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

>>>>>>> lab-intenttesting
}
