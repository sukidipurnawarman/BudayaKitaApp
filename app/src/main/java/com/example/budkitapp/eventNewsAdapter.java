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

/*
*RecyclerView.Adapter
*RecyclerView.ViewHolder
**/
public class eventNewsAdapter extends RecyclerView.Adapter<eventNewsAdapter.eventNewsViewHolder>{

    private Context mCtx;
    private List newsEventList;

    public eventNewsAdapter(Context mCtx, List newsEventList) {
        this.mCtx = mCtx;
        this.newsEventList = newsEventList;
    }

    @NonNull
    @Override
    public eventNewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout,null);
        eventNewsViewHolder holder = new eventNewsViewHolder(view);
        return holder;

    }

    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull eventNewsViewHolder eventNewsViewHolder, int position) {
        eventNews eventNews = (com.example.budkitapp.eventNews) newsEventList.get(position);


        eventNewsViewHolder.textViewTitle.setText(eventNews.getTitle());
        eventNewsViewHolder.textViewDesc.setText(eventNews.getShortdesc());
        eventNewsViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(eventNews.getImage()));
    }

    @Override
    public int getItemCount() {
        return newsEventList.size();
    }

    class eventNewsViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;

        public eventNewsViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.gambar_explore);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
        }
    }
}
