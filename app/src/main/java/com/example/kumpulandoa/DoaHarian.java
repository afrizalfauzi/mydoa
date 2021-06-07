package com.example.kumpulandoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DoaHarian extends AppCompatActivity {
    RecyclerView recyclerview;
    private Context context;
    private List<StoredDataDoaHarian> listdoa;
    StoredDataDoaHarian storedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);


        recyclerview=findViewById(R.id.recycle);
        recyclerview.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager
                (DoaHarian.this, 2);
        recyclerview.setLayoutManager(gridLayoutManager);
        listdoa = new ArrayList<>();


        storedData = new StoredDataDoaHarian(getString(R.string.doaharian1),R.drawable.carddoa,getString(R.string.isi_doa_harian1),getString(R.string.latindoaharian1),getString(R.string.terjemahan1));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian2),R.drawable.carddoa,getString(R.string.isi_doa_harian2),getString(R.string.latindoaharian2),getString(R.string.terjemahan2));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian3),R.drawable.carddoa,getString(R.string.isi_doa_harian3),getString(R.string.latindoaharian3),getString(R.string.terjemahan3));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian4),R.drawable.carddoa,getString(R.string.isi_doa_harian4),getString(R.string.latindoaharian4),getString(R.string.terjemahan4));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian5),R.drawable.carddoa,getString(R.string.isi_doa_harian5),getString(R.string.latindoaharian5),getString(R.string.terjemahan5));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian6),R.drawable.carddoa,getString(R.string.isi_doa_harian6),getString(R.string.latindoaharian6),getString(R.string.terjemahan6));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian7),R.drawable.carddoa,getString(R.string.isi_doa_harian7),getString(R.string.latindoaharian7),getString(R.string.terjemahan7));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian8),R.drawable.carddoa,getString(R.string.isi_doa_harian8),getString(R.string.latindoaharian8),getString(R.string.terjemahan8));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian9),R.drawable.carddoa,getString(R.string.isi_doa_harian9),getString(R.string.latindoaharian9),getString(R.string.terjemahan9));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian10),R.drawable.carddoa,getString(R.string.isi_doa_harian10),getString(R.string.latindoaharian10),getString(R.string.terjemahan10));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian11),R.drawable.carddoa,getString(R.string.isi_doa_harian11),getString(R.string.latindoaharian11),getString(R.string.terjemahan11));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian12),R.drawable.carddoa,getString(R.string.isi_doa_harian12),getString(R.string.latindoaharian12),getString(R.string.terjemahan12));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian13),R.drawable.carddoa,getString(R.string.isi_doa_harian13),getString(R.string.latindoaharian13),getString(R.string.terjemahan13));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian14),R.drawable.carddoa,getString(R.string.isi_doa_harian14),getString(R.string.latindoaharian14),getString(R.string.terjemahan14));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian15),R.drawable.carddoa,getString(R.string.isi_doa_harian15),getString(R.string.latindoaharian15),getString(R.string.terjemahan15));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian16),R.drawable.carddoa,getString(R.string.isi_doa_harian16),getString(R.string.latindoaharian16),getString(R.string.terjemahan16));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian17),R.drawable.carddoa,getString(R.string.isi_doa_harian17),getString(R.string.latindoaharian17),getString(R.string.terjemahan17));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian18),R.drawable.carddoa,getString(R.string.isi_doa_harian18),getString(R.string.latindoaharian18),getString(R.string.terjemahan18));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian19),R.drawable.carddoa,getString(R.string.isi_doa_harian19),getString(R.string.latindoaharian19),getString(R.string.terjemahan19));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian20),R.drawable.carddoa,getString(R.string.isi_doa_harian20),getString(R.string.latindoaharian20),getString(R.string.terjemahan20));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian21),R.drawable.carddoa,getString(R.string.isi_doa_harian21),getString(R.string.latindoaharian21),getString(R.string.terjemahan21));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian22),R.drawable.carddoa,getString(R.string.isi_doa_harian22),getString(R.string.latindoaharian22),getString(R.string.terjemahan22));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian23),R.drawable.carddoa,getString(R.string.isi_doa_harian23),getString(R.string.latindoaharian23),getString(R.string.terjemahan23));
        listdoa.add(storedData);
        storedData = new StoredDataDoaHarian(getString(R.string.doaharian24),R.drawable.carddoa,getString(R.string.isi_doa_harian24),getString(R.string.latindoaharian24),getString(R.string.terjemahan24));
        listdoa.add(storedData);



        RecCardAdapterDoaHarian adapter = new RecCardAdapterDoaHarian(this, listdoa);
        recyclerview.setAdapter(adapter);

    }


}