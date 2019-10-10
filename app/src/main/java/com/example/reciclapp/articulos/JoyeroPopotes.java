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

public class JoyeroPopotes extends AppCompatActivity {
    ImageView regresar_joyero_popotes;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joyero_popotes);
        regresar_joyero_popotes=findViewById(R.id.regresar_joyero_popotes);
        regresar_joyero_popotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JoyeroPopotes.super.onBackPressed();
            }
        });
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JoyeroPopotes.this, ContenedorAmarillo.class));
            }
        });
    }
    public void vJoyero(View view){
        String Url="https://www.youtube.com/watch?v=pjxTr5iXULI";
        Uri uriUrl= Uri.parse(Url);
        startActivity(new Intent(Intent.ACTION_VIEW,uriUrl));
    }
}
