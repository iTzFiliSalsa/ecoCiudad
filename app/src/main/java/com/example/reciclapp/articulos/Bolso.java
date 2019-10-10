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

public class Bolso extends AppCompatActivity {
    ImageView regresar_bolso;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolso);
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Bolso.this, ContenedorAmarillo.class));
            }
        });
        regresar_bolso=findViewById(R.id.regresar_bolso);
        regresar_bolso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bolso.super.onBackPressed();
            }
        });

    }
    public void vBolso(View view){
        String Url="https://www.youtube.com/watch?v=yKXRiBYPc2c";
        Uri uriUrl=Uri.parse(Url);
        Intent launchBrowser=new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);
    }
}
