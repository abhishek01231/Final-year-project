
package com.example.leafdetectionapp.fr;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leafdetectionapp.Chilliabout;
import com.example.leafdetectionapp.Chilliadvise;


public class PagerAdapter10 extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter10(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {
            case 0: return new Apple_About();
            case 1: return new Apple_Advise();


            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
