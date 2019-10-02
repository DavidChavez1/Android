package com.example.foods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void SignIn(View view) {
        EditText email = findViewById(R.id.IdUser);
        EditText pass = findViewById(R.id.IdPasswd);

        if (email.getText().toString().isEmpty() && pass.getText().toString().isEmpty()){
            Toast.makeText(this, "Both fields are empty", Toast.LENGTH_SHORT).show();
        } else if (email.getText().toString().isEmpty()){
            Toast.makeText(this, "Empty user field", Toast.LENGTH_SHORT).show();
        } else if (pass.getText().toString().isEmpty() ) {
            Toast.makeText(this, "Empty password field", Toast.LENGTH_SHORT).show();
        } else if (email.getText().toString().equals("kamilo@gmail.com") && pass.getText().toString().equals("123456")) {
            Toast.makeText(this, "Correct login", Toast.LENGTH_SHORT).show();
        } else if ((email.getText().toString() != "kamilo@gmail.com") && pass.getText().toString().equals("123456")) {
            Toast.makeText(this, "Incorrect login: incorrect user", Toast.LENGTH_SHORT).show();
        } else if (email.getText().toString().equals("kamilo@gmail.com") && (pass.getText().toString() != "123456")) {
            Toast.makeText(this, "Incorrect login: incorrect password", Toast.LENGTH_SHORT).show();
        } else if (email.getText().toString() != "kamilo@gmail.com" && pass.getText().toString() != "123456") {
            Toast.makeText(this, "Incorrect login: incorrect user and password", Toast.LENGTH_SHORT).show();
        }
    }

}
