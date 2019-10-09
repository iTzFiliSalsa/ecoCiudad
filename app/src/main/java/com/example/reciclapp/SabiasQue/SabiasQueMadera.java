package com.example.reciclapp.SabiasQue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

import com.example.reciclapp.Reciclar.Madera;
import com.example.reciclapp.R;

public class SabiasQueMadera extends AppCompatActivity {
    Handler handler;
    Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabias_que_madera);

        handler=new Handler();
        runnable= new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SabiasQueMadera.this, Madera.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable,3000);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent Event){
        if((keyCode==KeyEvent.KEYCODE_BACK)){
            handler.removeCallbacks(runnable);
            super.onBackPressed();
        }
        return true;
    }
}
