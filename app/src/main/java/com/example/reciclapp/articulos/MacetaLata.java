package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class MacetaLata extends AppCompatActivity {
    ImageView regresar_macetalata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maceta_lata);
        regresar_macetalata=findViewById(R.id.regresar_macetalata);
        regresar_macetalata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MacetaLata.super.onBackPressed();
            }
        });
    }
}
