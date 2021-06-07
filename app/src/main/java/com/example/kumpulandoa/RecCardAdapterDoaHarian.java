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

public class RecCardAdapterDoaHarian extends RecyclerView.Adapter<RecCardAdapterDoaHarian.CardHolder> {
    private Context context;
    private List<StoredDataDoaHarian> storedDataList;

    public RecCardAdapterDoaHarian(Context context, List<StoredDataDoaHarian> storedDataList) {
        this.context = context;
        this.storedDataList = storedDataList;
    }
    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.list_doaharian, parent, false);
        return new CardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecCardAdapterDoaHarian.CardHolder holder, final int position) {
        holder.gambar.setImageResource(storedDataList.get(position).getGambaritem());
        holder.juduldoa.setText(storedDataList.get(position).getJudulitem());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailDoaHarian.class);
                intent.putExtra("judul", storedDataList.get(holder.getAdapterPosition()).getJudulitem());
                intent.putExtra("doa", storedDataList.get(holder.getAdapterPosition()).getDoa());
                intent.putExtra("latin", storedDataList.get(holder.getAdapterPosition()).getLatin());
                intent.putExtra("terjemahan", storedDataList.get(holder.getAdapterPosition()).getTerjemahan());
                intent.putExtra("gambar", storedDataList.get(holder.getAdapterPosition()).getGambaritem());
                Toast.makeText(v.getContext()," "+
                        storedDataList.get(holder.getAdapterPosition()).getJudulitem(),Toast.LENGTH_SHORT).show();
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return storedDataList.size();
    }

    public class CardHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView juduldoa;
        CardView card;

        public CardHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar);
            juduldoa = itemView.findViewById(R.id.juduldoa);
            card = itemView.findViewById(R.id.card);
        }
    }
}
