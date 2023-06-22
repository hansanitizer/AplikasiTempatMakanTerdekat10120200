package com.example.aplikasitempatmakanterdekat10120200;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

//10120200 - Mochamad Farhan Fadilah Ansori - IF5
public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.nav_home:
                    return true;
                case R.id.nav_lokasi_user:
                    startActivity(new Intent(getApplicationContext(), LokasiUser.class));
                    Toast.makeText(MenuUtama.this, "Lokasi Pengguna", Toast.LENGTH_SHORT).show();
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return true;
                case R.id.nav_lokasi_tempat:
                    startActivity(new Intent(getApplicationContext(), LokasiTempatMakan.class));
                    Toast.makeText(MenuUtama.this, "Lokasi Tempat Makan Favorit", Toast.LENGTH_SHORT).show();
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return true;
                case R.id.nav_profil:
                    startActivity(new Intent(getApplicationContext(), MenuProfil.class));
                    Toast.makeText(MenuUtama.this, "Profil Mahasiswa", Toast.LENGTH_SHORT).show();
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return true;
                case R.id.nav_tentang:
                    startActivity(new Intent(getApplicationContext(), TentangAplikasi.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return true;
            }
            return false;
        });
    }
}