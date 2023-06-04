package com.example.leafdetectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.leafdetectionapp.PagerAdapter2;
import com.example.leafdetectionapp.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TipsActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TabLayout tabLayout=findViewById(R.id.tabBar);
        TabItem tabchats=findViewById(R.id.tabchats);
        TabItem tabcalls=findViewById(R.id.tabcalls);

        ViewPager viewPager=findViewById(R.id.viewpager);
        com.example.leafdetectionapp.PagerAdapter3 pagerAdapter=new com.example.leafdetectionapp.PagerAdapter3(getSupportFragmentManager(),tabLayout.getTabCount());
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