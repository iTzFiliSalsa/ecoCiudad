package com.example.reciclapp.Lugares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class InformacionRioFrio extends AppCompatActivity {
    ImageView posicion_riofrio,regresar_riofrio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_rio_frio);
        posicion_riofrio=findViewById(R.id.posicion_riofrio);
        posicion_riofrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformacionRioFrio.this,RioFrio.class));
            }
        });
        regresar_riofrio=findViewById(R.id.regresar_riofrio);
        regresar_riofrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformacionRioFrio.super.onBackPressed();
            }
        });
    }
}
