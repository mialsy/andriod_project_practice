package com.laioffer.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView welcomeText = findViewById(R.id.welcomeTextView);
        final EditText nameEditText = findViewById(R.id.nameEditText);
        final EditText emailEditText = findViewById(R.id.emailEditText);
        final Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            // anynomous class
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                welcomeText.setText("Welcome " + name + ", your email is: " + email);
            }
        });

        Log.d(TAG, "We are onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "We are onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "We are onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "We are onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "We are onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "We are onDestroy()");
    }

}