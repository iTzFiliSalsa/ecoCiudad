package com.example.reciclapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button continua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        continua=findViewById(R.id.continua);
        continua.setOnClickListener(this);
        RelativeLayout relativeLayout=findViewById(R.id.layout);
        AnimationDrawable animationDrawable=(AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.continua:
                continua.setEnabled(false);
                abrir();
                break;
        }
    }
    public void abrir(){
        startActivity(new Intent(this,CurvedNavigation.class));
        finish();
    }
}
