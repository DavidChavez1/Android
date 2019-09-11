package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText nombreU, pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nombreU = findViewById(R.id.txtNomUsuario);
        pass =  findViewById(R.id.txtPass);

        btn = findViewById(R.id.btnOpass);

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

    public void Pasar(View view){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }


}
