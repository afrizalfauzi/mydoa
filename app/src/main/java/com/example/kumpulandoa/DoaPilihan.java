package com.example.kumpulandoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DoaPilihan extends AppCompatActivity {
    RecyclerView recyclerview;
    private Context context;
    private List<StoredDataDoaPilihan> listdoa;
    StoredDataDoaPilihan storedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_pilihan);


        recyclerview=findViewById(R.id.recycle);
        recyclerview.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager
                (DoaPilihan.this, 2);
        recyclerview.setLayoutManager(gridLayoutManager);
        listdoa = new ArrayList<>();


        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan1),R.drawable.carddoa,getString(R.string.isi_doa_pilihan1),getString(R.string.latindoapilihan1),getString(R.string.terjemahanpilihan1));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan2),R.drawable.carddoa,getString(R.string.isi_doa_pilihan2),getString(R.string.latindoapilihan2),getString(R.string.terjemahanpilihan2));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan3),R.drawable.carddoa,getString(R.string.isi_doa_pilihan3),getString(R.string.latindoapilihan3),getString(R.string.terjemahanpilihan3));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan4),R.drawable.carddoa,getString(R.string.isi_doa_pilihan4),getString(R.string.latindoapilihan4),getString(R.string.terjemahanpilihan4));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan5),R.drawable.carddoa,getString(R.string.isi_doa_pilihan5),getString(R.string.latindoapilihan5),getString(R.string.terjemahanpilihan5));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan6),R.drawable.carddoa,getString(R.string.isi_doa_pilihan6),getString(R.string.latindoapilihan6),getString(R.string.terjemahanpilihan6));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan7),R.drawable.carddoa,getString(R.string.isi_doa_pilihan7),getString(R.string.latindoapilihan7),getString(R.string.terjemahanpilihan7));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan8),R.drawable.carddoa,getString(R.string.isi_doa_pilihan8),getString(R.string.latindoapilihan8),getString(R.string.terjemahanpilihan8));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan9),R.drawable.carddoa,getString(R.string.isi_doa_pilihan9),getString(R.string.latindoapilihan9),getString(R.string.terjemahanpilihan9));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan10),R.drawable.carddoa,getString(R.string.isi_doa_pilihan10),getString(R.string.latindoapilihan10),getString(R.string.terjemahanpilihan10));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan11),R.drawable.carddoa,getString(R.string.isi_doa_pilihan11),getString(R.string.latindoapilihan11),getString(R.string.terjemahanpilihan11));
        listdoa.add(storedData);
        storedData = new StoredDataDoaPilihan(getString(R.string.doapilihan12),R.drawable.carddoa,getString(R.string.isi_doa_pilihan12),getString(R.string.latindoapilihan12),getString(R.string.terjemahanpilihan12));
        listdoa.add(storedData);






        RecCardAdapterDoaPilihan adapter = new RecCardAdapterDoaPilihan(this, listdoa);
        recyclerview.setAdapter(adapter);

    }


}