package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_info = findViewById(R.id.txtText);
        registerForContextMenu(txt_info);
    }

    //Mostrar el menu cuando se mantenga precionado el touch
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("My colors");
        getMenuInflater().inflate(R.menu.colors,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.color_1:
                Toast.makeText(this, "Yellow", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.color_2:
                Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.color_3:
                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);
        }// switch

    }
}
