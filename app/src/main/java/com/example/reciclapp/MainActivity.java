package com.example.reciclapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.reciclapp.fragments.PageFragment1;
import com.example.reciclapp.fragments.PageFragment2;
import com.example.reciclapp.fragments.PageFragment3;
import com.example.reciclapp.fragments.PageFragment4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private LinearLayout Dots_Layout;
    private ImageView[] dots;
    private Button btnSaltar,btnSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if(new PreferenceManager(this).checkPreference()){
            loadHome();
        }*/
        setContentView(R.layout.activity_main);

        List<Fragment> list=new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());
        list.add(new PageFragment4());
        pager=findViewById(R.id.pager);
        pagerAdapter=new SliderPagerAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);

        Dots_Layout=(LinearLayout)findViewById(R.id.dotsLayout);
        btnSiguiente=findViewById(R.id.btnSiguiente);
        btnSaltar=findViewById(R.id.btnSaltar);

        btnSaltar.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);

        createDots(0);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                createDots(position);
                if(position==3){
                    btnSiguiente.setText("Empezar");
                    btnSaltar.setVisibility(View.INVISIBLE);
                }else{
                    btnSiguiente.setText("Siguiente");
                    btnSaltar.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void createDots(int current_position){
        if(Dots_Layout!=null)
            Dots_Layout.removeAllViews();

        dots=new ImageView[4];
        for(int i=0;i<4;i++){
            dots[i]=new ImageView(this);
            if(i==current_position){
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.active_dots));
            }else{
                dots[i].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.default_dots));
            }
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(4,0,4,0);
            Dots_Layout.addView(dots[i],params);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSiguiente:
                loadNextSlide();
                break;
            case R.id.btnSaltar:
                loadHome();
                //new PreferenceManager(this).writePreference();
                break;
        }
    }
    private void loadHome(){
        startActivity(new Intent(this,Login.class));
        finish();
    }
    private void loadNextSlide(){
        int next_slide=pager.getCurrentItem()+1;
        if(next_slide<4){
            pager.setCurrentItem(next_slide);
        }else{
            loadHome();
            new PreferenceManager(this).writePreference();
        }
    }
}
