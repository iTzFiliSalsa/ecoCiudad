package com.example.reciclapp.Lugares;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class InformacionDifusora extends AppCompatActivity {
    ImageView difu,regresar_difusora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_difusora);
        regresar_difusora=findViewById(R.id.regresar_difusora);
        regresar_difusora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InformacionDifusora.super.onBackPressed();
            }
        });
        difu=findViewById(R.id.difu);
        difu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformacionDifusora.this,LaDifusora.class));
            }
        });
    }
}
