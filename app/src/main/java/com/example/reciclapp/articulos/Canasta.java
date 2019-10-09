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

public class Canasta extends AppCompatActivity {
    ImageView regresar_canasta;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canasta);
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Canasta.this, ContenedorAmarillo.class));
            }
        });
        regresar_canasta=findViewById(R.id.regresar_canasta);
        regresar_canasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Canasta.super.onBackPressed();
            }
        });
    }
    public void vCanasta(View view){
        String Url="https://www.youtube.com/watch?v=GM-JbO9oVME";
        Uri uriUrl=Uri.parse(Url);
        Intent in=new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(in);
    }
}
