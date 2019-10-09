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

public class PageFragment3 extends Fragment {
    LinearLayout l3;
    Animation uptodown;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.page_3,container,false);
       /* l3=rootView.findViewById(R.id.l3);
        uptodown= AnimationUtils.loadAnimation(rootView.getContext(),R.anim.uptodown);
        l3.setAnimation(uptodown);*/
        return  rootView;
    }
}
