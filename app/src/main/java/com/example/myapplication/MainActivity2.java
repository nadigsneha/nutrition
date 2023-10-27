package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void principalM(View view) {
        // Start the LoginActivity when the "Next" button is clicked
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
