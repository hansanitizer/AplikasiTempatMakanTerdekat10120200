package com.example.aplikasitempatmakanterdekat10120200;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;


//10120200 - Mochamad Farhan Fadilah Ansori - IF5
public class LokasiTempatMakan extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    FrameLayout map;
    BitmapDescriptorFactory bitmapDescriptorFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi_tempat_makan);

        map = findViewById(R.id.lokasi);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.lokasi);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.gMap = googleMap;

        LatLng mapTempat1 = new LatLng(-6.887839767178779, 107.59115313700849);
        this.gMap.addMarker(new MarkerOptions().position(mapTempat1).title("Baso Solo Artomoro")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(mapTempat1));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mapTempat1, 17));

        LatLng mapTempat2 = new LatLng(-6.892449972179431, 107.5904189248163);
        this.gMap.addMarker(new MarkerOptions().position(mapTempat2).title("Ayam Bakar Serbu")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(mapTempat2));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mapTempat2, 17));

        LatLng mapTempat3 = new LatLng(-6.88984458580162, 107.59117619755357);
        this.gMap.addMarker(new MarkerOptions().position(mapTempat3).title("Seblak-seblak Kuring (Seblak Teh Nita)")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(mapTempat3));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mapTempat3,  17));

        LatLng mapTempat4 = new LatLng(-6.892329072413929, 107.59083596982524);
        this.gMap.addMarker(new MarkerOptions().position(mapTempat4).title("Baso Mang Asep")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(mapTempat4));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mapTempat4,  17));

        LatLng mapTempat5 = new LatLng(-6.887422722714222, 107.59087999648733);
        this.gMap.addMarker(new MarkerOptions().position(mapTempat5).title("Nasi Padang Wa Uda")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(mapTempat5));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mapTempat5,  17));

    }
}