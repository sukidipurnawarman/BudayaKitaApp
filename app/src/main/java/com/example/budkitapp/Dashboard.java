package com.example.budkitapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard extends Fragment {
    RecyclerView recyclerView;
    eventNewsAdapter adapter;
    List<eventNews> eventNewsList;

    public Dashboard() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        eventNewsList = new ArrayList<>();

        recyclerView =(RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        eventNewsList.add(new eventNews(
                1,
                "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                "13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk",
                R.drawable.macbook));

        eventNewsList.add(
                new eventNews(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        R.drawable.dellinspiron));

        eventNewsList.add(
                new eventNews(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        eventNewsList.add(
                new eventNews(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        eventNewsList.add(
                new eventNews(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        eventNewsList.add(
                new eventNews(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        eventNewsList.add(
                new eventNews(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        eventNewsList.add(
                new eventNews(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));

        adapter = new eventNewsAdapter(getContext(),eventNewsList);
        recyclerView.setAdapter(adapter);
        return view;

    }

}
