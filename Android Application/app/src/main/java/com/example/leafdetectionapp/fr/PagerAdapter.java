package com.example.leafdetectionapp;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leafdetectionapp.Call;
import com.example.leafdetectionapp.Chatfragment;

public class PagerAdapter extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter(FragmentManager fm, int numofTabs){
        super(fm);
        this.numoftabs=numofTabs;
    }

    @Override
    public Fragment getItem(int position) {
       switch ((position))
       {
           case 0: return new Chatfragment();
           case 1: return new Call();

           default:return null;
       }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
