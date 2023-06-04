
package com.example.leafdetectionapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.leafdetectionapp.Garlicabout;
import com.example.leafdetectionapp.Garlicadvise;
import com.example.leafdetectionapp.fr.Gingerabout;
import com.example.leafdetectionapp.fr.Gingeradvise;


public class PagerAdapter6 extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter6(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {
            case 0: return new Gingerabout();
            case 1: return new Gingeradvise();

            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
