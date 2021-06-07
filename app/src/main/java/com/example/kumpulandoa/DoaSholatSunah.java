package com.example.kumpulandoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DoaSholatSunah extends AppCompatActivity {
    RecyclerView recyclerview;
    private Context context;
    private List<StoredDataDoaSholatSunah> listdoa;
    StoredDataDoaSholatSunah storedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_sholat_sunah);


        recyclerview=findViewById(R.id.recycle);
        recyclerview.setHasFixedSize(true);

        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(DoaSholatSunah.this);
        recyclerview.setLayoutManager(gridLayoutManager);
        listdoa = new ArrayList<>();


        storedData = new StoredDataDoaSholatSunah(getString(R.string.perawi1),getString(R.string.sanat1),getString(R.string.arab1),getString(R.string.arti1));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSholatSunah(getString(R.string.perawi2),getString(R.string.sanat2),getString(R.string.arab2),getString(R.string.arti2));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSholatSunah(getString(R.string.perawi3),getString(R.string.sanat3),getString(R.string.arab3),getString(R.string.arti3));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSholatSunah(getString(R.string.perawi4),getString(R.string.sanat4),getString(R.string.arab4),getString(R.string.arti4));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSholatSunah(getString(R.string.perawi5),getString(R.string.sanat5),getString(R.string.arab5),getString(R.string.arti5));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSholatSunah(getString(R.string.perawi6),getString(R.string.sanat6),getString(R.string.arab6),getString(R.string.arti6));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSholatSunah(getString(R.string.perawi7),getString(R.string.sanat7),getString(R.string.arab7),getString(R.string.arti7));
        listdoa.add(storedData);



        RecCardAdapterDoaSholatSunah adapter = new RecCardAdapterDoaSholatSunah(this, listdoa);
        recyclerview.setAdapter(adapter);

    }


}