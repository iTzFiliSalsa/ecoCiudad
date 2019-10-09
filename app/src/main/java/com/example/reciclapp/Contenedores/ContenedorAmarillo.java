package com.example.reciclapp.Contenedores;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reciclapp.R;
import com.example.reciclapp.fragments.ContenedoresBasura;

public class ContenedorAmarillo extends AppCompatActivity {
    CardView correcto,deposita_amarillo,incorrecto,curiosidades_amarillo;
    ImageView regresar_amarillo;
    AlertDialog alertDialog;
    AlertDialog.Builder dialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_amarillo);
        curiosidades_amarillo=findViewById((R.id.curiosidades_amarillo));
        curiosidades_amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.curiosidades_amarillo);
            }
        });
        deposita_amarillo=findViewById((R.id.deposita_amarillo));
        deposita_amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.deposita_amarillo);
            }
        });
        incorrecto=findViewById(R.id.incorrecto);
        incorrecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlertDialog(R.layout.no_deposites_amarillo);
            }
        });
        correcto=findViewById(R.id.correcto);
        correcto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ContenedorAmarillo.this, ContenedoresBasura.class));
            }
        });
        regresar_amarillo=findViewById(R.id.regresar_amarillo);
        regresar_amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContenedorAmarillo.super.onBackPressed();
            }
        });
    }
    private void showAlertDialog(int layout){
        dialogBuilder = new AlertDialog.Builder(ContenedorAmarillo.this);
        View layoutView = getLayoutInflater().inflate(layout, null);
        dialogBuilder.setView(layoutView);
        alertDialog = dialogBuilder.create();
        alertDialog.show();
    }
}
