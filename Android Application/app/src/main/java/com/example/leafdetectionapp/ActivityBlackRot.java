
package com.example.leafdetectionapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ActivityBlackRot extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarlayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_rot);

        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.black_rot,null));
        slideModels.add(new SlideModel(R.drawable.black_rot2,null));
        slideModels.add(new SlideModel(R.drawable.black_rot3,null));
        imageSlider.setImageList(slideModels,true);

        tabLayout = (TabLayout) findViewById(R.id.tab_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new BlackRotSymptomFragment(),"Symptoms");
        adapter.AddFragment(new BlackRotTreatFragment(),"Treat");
        adapter.AddFragment(new BlackRotPreventionFragment(),"Prevention");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
