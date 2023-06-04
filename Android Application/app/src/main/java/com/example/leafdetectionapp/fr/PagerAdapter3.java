package com.example.leafdetectionapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leafdetectionapp.Soyabeenabout;



public class PagerAdapter3 extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter3(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {

            case 0: return new Soyabeenabout();
            case 1: return  new com.example.leafdetectionapp.Soyabeenadvise();

            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}

