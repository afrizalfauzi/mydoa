package com.example.kumpulandoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class DoaSetelahSholat extends AppCompatActivity {
    RecyclerView recyclerview;
    private Context context;
    private List<StoredDataDoaSetelahSholat> listdoa;
    StoredDataDoaSetelahSholat storedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_setelah_sholat);


        recyclerview=findViewById(R.id.recycle);
        recyclerview.setHasFixedSize(true);

        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(DoaSetelahSholat.this);
        recyclerview.setLayoutManager(gridLayoutManager);
        listdoa = new ArrayList<>();


        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat1),getString(R.string.isi_doa_doasetelahsholat1),getString(R.string.latindoasetelahsholat1),getString(R.string.terjemahandoasetelahsholat1));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat2),getString(R.string.isi_doa_doasetelahsholat2),getString(R.string.latindoasetelahsholat2),getString(R.string.terjemahandoasetelahsholat2));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat3),getString(R.string.isi_doa_doasetelahsholat3),getString(R.string.latindoasetelahsholat3),getString(R.string.terjemahandoasetelahsholat3));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat4),getString(R.string.isi_doa_doasetelahsholat4),getString(R.string.latindoasetelahsholat4),getString(R.string.terjemahandoasetelahsholat4));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat5),getString(R.string.isi_doa_doasetelahsholat5),getString(R.string.latindoasetelahsholat5),getString(R.string.terjemahandoasetelahsholat5));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat6),getString(R.string.isi_doa_doasetelahsholat6),getString(R.string.latindoasetelahsholat6),getString(R.string.terjemahandoasetelahsholat6));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat7),getString(R.string.isi_doa_doasetelahsholat7),getString(R.string.latindoasetelahsholat7),getString(R.string.terjemahandoasetelahsholat7));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat8),getString(R.string.isi_doa_doasetelahsholat8),getString(R.string.latindoasetelahsholat8),getString(R.string.terjemahandoasetelahsholat8));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat9),getString(R.string.isi_doa_doasetelahsholat9),getString(R.string.latindoasetelahsholat9),getString(R.string.terjemahandoasetelahsholat9));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat10),getString(R.string.isi_doa_doasetelahsholat10),getString(R.string.latindoasetelahsholat10),getString(R.string.terjemahandoasetelahsholat10));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat11),getString(R.string.isi_doa_doasetelahsholat11),getString(R.string.latindoasetelahsholat11),getString(R.string.terjemahandoasetelahsholat11));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat12),getString(R.string.isi_doa_doasetelahsholat12),getString(R.string.latindoasetelahsholat12),getString(R.string.terjemahandoasetelahsholat12));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat13),getString(R.string.isi_doa_doasetelahsholat13),getString(R.string.latindoasetelahsholat13),getString(R.string.terjemahandoasetelahsholat13));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat14),getString(R.string.isi_doa_doasetelahsholat14),getString(R.string.latindoasetelahsholat14),getString(R.string.terjemahandoasetelahsholat14));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat15),getString(R.string.isi_doa_doasetelahsholat15),getString(R.string.latindoasetelahsholat15),getString(R.string.terjemahandoasetelahsholat15));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat16),getString(R.string.isi_doa_doasetelahsholat16),getString(R.string.latindoasetelahsholat16),getString(R.string.terjemahandoasetelahsholat16));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat17),getString(R.string.isi_doa_doasetelahsholat17),getString(R.string.latindoasetelahsholat17),getString(R.string.terjemahandoasetelahsholat17));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat18),getString(R.string.isi_doa_doasetelahsholat18),getString(R.string.latindoasetelahsholat18),getString(R.string.terjemahandoasetelahsholat18));
        listdoa.add(storedData);
        storedData = new StoredDataDoaSetelahSholat(getString(R.string.doasetelahsholat19),getString(R.string.isi_doa_doasetelahsholat19),getString(R.string.latindoasetelahsholat19),getString(R.string.terjemahandoasetelahsholat19));
        listdoa.add(storedData);



        RecCardAdapterDoaSetelahSholat adapter = new RecCardAdapterDoaSetelahSholat(this, listdoa);
        recyclerview.setAdapter(adapter);

    }


}