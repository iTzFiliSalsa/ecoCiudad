package com.example.reciclapp.Lugares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class InformacionLinares extends AppCompatActivity {
    ImageView posicion_linares,regresar_linares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_linares);
        posicion_linares=findViewById(R.id.posicion_linares);
        posicion_linares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformacionLinares.this,Linares.class));
            }
        });
        regresar_linares=findViewById(R.id.regresar_linares);
        regresar_linares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformacionLinares.super.onBackPressed();
            }
        });
    }
}
