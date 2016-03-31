package com.example.vijsu.hashtag;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Uri uri = getIntent().getData();
        String tag = uri.toString().split("/")[3];
        Toast.makeText(SecondActivity.this, " "+tag, Toast.LENGTH_SHORT).show();
    }
}
