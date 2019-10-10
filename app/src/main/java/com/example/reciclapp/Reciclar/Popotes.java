package com.example.reciclapp.Reciclar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;
import com.example.reciclapp.articulos.Florero;
import com.example.reciclapp.articulos.JoyeroPopotes;

public class Popotes extends AppCompatActivity {
    ImageView regresar_popotes;
    CardView joyero_popotes,florero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popotes);
        florero=findViewById(R.id.florero);
        florero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Popotes.this, Florero.class));
            }
        });
        joyero_popotes=findViewById(R.id.joyero_popotes);
        joyero_popotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Popotes.this, JoyeroPopotes.class));
            }
        });
        regresar_popotes=findViewById(R.id.regresar_popotes);
        regresar_popotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Popotes.super.onBackPressed();
            }
        });
    }
}
