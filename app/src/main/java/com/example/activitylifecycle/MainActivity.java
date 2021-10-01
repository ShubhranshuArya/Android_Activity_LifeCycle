package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "Message";

    Button btn1, btn2;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(Tag, "On Create - A");

        btn1 = findViewById(R.id.btn1);
        et1 = findViewById(R.id.et1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                goToAnotherActivity(); //this is another way of calling a new activity without
//                                         giving the context.
                //        Explicit Intent - Activity, services, broadcast receivers...
                Intent i = new Intent(getApplicationContext(), ActivityB.class);
                String data = et1.getText().toString();
                i.putExtra("data", data);
                startActivity(i);
            }
        });



        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //        Implicit Intents - Foreign website or app..
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("https://www.linkedin.com/company/e-city-vibes-pvt-ltd"));
                startActivity(i2);
            }
        });
    }

    private void goToAnotherActivity() {
        Intent i = new Intent(this, ActivityB.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "On Start - A");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "On Resume - A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "On Pause - A");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "On Stop - A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "On Restart - A");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "On Destroy - A");
    }


}