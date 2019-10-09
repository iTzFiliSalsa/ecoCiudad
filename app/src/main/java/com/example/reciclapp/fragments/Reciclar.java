package com.example.reciclapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;

import com.example.reciclapp.R;
import com.example.reciclapp.SabiasQue.SabiasQueBolsas;
import com.example.reciclapp.SabiasQue.SabiasQueBotellas;
import com.example.reciclapp.SabiasQue.SabiasQueLatas;
import com.example.reciclapp.SabiasQue.SabiasQueMadera;
import com.example.reciclapp.SabiasQue.SabiasQuePapel;
import com.example.reciclapp.SabiasQue.SabiasQuePopotes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Reciclar extends Fragment {

    LinearLayout l2;
    Animation downtoup;
    CardView botellas,latas,envolturas,papel,madera,popotes;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.reciclar,container,false);
       /* l2=rootView.findViewById(R.id.l2);
        downtoup= AnimationUtils.loadAnimation(rootView.getContext(),R.anim.downtoup);
        l2.setAnimation(downtoup);*/
       botellas=rootView.findViewById(R.id.botellas);
       latas=rootView.findViewById(R.id.latas);
       envolturas=rootView.findViewById(R.id.envolturas);
       papel=rootView.findViewById(R.id.papel);
       madera=rootView.findViewById(R.id.madera);
       popotes=rootView.findViewById(R.id.popotes);
       botellas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(rootView.getContext(),SabiasQueBotellas.class));
           }
       });
       latas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), SabiasQueLatas.class));
            }
        });
        envolturas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), SabiasQueBolsas.class));
            }
        });
        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), SabiasQuePapel.class));
            }
        });
        madera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), SabiasQueMadera.class));
            }
        });
        popotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rootView.getContext(), SabiasQuePopotes.class));
            }
        });
        return  rootView;
    }
}
