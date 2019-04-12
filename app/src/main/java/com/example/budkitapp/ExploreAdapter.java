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

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>{
    private Context mCtx;
    private List ExploreList;

    public ExploreAdapter(Context mCtx, List ExploreList) {
        this.mCtx = mCtx;
        this.ExploreList = ExploreList;
    }

    @NonNull
    @Override
    public ExploreAdapter.ExploreViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_explore,null);
        ExploreAdapter.ExploreViewHolder holder = new ExploreAdapter.ExploreViewHolder(view);
        return holder;

    }


    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull ExploreAdapter.ExploreViewHolder ExploreViewHolder, int position) {
        ExploreNews exploreNews = (com.example.budkitapp.ExploreNews) ExploreList.get(position);


        ExploreViewHolder.textViewTitle.setText(exploreNews.getjudul());
        ExploreViewHolder.textViewDesc.setText(exploreNews.getdeskripsi());
        ExploreViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(exploreNews.getgambar()));
    }

    @Override
    public int getItemCount() {
        return ExploreList.size();
    }

    class ExploreViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDesc;

        public ExploreViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.gambar_explore);
            textViewTitle = itemView.findViewById(R.id.judul_explore);
            textViewDesc = itemView.findViewById(R.id.deskripsi_explore);
        }
    }
}
