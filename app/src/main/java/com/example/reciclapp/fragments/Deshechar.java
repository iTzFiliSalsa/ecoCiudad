package com.example.reciclapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;

import com.example.reciclapp.Contenedores.ContenedorAmarillo;
import com.example.reciclapp.Contenedores.ContenedorAzul;
import com.example.reciclapp.Contenedores.ContenedorGris;
import com.example.reciclapp.Contenedores.ContenedorNaranja;
import com.example.reciclapp.Contenedores.ContenedorRojo;
import com.example.reciclapp.Contenedores.ContenedorVerde;
import com.example.reciclapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Deshechar extends Fragment {
    CardView amarillo,verde,azul,papel,unicel_plato,botella_acc,botella_vidrio;/*rojo,gris,naranja*/
    LinearLayout l1;
    Animation uptodown;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.deshechar,container,false);
        //l1= rootView.findViewById(R.id.l1);
        /*uptodown= AnimationUtils.loadAnimation(rootView.getContext(),R.anim.uptodown);
        l1.setAnimation(uptodown);*/
        botella_vidrio=rootView.findViewById(R.id.botella_vidrio);
        botella_vidrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorVerde.class));
            }
        });
        botella_acc=rootView.findViewById(R.id.botella_acc);
        botella_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorAmarillo.class));
            }
        });
        unicel_plato=rootView.findViewById(R.id.unicel_plato);
        unicel_plato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorAmarillo.class));
            }
        });
        papel=rootView.findViewById(R.id.papel);
        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorAzul.class));
            }
        });
        amarillo=rootView.findViewById(R.id.amarillo);
        amarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorAmarillo.class));
            }
        });
        verde=rootView.findViewById(R.id.verde);
        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorVerde.class));
            }
        });
       /* rojo=rootView.findViewById(R.id.rojo);
        rojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorRojo.class));
            }
        }); */
        azul=rootView.findViewById(R.id.azul);
        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorAzul.class));
            }
        });
        /*gris=rootView.findViewById(R.id.gris);
        gris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorGris.class));
            }
        }); */
        /*naranja=rootView.findViewById(R.id.naranja);
        naranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), ContenedorNaranja.class));
            }
        }); */
        return  rootView;
    }


}
