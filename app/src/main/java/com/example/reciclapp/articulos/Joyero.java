package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class Joyero extends AppCompatActivity {
    ImageView regresar_joyero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joyero);
        regresar_joyero=findViewById(R.id.regresar_joyero);
        regresar_joyero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Joyero.super.onBackPressed();
            }
        });
    }
}
