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

public class PageFragment1 extends Fragment {
    LinearLayout l1;
    Animation uptodown;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.page_1,container,false);
        l1= rootView.findViewById(R.id.l1);
        uptodown= AnimationUtils.loadAnimation(rootView.getContext(),R.anim.uptodown);
        l1.setAnimation(uptodown);

        return  rootView;
    }
}
