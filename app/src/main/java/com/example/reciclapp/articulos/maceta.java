package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class maceta extends AppCompatActivity {
    ImageView regresar_maceta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maceta);
        regresar_maceta=findViewById(R.id.regresar_maceta);
        regresar_maceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maceta.super.onBackPressed();
            }
        });
    }
}
