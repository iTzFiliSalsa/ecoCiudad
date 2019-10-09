package com.example.reciclapp.Reciclar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;
import com.example.reciclapp.articulos.Bolso;
import com.example.reciclapp.articulos.Cartera;

public class Bolsas extends AppCompatActivity {
    ImageView regresar_bolsas;
    CardView cartera,bolso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolsas);
        bolso=findViewById(R.id.bolso);
        bolso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Bolsas.this, Bolso.class));
            }
        });
        cartera=findViewById(R.id.cartera);
        cartera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Bolsas.this, Cartera.class));
            }
        });
        regresar_bolsas=findViewById(R.id.regresar_bolsas);
        regresar_bolsas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bolsas.super.onBackPressed();
            }
        });
    }
}
