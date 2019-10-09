package com.example.reciclapp.articulos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.Contenedores.ContenedorAmarillo;
import com.example.reciclapp.Contenedores.ContenedorAzul;
import com.example.reciclapp.R;

public class BolsaRegalo extends AppCompatActivity {
    ImageView regresar_regalo;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolsa_regalo);
        regresar_regalo=findViewById(R.id.regresar_regalo);
        regresar_regalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BolsaRegalo.super.onBackPressed();
            }
        });
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BolsaRegalo.this, ContenedorAzul.class));
            }
        });
    }
    public void vBolsa(View view){
        String Url="https://www.youtube.com/watch?v=KL84z7nA2Ys";
        Uri urlUri= Uri.parse(Url);
        Intent intent=new Intent(Intent.ACTION_VIEW,urlUri);
        startActivity(intent);
    }
}
