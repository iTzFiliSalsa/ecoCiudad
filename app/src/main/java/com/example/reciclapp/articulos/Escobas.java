package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class Escobas extends AppCompatActivity {
    ImageView regresar_escobas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escobas);
        regresar_escobas=findViewById(R.id.regresar_escobas);
        regresar_escobas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Escobas.super.onBackPressed();
            }
        });
    }
}
