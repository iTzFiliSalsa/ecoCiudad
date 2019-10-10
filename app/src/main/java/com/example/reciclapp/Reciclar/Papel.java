package com.example.reciclapp.Reciclar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;
import com.example.reciclapp.articulos.BolsaRegalo;
import com.example.reciclapp.articulos.Canasta;

public class Papel extends AppCompatActivity {
    ImageView ret;
    CardView canasta,bolsa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papel);
        bolsa=findViewById(R.id.bolsa);
        bolsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Papel.this, BolsaRegalo.class));
            }
        });
        canasta=findViewById(R.id.canasta);
        canasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Papel.this, Canasta.class));
            }
        });
        ret=findViewById(R.id.ret);
        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Papel.super.onBackPressed();
            }
        });
    }
}
