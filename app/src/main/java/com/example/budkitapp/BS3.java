package com.example.budkitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BS3 extends Fragment {

    TextView done;
    TextView back;
    ViewPager viewPager;
    public BS3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bs3, container, false);

        viewPager = getActivity().findViewById(R.id.viewPager);
        done = view.findViewById(R.id.done);
       done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanjut = new Intent(getActivity(), Agreement.class);
                startActivity(lanjut);
                getActivity().finish();
            }
        });
        back = view.findViewById(R.id.back3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);

            }
        });
        return view;
    }
}
