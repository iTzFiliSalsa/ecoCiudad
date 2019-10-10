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

public class Florero extends AppCompatActivity {
    ImageView regresar_florero;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_florero);
        regresar_florero=findViewById(R.id.regresar_florero);
        regresar_florero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Florero.super.onBackPressed();
            }
        });
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Florero.this, ContenedorAmarillo.class));
            }
        });
    }
    public void vFlorero(View view){
        String Url="https://www.youtube.com/watch?v=5yEHJk2uqO0";
        Uri urluri= Uri.parse(Url);
        startActivity(new Intent(Intent.ACTION_VIEW,urluri));
    }
}
