package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText nombreU, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nombreU = findViewById(R.id.txtNomUsuario);
        pass =  findViewById(R.id.txtPass);
    }

    public void Validar(View view){
        if(nombreU.getText().toString().isEmpty() && pass.getText().toString().isEmpty()){
            Toast.makeText(this, "Los campos estan vacios", Toast.LENGTH_SHORT).show();
        } else if (nombreU.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo nombre usuario vacio", Toast.LENGTH_SHORT).show();
        } else if (pass.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo password vacio", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Login correcto!!", Toast.LENGTH_SHORT).show();
        }
    }
}
