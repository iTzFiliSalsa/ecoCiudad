package com.example.reciclapp.Reciclar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;
import com.example.reciclapp.articulos.Lapicera;
import com.example.reciclapp.articulos.MacetaLata;

public class Latas extends AppCompatActivity {
    ImageView regresar_latas;
    CardView latas_1,maceta_lata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latas);
        maceta_lata=findViewById(R.id.maceta_lata);
        maceta_lata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Latas.this, MacetaLata.class));
            }
        });
        regresar_latas=findViewById(R.id.regresar_latas);
        regresar_latas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Latas.super.onBackPressed();
            }
        });
        latas_1=findViewById(R.id.latas_1);
        latas_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
startActivity(new Intent(Latas.this, Lapicera.class));
            }
        });
    }
}
