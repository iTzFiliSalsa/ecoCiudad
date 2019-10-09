package com.example.reciclapp.Lugares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.reciclapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RioFrio extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rio_frio);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.riofrio);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng posicion_riofrio=new LatLng(22.8418423,-99.0255828);
        googleMap.addMarker(new MarkerOptions().position(posicion_riofrio).title("Rio Frio"));
        CameraPosition cameraPosition=CameraPosition.builder().target(posicion_riofrio).zoom(15).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
}
