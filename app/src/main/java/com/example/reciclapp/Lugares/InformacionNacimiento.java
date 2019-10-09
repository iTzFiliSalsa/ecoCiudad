package com.example.reciclapp.Lugares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class InformacionNacimiento extends AppCompatActivity {
    ImageView posicion_naci,regresar_nacimiento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_nacimiento);
        posicion_naci=findViewById(R.id.posicion_naci);
        posicion_naci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformacionNacimiento.this,Nacimiento.class));
            }
        });
        regresar_nacimiento=findViewById(R.id.regresar_nacimiento);
        regresar_nacimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformacionNacimiento.super.onBackPressed();
            }
        });
    }
}
