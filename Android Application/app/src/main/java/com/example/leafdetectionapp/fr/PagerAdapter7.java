
package com.example.leafdetectionapp.fr;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leafdetectionapp.Chilliabout;
import com.example.leafdetectionapp.Chilliadvise;


public class PagerAdapter7 extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter7(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {
            case 0: return new Chilliabout();
            case 1: return new Chilliadvise();

            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
