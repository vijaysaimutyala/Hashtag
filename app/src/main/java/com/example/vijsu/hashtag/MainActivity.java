package com.example.vijsu.hashtag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textview);
        //Fires default intents for URL in browser, mobilenumber goes to dialler
        /*textView.setText("http://www.google.com");
        Linkify.addLinks(textView,Linkify.ALL);*/

        //URL firing appending the text detected after hashtag
        Pattern tagMatcher = Pattern.compile("[#]+[A-Za-z0-9-_]+\\b");
        /*String url = "http://www.twitter.com/";
        Linkify.addLinks(textView,tagMatcher,url);*/

        String newActivityURL = "content://com.example.vijsu.hashtag.SecondActivity/";
        Linkify.addLinks(textView,tagMatcher,newActivityURL);
    }
}
