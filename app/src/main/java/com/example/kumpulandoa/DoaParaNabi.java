package com.example.kumpulandoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DoaParaNabi extends AppCompatActivity {
    RecyclerView recyclerview;
    private Context context;
    private List<StoredDataDoaParaNabi> listdoa;
    StoredDataDoaParaNabi storedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_para_nabi);


        recyclerview=findViewById(R.id.recycle);
        recyclerview.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager
                (DoaParaNabi.this, 2);
        recyclerview.setLayoutManager(gridLayoutManager);
        listdoa = new ArrayList<>();


        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi1),R.drawable.carddoa,getString(R.string.isi_doa_paranabi1),getString(R.string.latindoaparanabi1),getString(R.string.terjemahanparanabi1));
        listdoa.add(storedData);
        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi2),R.drawable.carddoa,getString(R.string.isi_doa_paranabi2),getString(R.string.latindoaparanabi2),getString(R.string.terjemahanparanabi2));
        listdoa.add(storedData);
        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi3),R.drawable.carddoa,getString(R.string.isi_doa_paranabi3),getString(R.string.latindoaparanabi3),getString(R.string.terjemahanparanabi3));
        listdoa.add(storedData);
        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi4),R.drawable.carddoa,getString(R.string.isi_doa_paranabi4),getString(R.string.latindoaparanabi4),getString(R.string.terjemahanparanabi4));
        listdoa.add(storedData);
        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi5),R.drawable.carddoa,getString(R.string.isi_doa_paranabi5),getString(R.string.latindoaparanabi5),getString(R.string.terjemahanparanabi5));
        listdoa.add(storedData);
        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi6),R.drawable.carddoa,getString(R.string.isi_doa_paranabi6),getString(R.string.latindoaparanabi6),getString(R.string.terjemahanparanabi6));
        listdoa.add(storedData);
        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi7),R.drawable.carddoa,getString(R.string.isi_doa_paranabi7),getString(R.string.latindoaparanabi7),getString(R.string.terjemahanparanabi7));
        listdoa.add(storedData);
        storedData = new StoredDataDoaParaNabi(getString(R.string.doaparanabi8),R.drawable.carddoa,getString(R.string.isi_doa_paranabi8),getString(R.string.latindoaparanabi8),getString(R.string.terjemahanparanabi8));
        listdoa.add(storedData);





        RecCardAdapterDoaParaNabi adapter = new RecCardAdapterDoaParaNabi(this, listdoa);
        recyclerview.setAdapter(adapter);

    }


}