package com.example.reciclapp.SabiasQue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

import com.example.reciclapp.Reciclar.Papel;
import com.example.reciclapp.R;

public class SabiasQuePapel extends AppCompatActivity {
    Handler handler;
    Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabias_que_papel);
        handler =new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SabiasQuePapel.this, Papel.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable,3000);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode==KeyEvent.KEYCODE_BACK)){
            handler.removeCallbacks(runnable);
            super.onBackPressed();
        }
        return true;
    }
}
