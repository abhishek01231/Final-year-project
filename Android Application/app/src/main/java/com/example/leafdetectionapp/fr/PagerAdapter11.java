
package com.example.leafdetectionapp.fr;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagerAdapter11 extends FragmentPagerAdapter {
    private int numoftabs;
    public PagerAdapter11(FragmentManager fm, int numofTabs){

        super(fm);

        this.numoftabs=numofTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch ((position))
        {
            case 0: return new Backberry_about();
            case 1: return new Blackberry_advise();


            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
