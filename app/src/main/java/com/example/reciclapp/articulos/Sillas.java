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

public class Sillas extends AppCompatActivity {
    ImageView regresar_estantes;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sillas);
        regresar_estantes=findViewById(R.id.regresar_estantes);
        regresar_estantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sillas.super.onBackPressed();
            }
        });
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sillas.this, ContenedorAmarillo.class));
            }
        });
    }
    public void vSilla(View view){
        String Url="https://www.youtube.com/watch?v=uyOj5NlT574";
        Uri uriRul= Uri.parse(Url);
        startActivity(new Intent(Intent.ACTION_VIEW,uriRul));
    }
}
