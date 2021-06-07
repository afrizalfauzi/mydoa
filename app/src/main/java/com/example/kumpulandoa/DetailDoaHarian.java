package com.example.kumpulandoa;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailDoaHarian extends AppCompatActivity {
    ActionBar toolbar;
    TextView juduldoa;
    TextView doaharian;
    TextView latindoaharian;
    TextView terjemahan;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa_harian);

        toolbar = getSupportActionBar();
        juduldoa = findViewById(R.id.detailjudul);
        doaharian = findViewById(R.id.detaildoaharian);
        latindoaharian = findViewById(R.id.detaillatindoaharian);
        terjemahan = findViewById(R.id.detailterjemahan);
        gambar = findViewById(R.id.detailgambar);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            toolbar.setTitle(bundle.getString("judul"));
            juduldoa.setText(bundle.getString("judul"));
            doaharian.setText(bundle.getString("doa"));
            latindoaharian.setText(bundle.getString("latin"));
            terjemahan.setText(bundle.getString("terjemahan"));
            gambar.setImageResource(bundle.getInt("gambar"));
        }
    }

}