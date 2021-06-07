package com.example.kumpulandoa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailDoaSetelahSholat extends AppCompatActivity {
    ActionBar toolbar;
    TextView juduldoa;
    TextView doaarab;
    TextView latindoa;
    TextView terjemahan;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_doasetelahsholat);

        toolbar = getSupportActionBar();
        juduldoa = findViewById(R.id.detailjudul);
        doaarab = findViewById(R.id.detaildoasetelahsholat);
        latindoa = findViewById(R.id.detaillatindoasetelahsholat);
        terjemahan = findViewById(R.id.detailterjemahansetelahsholat);
        gambar = findViewById(R.id.detailgambar);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            toolbar.setTitle(bundle.getString("judul"));
            juduldoa.setText(bundle.getString("judul"));
            doaarab.setText(bundle.getString("doa"));
            latindoa.setText(bundle.getString("latin"));
            terjemahan.setText(bundle.getString("terjemahan"));
            gambar.setImageResource(bundle.getInt("gambar"));
        }
    }

}