package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class Lapicera extends AppCompatActivity {
    ImageView regresar_lapicera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lapicera);
        regresar_lapicera=findViewById(R.id.regresar_lapiceras);
        regresar_lapicera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lapicera.super.onBackPressed();
            }
        });
    }
}
