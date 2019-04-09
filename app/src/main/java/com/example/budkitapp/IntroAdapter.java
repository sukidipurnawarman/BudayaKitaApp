package com.example.budkitapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class IntroAdapter extends FragmentPagerAdapter{
    public IntroAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new BS1();
            case 1:
                return new BS2();
            case 2:
                return new BS3();
            default:
                return null;

        }


    }
    @Override
    public int getCount() {
        return 3;
    }

}
