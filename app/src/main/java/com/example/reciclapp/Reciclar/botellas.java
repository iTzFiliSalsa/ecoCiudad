package com.example.reciclapp.Reciclar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.reciclapp.Contenedores.ContenedorAmarillo;
import com.example.reciclapp.R;
import com.example.reciclapp.articulos.Escobas;
import com.example.reciclapp.articulos.Joyero;
import com.example.reciclapp.articulos.Lampara;
import com.example.reciclapp.articulos.maceta;

public class botellas extends AppCompatActivity {
    AlertDialog alertDialog;
    AlertDialog.Builder alertBuilder;
    LinearLayout amarillo_botellas;
    CardView macetero_botellas,escoba_botellas,joyero_botellas,botellas_lampara;
    ImageView regresar_botellas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botellas);
        botellas_lampara=findViewById(R.id.botellas_lampara);
        botellas_lampara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(botellas.this, Lampara.class));
            }
        });
        amarillo_botellas=findViewById(R.id.amarillo_botellas);
        amarillo_botellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(botellas.this,ContenedorAmarillo.class));
            }
        });
        joyero_botellas=findViewById(R.id.joyero_botellas);
        joyero_botellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(botellas.this, Joyero.class));
            }
        });
        escoba_botellas=findViewById(R.id.escoba_botellas);
        escoba_botellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(botellas.this, Escobas.class));
            }
        });
        regresar_botellas=findViewById(R.id.regresar_botellas);
        regresar_botellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botellas.super.onBackPressed();
            }
        });
        macetero_botellas=findViewById(R.id.macetero_botellas);
        macetero_botellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(botellas.this, maceta.class));
                // showAlertDialog(R.layout.macetas);
            }
        });
    }
    public void showAlertDialog(int layout){
        alertBuilder=new AlertDialog.Builder(botellas.this);
        View layoutView = getLayoutInflater().inflate(layout, null);
        alertBuilder.setView(layoutView);
        alertDialog=alertBuilder.create();
        alertBuilder.show();
    }
}
