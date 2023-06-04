package com.example.leafdetectionapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.leafdetectionapp.R;
import com.example.leafdetectionapp.fr.PagerAdapter11;
import com.example.leafdetectionapp.fr.PagerAdapter12;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TipsActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TabLayout tabLayout=findViewById(R.id.tabBar);
        TabItem tabchats=findViewById(R.id.tabchats);
        TabItem tabcalls=findViewById(R.id.tabcalls);

        ViewPager viewPager=findViewById(R.id.viewpager);


        PagerAdapter12 pagerAdapter=new PagerAdapter12(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position ) {
                        tabLayout.getTabAt(position).select();
                    }
                });

    }
}