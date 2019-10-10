package com.example.reciclapp.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.reciclapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContenedoresBasura extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedores_basura);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng cali = new LatLng(22.7419146, -98.9723378);
        /*googleMap.addMarker(new MarkerOptions()
                .position(cali)
                .title("Cali la Sucursal del cielo"));*/

        LatLng amarillo=new LatLng(22.7521658,-98.9725529);
        googleMap.addMarker(new MarkerOptions()
                .position(amarillo)
                .title("Contenedor Amarillo")
        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng amarillo_2=new LatLng(22.7369909,-98.967773);
        googleMap.addMarker(new MarkerOptions()
                .position(amarillo_2)
                .title("Contenedor Amarillo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng amarillo_3=new LatLng(22.7351073,-98.9836191);
        googleMap.addMarker(new MarkerOptions()
                .position(amarillo_3)
                .title("Contenedor Amarillo")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        CameraPosition cameraPosition = CameraPosition.builder()
                .target(cali)
                .zoom(14)
                .build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
}
