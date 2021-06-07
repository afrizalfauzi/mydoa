package com.example.kumpulandoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {
CardView doaharian, doaparanabi, doasetelahsholat, doapilihan, doasholatsunah, tentangaplikasi, profilpembuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        doaharian = findViewById(R.id.doaharian);
        doaparanabi = findViewById(R.id.doaparanabi);
        doasetelahsholat = findViewById(R.id.doasetelahsholat);
        doapilihan = findViewById(R.id.doapilihan);
        doasholatsunah = findViewById(R.id.doasholatsunah);
        tentangaplikasi = findViewById(R.id.tentangaplikasi);
        profilpembuat = findViewById(R.id.profilpembuat);

        doaharian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Menu.this, DoaHarian.class);
                startActivity(Menu);
            }
        });

        doaparanabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Menu.this, DoaParaNabi.class);
                startActivity(Menu);
            }
        });

        doasetelahsholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Menu.this, DoaSetelahSholat.class);
                startActivity(Menu);
            }
        });

        doapilihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Menu.this, DoaPilihan.class);
                startActivity(Menu);
            }
        });

        doasholatsunah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Menu.this, DoaSholatSunah.class);
                startActivity(Menu);
            }
        });

        tentangaplikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Menu.this, TentangAplikasi.class);
                startActivity(Menu);
            }
        });

        profilpembuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Menu = new Intent(Menu.this, ProfilPembuat.class);
                startActivity(Menu);
            }
        });
    }
}