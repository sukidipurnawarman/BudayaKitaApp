package com.example.budkitapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import java.util.List;

public class NotifAdapter extends RecyclerView.Adapter<NotifAdapter.NotifViewHolder> {
    private Context mCtx;
    private List NotifList;

    public NotifAdapter(Context mCtx, List NotifList) {
        this.mCtx = mCtx;
        this.NotifList = NotifList;
    }

    @NonNull
    @Override
    public NotifAdapter.NotifViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_notification,null);
        NotifAdapter.NotifViewHolder holder = new NotifAdapter.NotifViewHolder(view);
        return holder;

    }


    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull NotifAdapter.NotifViewHolder NotifViewHolder, int position) {
        Notif notif = (com.example.budkitapp.Notif) NotifList.get(position);


        NotifViewHolder.textViewTitle.setText(Notif.getjudul());
        NotifViewHolder.textViewDesc.setText(Notif.getdeskripsi());
        NotifViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(Notif.getgambar()));
    }

    @Override
    public int getItemCount() {
        return NotifList.size();
    }

    class NotifViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDesc;

        public NotifViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.igambar_notif);
            textViewTitle = itemView.findViewById(R.id.judul_notif);
            textViewDesc = itemView.findViewById(R.id.deskripsi_notif);
        }
    }
}
