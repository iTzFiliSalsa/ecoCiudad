package com.example.reciclapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.reciclapp.R;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.reciclapp.fragments.Deshechar;
import com.example.reciclapp.fragments.PageFragment1;
import com.example.reciclapp.fragments.PageFragment2;
import com.example.reciclapp.fragments.PageFragment3;
import com.example.reciclapp.fragments.Puntos;
import com.example.reciclapp.fragments.Reciclar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.sdsmdg.harjot.vectormaster.VectorMasterView;
import com.sdsmdg.harjot.vectormaster.models.PathModel;

import java.util.ArrayList;
import java.util.List;

public class CurvedNavigation extends AppCompatActivity  {
    SpaceNavigationView navigationView;

    /*CurvedBottomNavigationView bottomNavigationView;
    VectorMasterView fab,fab1,fab2;
    RelativeLayout lin_id;
    PathModel outline;*/
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curved_navigation);
        List<Fragment> fragmentList=new ArrayList<>();
        fragmentList.add(new Deshechar());
        fragmentList.add(new Reciclar());
        fragmentList.add(new Puntos());
        pager=findViewById(R.id.pager);
        pagerAdapter=new SliderPagerAdapter(getSupportFragmentManager(),fragmentList);
        pager.setAdapter(pagerAdapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    navigationView.changeCurrentItem(position);
                }else if(position==1){
                    navigationView.setCentreButtonSelectable(true);
                    navigationView.setCentreButtonSelected();

                }else if(position==2){
                    navigationView.changeCurrentItem(1);
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        navigationView=findViewById(R.id.space);
        navigationView.initWithSaveInstanceState(savedInstanceState);
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_trash));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_location_on_black_24dp));
        navigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                //Toast.makeText(CurvedNavigation.this,"", Toast.LENGTH_SHORT).show();
                pager.setCurrentItem(1);
                navigationView.setCentreButtonSelectable(true);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                if(itemIndex==0){
                    pager.setCurrentItem(0);
                }else if(itemIndex==1){
                    pager.setCurrentItem(2);
                }
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                //Toast.makeText(CurvedNavigation.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });
/*
        //
        bottomNavigationView=findViewById(R.id.bottom_nav);
        fab=(VectorMasterView)findViewById(R.id.fab);
        fab1=(VectorMasterView)findViewById(R.id.fab1);
        fab2=(VectorMasterView)findViewById(R.id.fab2);

        lin_id=(RelativeLayout)findViewById(R.id.lin_id);
        bottomNavigationView.inflateMenu(R.menu.main);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);*/
    }
/*
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
       switch (menuItem.getItemId()){
            case R.id.deshechar:
                draw(6);
                lin_id.setX(bottomNavigationView.mFirstCurveControlPoint1.x);
                fab.setVisibility(View.VISIBLE);
                fab1.setVisibility(View.GONE);
                fab2.setVisibility(View.GONE);
                drawAnimation(fab);
               break;
           case R.id.reciclar:
               draw(2);
               lin_id.setX(bottomNavigationView.mFirstCurveControlPoint1.x);
               fab.setVisibility(View.GONE);
               fab1.setVisibility(View.VISIBLE);
               fab2.setVisibility(View.GONE);
               drawAnimation(fab1);
               break;
           case R.id.puntos:
               draw();
               lin_id.setX(bottomNavigationView.mFirstCurveControlPoint1.x);
               fab.setVisibility(View.GONE);
               fab1.setVisibility(View.GONE);
               fab2.setVisibility(View.VISIBLE);
               drawAnimation(fab2);
               break;

        }
        return true;
    }*/
/*
    private void draw() {
        bottomNavigationView.mFirstCurveStartPoint.set((bottomNavigationView.mNavigationBarWidth*10/12)
        -(bottomNavigationView.CURVE_CIRCLE_RADIUS*2)
        -(bottomNavigationView.CURVE_CIRCLE_RADIUS*3),0);

        bottomNavigationView.mFirstCurveEndPoint.set(bottomNavigationView.mNavigationBarWidth*10/12,bottomNavigationView.CURVE_CIRCLE_RADIUS
                +(bottomNavigationView.CURVE_CIRCLE_RADIUS/4));

        bottomNavigationView.mSecondCurveStartPoint=bottomNavigationView.mFirstCurveEndPoint;
        bottomNavigationView.mSecondCurveEndPoint.set((bottomNavigationView.mNavigationBarWidth*10/12)
                +(bottomNavigationView.CURVE_CIRCLE_RADIUS*2)+(bottomNavigationView.CURVE_CIRCLE_RADIUS/3),0);

        bottomNavigationView.mFirstCurveControlPoint1.set(bottomNavigationView.mFirstCurveStartPoint.x
                        +bottomNavigationView.CURVE_CIRCLE_RADIUS+(bottomNavigationView.CURVE_CIRCLE_RADIUS/4),
                bottomNavigationView.mFirstCurveStartPoint.y);
        bottomNavigationView.mFirstCurveControlPoint2.set(bottomNavigationView.mFirstCurveEndPoint.x-
                        (bottomNavigationView.CURVE_CIRCLE_RADIUS*2)+bottomNavigationView.CURVE_CIRCLE_RADIUS,
                bottomNavigationView.mFirstCurveEndPoint.y);

        //

        bottomNavigationView.mSecondCurveControlPoint1.set(bottomNavigationView.mSecondCurveStartPoint.x
                        +(bottomNavigationView.CURVE_CIRCLE_RADIUS*2)-bottomNavigationView.CURVE_CIRCLE_RADIUS,
                bottomNavigationView.mSecondCurveStartPoint.y);
        bottomNavigationView.mSecondCurveControlPoint2.set(bottomNavigationView.mSecondCurveEndPoint.x-
                (bottomNavigationView.CURVE_CIRCLE_RADIUS+(bottomNavigationView.CURVE_CIRCLE_RADIUS/4)),bottomNavigationView.mSecondCurveEndPoint.y);

    }

    private void drawAnimation(final VectorMasterView fab) {
        outline=fab.getPathModelByName("outline");
        outline.setStrokeColor(Color.WHITE);
        outline.setTrimPathEnd(0.0f);
        //
        ValueAnimator valueAnimator=ValueAnimator.ofFloat(0.0f,1.0f);
        valueAnimator.setDuration(1000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                outline.setTrimPathEnd((Float)valueAnimator.getAnimatedValue());
                fab.update();
            }
        });
        valueAnimator.start();

    }

    private void draw(int i) {
        bottomNavigationView.mFirstCurveStartPoint.set((bottomNavigationView.mNavigationBarWidth/i)
        -(bottomNavigationView.CURVE_CIRCLE_RADIUS*2)-(bottomNavigationView.CURVE_CIRCLE_RADIUS/3),0);

        bottomNavigationView.mFirstCurveEndPoint.set(bottomNavigationView.mNavigationBarWidth/i,bottomNavigationView.CURVE_CIRCLE_RADIUS
        +(bottomNavigationView.CURVE_CIRCLE_RADIUS/4));

        bottomNavigationView.mSecondCurveStartPoint=bottomNavigationView.mFirstCurveEndPoint;
        bottomNavigationView.mSecondCurveEndPoint.set((bottomNavigationView.mNavigationBarWidth/i)
                +(bottomNavigationView.CURVE_CIRCLE_RADIUS*2)+(bottomNavigationView.CURVE_CIRCLE_RADIUS/3),0);

        bottomNavigationView.mFirstCurveControlPoint1.set(bottomNavigationView.mFirstCurveStartPoint.x
        +bottomNavigationView.CURVE_CIRCLE_RADIUS+(bottomNavigationView.CURVE_CIRCLE_RADIUS/4),
                bottomNavigationView.mFirstCurveStartPoint.y);

        bottomNavigationView.mFirstCurveControlPoint2.set(bottomNavigationView.mFirstCurveEndPoint.x-
                (bottomNavigationView.CURVE_CIRCLE_RADIUS*2)+bottomNavigationView.CURVE_CIRCLE_RADIUS,
                bottomNavigationView.mFirstCurveEndPoint.y);

        //

        bottomNavigationView.mSecondCurveControlPoint1.set(bottomNavigationView.mSecondCurveStartPoint.x
                        +(bottomNavigationView.CURVE_CIRCLE_RADIUS*2)-bottomNavigationView.CURVE_CIRCLE_RADIUS,
                bottomNavigationView.mSecondCurveStartPoint.y);
        bottomNavigationView.mSecondCurveControlPoint2.set(bottomNavigationView.mSecondCurveEndPoint.x-
                (bottomNavigationView.CURVE_CIRCLE_RADIUS+(bottomNavigationView.CURVE_CIRCLE_RADIUS/4)),bottomNavigationView.mSecondCurveEndPoint.y);



    }*/
}
