package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void nextButtonClicked(View view) {
        // Start the LoginActivity when the "Next" button is clicked
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
