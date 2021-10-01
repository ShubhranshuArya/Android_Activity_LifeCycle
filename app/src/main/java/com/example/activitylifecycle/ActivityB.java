package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private static final String Tag = "Message";

    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Log.i(Tag, "On Create - B");

        txt2 = findViewById(R.id.txtB2);

        Intent i = getIntent();

        String dataReceived = i.getStringExtra("data");
        txt2.setText("Data Received - " + dataReceived);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "On Start - B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "On Resume - B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "On Pause - B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "On Stop - B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "On Restart - B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "On Destroy - B");
    }
}