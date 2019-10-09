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

public class PageFragment2 extends Fragment {

    LinearLayout l2;
    Animation downtoup;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.page_2,container,false);
       /* l2=rootView.findViewById(R.id.l2);
        downtoup= AnimationUtils.loadAnimation(rootView.getContext(),R.anim.downtoup);
        l2.setAnimation(downtoup);*/
        return  rootView;
    }
}
