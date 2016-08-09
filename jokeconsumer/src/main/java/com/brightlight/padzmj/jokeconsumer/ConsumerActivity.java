package com.brightlight.padzmj.jokeconsumer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConsumerActivity extends AppCompatActivity {

    private TextView jokeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer);

        jokeText = (TextView) findViewById(R.id.jokeText);

        jokeText.setText(getIntent()!=null?getIntent().getStringExtra("joke"):"No Joke");

    }
}
