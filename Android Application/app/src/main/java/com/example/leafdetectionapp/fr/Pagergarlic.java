
package com.example.leafdetectionapp.fr;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leafdetectionapp.Garlicabout;
import com.example.leafdetectionapp.Garlicadvise;


public class Pagergarlic extends FragmentPagerAdapter {
    private int numoftabs;
    public Pagergarlic(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {
            case 0: return new Garlicabout();
            case 1: return new Garlicadvise();


            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
