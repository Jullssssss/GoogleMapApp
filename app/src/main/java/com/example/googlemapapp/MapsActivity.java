package com.example.googlemapapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.googlemapapp.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng moscow = new LatLng(55.86864204628609, 37.730239202409855);
        mMap.addMarker(new MarkerOptions().position(moscow).title("Moscow").snippet("Москва – столица России. Стоит посмотреть Кремль.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(moscow));

        LatLng voronezh = new LatLng(51.82165588848537, 38.80005605520601);
        mMap.addMarker(new MarkerOptions().position(voronezh).title("Voronezh").snippet("Воронеж. Стоит взглянуть на Котёнка с улицы Лизюкова.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(voronezh));

        LatLng tula = new LatLng(51.82165588848537, 38.80005605520601);
        mMap.addMarker(new MarkerOptions().position(tula).title("Tula").snippet("Тула. Стоит посмотреть на Тульский Кремль.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tula));

        LatLng ryazan = new LatLng(54.61278100873738, 39.73093067076824);
        mMap.addMarker(new MarkerOptions().position(ryazan).title("Ryazan").snippet("Рязань. Стоит сходить в Рязанский музей дальней авиации.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ryazan));

        LatLng kaluga = new LatLng(54.56186443832464, 36.32963306811889);
        mMap.addMarker(new MarkerOptions().position(kaluga).title("Kaluga").snippet("Калуга.Сходите в Мемориальный дом-музей К.Э. Циолковского.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kaluga));

        LatLng Bryansk = new LatLng(53.34000839602551, 34.476166623024774);
        mMap.addMarker(new MarkerOptions().position(Bryansk).title("Bryansk").snippet("Брянск. Посетите Курган Бессмертия.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bryansk));

        LatLng Orel = new LatLng(53.02065611674321, 36.03183244046904);
        mMap.addMarker(new MarkerOptions().position(Orel).title("Orel").snippet("Орёл. Посетите Богоявленский собор.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Orel));

        LatLng Smolensk = new LatLng(54.8370310692743, 32.129775655174875);
        mMap.addMarker(new MarkerOptions().position(Smolensk).title("Smolensk").snippet("Смоленск. Посетите Лопатинский сад.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Smolensk));


        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(@NonNull Marker marker) {
                if (marker.getTitle().equals("Moscow")) {
                    Data.marker = 1;
                } else if (marker.getTitle().equals("Voronezh")) {
                    Data.marker = 2;
                } else if (marker.getTitle().equals("Tula")) {
                    Data.marker = 3;
                } else if (marker.getTitle().equals("Ryazan")) {
                    Data.marker = 4;
                } else if (marker.getTitle().equals("Kaluga")) {
                    Data.marker = 5;
                } else if (marker.getTitle().equals("Bryansk")) {
                    Data.marker = 6;
                } else if (marker.getTitle().equals("Orel")) {
                    Data.marker = 7;
                } else if (marker.getTitle().equals("Smolensk")) {
                    Data.marker = 8;
                }


                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);


                Toast.makeText(getApplicationContext(), "Hi, " + marker.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
}