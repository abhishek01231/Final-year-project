package com.example.leafdetectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ActivitySpiderMite extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarlayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spider_mite);

        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.spider_mite,null));
        slideModels.add(new SlideModel(R.drawable.spider_mite1,null));
        slideModels.add(new SlideModel(R.drawable.spider_mite2,null));
        imageSlider.setImageList(slideModels,true);

        tabLayout = (TabLayout) findViewById(R.id.tab_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new SpiderMiteSymptomFragment(),"Symptoms");
        adapter.AddFragment(new SpiderMiteTreatFragment(),"Treat");
        adapter.AddFragment(new SpiderMitePreventionFragment(),"Prevention");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}