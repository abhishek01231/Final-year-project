
package com.example.leafdetectionapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;





public class PagerAdapter5 extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter5(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {
            case 0: return new com.example.leafdetectionapp.Potatoabout();
            case 1: return new com.example.leafdetectionapp.Potatoadvise();

            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
