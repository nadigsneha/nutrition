package com.example.myapplication;
        import android.annotation.SuppressLint;
        import android.app.AlertDialog;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.view.LayoutInflater;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private EditText emailEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
    }

    public void loginButtonClicked(View view) {
        // Retrieve email and password from EditText fields
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Perform authentication logic here, e.g., check against a database or a backend server
        // For a real authentication, you would need a backend service to validate credentials.

        // For this example, we'll simply show a toast message.
        if (isValidCredentials(email, password)) {
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity5.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidCredentials(String email, String password) {
        // Implement your authentication logic here
        // You can check credentials against a database or a backend service.
        // For simplicity, this example doesn't perform actual validation.
        return email.equals("test@example.com") && password.equals("password123");
    }
    public void navigateToSignupPage(View view) {
        // Start the LoginActivity when the "Next" button is clicked
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
        finish();
    }


}


