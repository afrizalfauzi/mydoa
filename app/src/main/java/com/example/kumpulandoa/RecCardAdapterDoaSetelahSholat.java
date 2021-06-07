package com.example.kumpulandoa;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecCardAdapterDoaSetelahSholat extends RecyclerView.Adapter<RecCardAdapterDoaSetelahSholat.CardHolder> {
    private Context context;
    private List<StoredDataDoaSetelahSholat> storedDataList;

    public RecCardAdapterDoaSetelahSholat(Context context, List<StoredDataDoaSetelahSholat> storedDataList) {
        this.context = context;
        this.storedDataList = storedDataList;
    }
    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.list_doasetelahsholat, parent, false);
        return new CardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecCardAdapterDoaSetelahSholat.CardHolder holder, final int position) {
        holder.juduldoa.setText(storedDataList.get(position).getJudulitem());
        holder.doaarab.setText(storedDataList.get(position).getDoa());
        holder.latin.setText(storedDataList.get(position).getLatin());
        holder.terjemahan.setText(storedDataList.get(position).getTerjemahan());
    }

    @Override
    public int getItemCount() {
        return storedDataList.size();
    }

    public class CardHolder extends RecyclerView.ViewHolder {
        TextView juduldoa, doaarab,latin, terjemahan;



        public CardHolder(@NonNull View itemView) {
            super(itemView);
            juduldoa = itemView.findViewById(R.id.detailjudulsetelahsholat);
            doaarab = itemView.findViewById(R.id.detaildoasetelahsholat);
            latin = itemView.findViewById(R.id.detaillatindoasetelahsholat);
            terjemahan = itemView.findViewById(R.id.detailterjemahansetelahsholat);
        }
    }
}