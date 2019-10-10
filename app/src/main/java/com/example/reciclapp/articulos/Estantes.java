package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.Contenedores.ContenedorAmarillo;
import com.example.reciclapp.R;

public class Estantes extends AppCompatActivity {
    ImageView regresar_estantes;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estantes);
        regresar_estantes=findViewById(R.id.regresar_estantes);
        regresar_estantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Estantes.super.onBackPressed();
            }
        });
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Estantes.this, ContenedorAmarillo.class));
            }
        });
    }
    public void vEstante(View view){
        String Url="https://www.youtube.com/watch?v=4eU8Tp3Kzcs&t=2s";
        Uri uriUrl= Uri.parse(Url);
        Intent in=new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(in);
    }
}
