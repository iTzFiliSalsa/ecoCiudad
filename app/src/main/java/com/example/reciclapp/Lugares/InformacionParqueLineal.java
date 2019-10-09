package com.example.reciclapp.Lugares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class InformacionParqueLineal extends AppCompatActivity {
    ImageView posicion_lineal,regresar_lineal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_parque_lineal);
        regresar_lineal=findViewById(R.id.regresar_lineal);
        regresar_lineal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformacionParqueLineal.super.onBackPressed();
            }
        });
        posicion_lineal=findViewById(R.id.posicion_lineal);
        posicion_lineal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformacionParqueLineal.this,Lineal.class));
            }
        });
    }
}
