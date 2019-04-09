package com.example.budkitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BS1 extends Fragment {

    TextView next;
    TextView skip;
    ViewPager viewPager;

    public BS1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bs1, container, false);

        viewPager = getActivity().findViewById(R.id.viewPager);
        next = view.findViewById(R.id.next1);
        skip = view.findViewById(R.id.skip);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mulaiActivity();
            }
        });
        return view;
    }
    public void mulaiActivity(){
        Intent lanjut = new Intent(getActivity(), Agreement.class);
        startActivity(lanjut);
        getActivity().finish();
    }


}
