package com.example.reciclapp.Lugares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class InformacionRastro extends AppCompatActivity {
    ImageView posicion_rastro,regresar_rastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_rastro);
        regresar_rastro=findViewById(R.id.regresar_rastro);
        regresar_rastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformacionRastro.super.onBackPressed();
            }
        });
        posicion_rastro=findViewById(R.id.posicion_rastro);
        posicion_rastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformacionRastro.this, Rastro.class));
            }
        });
    }
}
