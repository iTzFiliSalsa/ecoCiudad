package com.example.reciclapp.SabiasQue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

import com.example.reciclapp.R;
import com.example.reciclapp.Reciclar.Popotes;

public class SabiasQuePopotes extends AppCompatActivity {
    Handler handler;
    Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabias_que_popotes);

        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(new Intent(SabiasQuePopotes.this, Popotes.class));
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable,3000);
    }
    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent Event){
        if(KeyCode==KeyEvent.KEYCODE_BACK){
            handler.removeCallbacks(runnable);
            super.onBackPressed();
        }
        return true;
    }
}
