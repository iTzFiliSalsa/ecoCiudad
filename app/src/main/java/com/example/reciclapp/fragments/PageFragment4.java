package com.example.reciclapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.example.reciclapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment4 extends Fragment {
    LinearLayout l4;
    Animation downtoup;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.page_4,container,false);
       /* l4=rootView.findViewById(R.id.l4);
        downtoup= AnimationUtils.loadAnimation(rootView.getContext(),R.anim.downtoup);
        l4.setAnimation(downtoup);*/
        return  rootView;
    }
}
