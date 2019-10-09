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

public class Linares extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linares);
        //
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.linares);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng posicion_linares=new LatLng(22.7539366,-99.0055004);
        googleMap.addMarker(new MarkerOptions()
            .position(posicion_linares)
            .title("Linares"));
        CameraPosition cameraPosition= CameraPosition.builder().target(posicion_linares).zoom(15).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));




    }
}
