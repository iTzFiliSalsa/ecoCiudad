package com.example.reciclapp.SabiasQue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.ImageView;

import com.example.reciclapp.R;
import com.example.reciclapp.Reciclar.botellas;

public class SabiasQueBotellas extends AppCompatActivity {
    Handler handler;
    Runnable runnable;
    ImageView regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabias_que_botellas);

        /*regresar=findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });*/
        handler =new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SabiasQueBotellas.this, botellas.class);
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
