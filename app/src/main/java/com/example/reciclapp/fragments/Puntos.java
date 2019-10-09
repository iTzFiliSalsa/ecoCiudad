package com.example.reciclapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;

import com.example.reciclapp.Lugares.InformacionRastro;
import com.example.reciclapp.Lugares.InformacionDifusora;
import com.example.reciclapp.Lugares.InformacionLinares;
import com.example.reciclapp.Lugares.InformacionNacimiento;
import com.example.reciclapp.Lugares.InformacionParqueLineal;
import com.example.reciclapp.Lugares.InformacionRioFrio;
import com.example.reciclapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Puntos extends Fragment {
    LinearLayout l3;
    CardView balneario_ladifusora,rastro,informacion_linares,informacion_nacimiento,informacion_lineal,riofrio_informacion;
    Animation uptodown;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.puntos,container,false);
       /* l3=rootView.findViewById(R.id.l3);
        uptodown= AnimationUtils.loadAnimation(rootView.getContext(),R.anim.uptodown);
        l3.setAnimation(uptodown);*/
       riofrio_informacion=rootView.findViewById(R.id.riofrio_informacion);
       riofrio_informacion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(rootView.getContext(), InformacionRioFrio.class));
           }
       });
       informacion_lineal=rootView.findViewById(R.id.informacion_lineal);
       informacion_lineal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(rootView.getContext(), InformacionParqueLineal.class));
           }
       });
       informacion_nacimiento=rootView.findViewById(R.id.informacion_nacimiento);
       informacion_nacimiento.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(rootView.getContext(), InformacionNacimiento.class));
           }
       });
       balneario_ladifusora=rootView.findViewById(R.id.balneario_ladifusora);
       balneario_ladifusora.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(rootView.getContext(), InformacionDifusora.class));
           }
       });
       rastro=rootView.findViewById(R.id.rastro);
       rastro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(rootView.getContext(), InformacionRastro.class));
           }
       });
       informacion_linares=rootView.findViewById(R.id.informacion_linares);
       informacion_linares.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(rootView.getContext(), InformacionLinares.class));
           }
       });
        return  rootView;
    }
}
