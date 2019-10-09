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

public class Cartera extends AppCompatActivity {
    ImageView regresar_macetalata;
    CardView abriramarillo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartera);
        abriramarillo=findViewById(R.id.abriramarillo);
        abriramarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cartera.this, ContenedorAmarillo.class));
                finish();
            }
        });
        regresar_macetalata=findViewById(R.id.regresar_macetalata);
        regresar_macetalata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cartera.this.onBackPressed();
            }
        });
    }
    public void vCarteras(View view){
        String url="https://www.youtube.com/watch?v=ssvwMGwgrsk";
        Uri uriRul=Uri.parse(url);
        Intent launchBrowser=new Intent(Intent.ACTION_VIEW,uriRul);
        startActivity(launchBrowser);
    }
}
