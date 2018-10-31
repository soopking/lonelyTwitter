package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;
<<<<<<< HEAD
	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;

	
=======

	private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();

	private ArrayAdapter<Tweet> adapter;

>>>>>>> lab-intenttesting
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		Button clearButton = (Button) findViewById(R.id.clear);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				String text = bodyText.getText().toString();
<<<<<<< HEAD
				ImportantTweet newTweet = new ImportantTweet();
				try {
					newTweet.setMessage(text);
				} catch (TweetTooLongException e) {
					e.printStackTrace();
				}
				tweets.add(newTweet);
				adapter.notifyDataSetChanged();
				saveInFile();
			}
		});

		clearButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				tweets.clear();
				saveInFile();
				adapter.notifyDataSetChanged();
=======

				Tweet newTweet = new NormalTweet(text);

				tweetList.add(newTweet);
				adapter.notifyDataSetChanged();

				saveInFile();
>>>>>>> lab-intenttesting
			}
		});

	}

	@Override
	protected void onStart() {
		super.onStart();
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
<<<<<<< HEAD
				R.layout.list_item, tweets);
=======
				R.layout.list_item, tweetList);
>>>>>>> lab-intenttesting
		oldTweetsList.setAdapter(adapter);
	}

	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
<<<<<<< HEAD
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(isr);
=======
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();

			// Code from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
			Type listType = new TypeToken<ArrayList<NormalTweet>>(){}.getType();

			tweetList = gson.fromJson(in,listType);
>>>>>>> lab-intenttesting

			Gson gson = new Gson();
			Type typeListTweets = new TypeToken<ArrayList<ImportantTweet>>(){}.getType();
			tweets = gson.fromJson(reader,typeListTweets);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
<<<<<<< HEAD
			e.printStackTrace();
=======
			tweetList = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
>>>>>>> lab-intenttesting
		}
	}
	
	private void saveInFile() {
		try {
<<<<<<< HEAD
			FileOutputStream fos = openFileOutput(FILENAME, 0);
			OutputStreamWriter osw = new OutputStreamWriter(fos);

			Gson gson = new Gson();
			gson.toJson(tweets, osw);
			osw.flush();
=======
			FileOutputStream fos = openFileOutput(FILENAME,
					0);

			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.flush();

>>>>>>> lab-intenttesting
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}