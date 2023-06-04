
package com.example.leafdetectionapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leafdetectionapp.Call;
import com.example.leafdetectionapp.Chatfragment;
import com.example.leafdetectionapp.fr.Bajradvise;


public class PagerAdapter2 extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter2(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {
            case 0: return new com.example.leafdetectionapp.Bajrabout();
            case 1: return new Bajradvise();

            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
