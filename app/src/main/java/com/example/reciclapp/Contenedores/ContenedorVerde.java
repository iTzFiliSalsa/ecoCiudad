package com.example.reciclapp.Contenedores;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;

public class ContenedorVerde extends AppCompatActivity {
    CardView deposita_verde,incorrecto_verde,contenedor_verde,curiosidades_verde;
    ImageView regresar_verde;
    AlertDialog alertDialog;
    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_verde);
        curiosidades_verde=findViewById(R.id.curiosidades_verde);
        curiosidades_verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.curiosidades_verde);
            }
        });
        contenedor_verde=findViewById(R.id.contenedor_verde);
        contenedor_verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenedorVerde.this,ContenedoresVerdes.class));
            }
        });
        regresar_verde=findViewById(R.id.regresar_verde);
        regresar_verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContenedorVerde.super.onBackPressed();
            }
        });
        incorrecto_verde=findViewById(R.id.incorrecto_verde);
        incorrecto_verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.no_deposites_verde);
            }
        });
        deposita_verde=findViewById(R.id.deposita_verde);
        deposita_verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.deposita_verde);
            }
        });
    }
    public void showAlertDialog(int layout){
        alertBuilder=new AlertDialog.Builder(ContenedorVerde.this);
        View layoutView=getLayoutInflater().inflate(layout,null);
        alertBuilder.setView(layoutView);
        alertDialog=alertBuilder.create();
        alertBuilder.show();
    }
}
