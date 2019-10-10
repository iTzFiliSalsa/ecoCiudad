package com.example.reciclapp.Contenedores;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class ContenedorAzul extends AppCompatActivity {

    CardView deposita_azul,incorrecto_azul,ubicacion_azules,curiosidad_azul;
    ImageView regresar_azul;
    AlertDialog alertDialog;
    AlertDialog.Builder alertBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_azul);
        regresar_azul=findViewById(R.id.regresar_azul);
        regresar_azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContenedorAzul.super.onBackPressed();
            }
        });
        incorrecto_azul=findViewById(R.id.incorrecto_azul);
        incorrecto_azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.no_deposites_azul);
            }
        });
        curiosidad_azul=findViewById(R.id.curiosidad_azul);
        curiosidad_azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.curiosidades_azul);
            }
        });
        deposita_azul=findViewById(R.id.deposita_azul);
        deposita_azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.deposita_azul);
            }
        });
        ubicacion_azules=findViewById(R.id.ubicacion_azules);
        ubicacion_azules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenedorAzul.this, com.example.reciclapp.fragments.ContenedorAzul.class));
            }
        });
    }
    public void showAlertDialog(int layout){
        alertBuilder=new AlertDialog.Builder(ContenedorAzul.this);
        View layoutView = getLayoutInflater().inflate(layout, null);
        alertBuilder.setView(layoutView);
        alertDialog=alertBuilder.create();
        alertBuilder.show();
    }
}
