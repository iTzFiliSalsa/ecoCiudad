package com.example.reciclapp.Reciclar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;
import com.example.reciclapp.articulos.Estantes;
import com.example.reciclapp.articulos.Sillas;

public class Madera extends AppCompatActivity {
    ImageView regresar_madera;
    CardView estantes,silla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madera);

        regresar_madera=findViewById(R.id.regresar_madera);
        regresar_madera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Madera.super.onBackPressed();
            }
        });
        estantes=findViewById(R.id.estantes);
        estantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Madera.this, Estantes.class));
            }
        });
        silla=findViewById(R.id.silla);
        silla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Madera.this, Sillas.class));
            }
        });
    }
}
