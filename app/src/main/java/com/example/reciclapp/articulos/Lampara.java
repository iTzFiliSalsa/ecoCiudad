package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class Lampara extends AppCompatActivity {
    ImageView regresar_lampara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lampara);
        regresar_lampara=findViewById(R.id.regresar_lampara);
        regresar_lampara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lampara.super.onBackPressed();
            }
        });
    }
}
