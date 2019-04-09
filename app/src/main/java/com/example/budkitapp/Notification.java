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
public class Notification extends Fragment {
    RecyclerView recyclerView;
    NotifAdapter adapter;
    List<Notif> NotifList;

    public Notification() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        NotifList = new ArrayList<>();

        recyclerView =(RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        NotifList.add(new Notif(
                1,
                "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                "13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk 13.3 inch, Silver, 1.35 kg akwkwa kawkawkawk kawkawkwak kawkawkwa awkkaw awkwakaw kawkawkawk",
                R.drawable.macbook));

        NotifList.add(
                new Notif(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        R.drawable.dellinspiron));

        NotifList.add(
                new Notif(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        NotifList.add(
                new Notif(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        NotifList.add(
                new Notif(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        NotifList.add(
                new Notif(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        NotifList.add(
                new Notif(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));
        NotifList.add(
                new Notif(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        R.drawable.surface));

        adapter = new NotifAdapter(getContext(),NotifList);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
