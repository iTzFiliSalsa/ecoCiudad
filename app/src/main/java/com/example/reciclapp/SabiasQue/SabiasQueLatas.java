package com.example.reciclapp.SabiasQue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;

import com.example.reciclapp.Reciclar.Latas;
import com.example.reciclapp.R;

public class SabiasQueLatas extends AppCompatActivity {
    Handler handler;
    Runnable runnable;
    ImageView regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabias_que_latas);
        handler =new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SabiasQueLatas.this, Latas.class);
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
