package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    EditText usernameEditText;
    EditText emailEditText;
    EditText passwordEditText;
    EditText confirmPasswordEditText;
    Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Initialize UI elements
        usernameEditText = findViewById(R.id.fname);

        passwordEditText = findViewById(R.id.fpass);
        confirmPasswordEditText = findViewById(R.id.fcpass);
        signupButton = findViewById(R.id.register);
    }

    // Set an OnClickListener for the Signup button

    public void signup(View view) {
        // Get user input from the EditText fields
        String username = usernameEditText.getText().toString();

        String password = passwordEditText.getText().toString();
        String confirmPassword = confirmPasswordEditText.getText().toString();

        // Check if password and confirm password match
        if (!password.equals(confirmPassword)) {
            // Passwords do not match
            Toast.makeText(MainActivity4.this, "Passwords do not match. Please try again.", Toast.LENGTH_SHORT).show();
        } else {
            // Passwords match, perform signup logic (replace with your actual signup process)
            if (performSignup(username, password)) {
                // Signup successful
                Toast.makeText(MainActivity4.this, "Signup successful!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity5.class);
                startActivity(intent);
                finish();
            } else {
                // Signup failed
                Toast.makeText(MainActivity4.this, "Signup failed. Please try again.", Toast.LENGTH_SHORT).show();
            }
        }
    }




    // Replace this with your actual signup logic
    private boolean performSignup(String username,  String password) {

        // Implement your signup process here
        // Return true for a successful signup, or false if there's an error
        // You should implement this logic according to your app's requirements
        return true;
    }
    public void signin(View view) {
        // Start the LoginActivity when the "Next" button is clicked
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
        finish();
    }
}
