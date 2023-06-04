package com.example.leafdetectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.leafdetectionapp.PowderyMildewPreventionFragment;
import com.example.leafdetectionapp.PowderyMildewSymptomFragment;
import com.example.leafdetectionapp.PowderyMildewTreatFragment;
import com.example.leafdetectionapp.R;
import com.example.leafdetectionapp.ViewPagerAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ActivityGrayLeafSpot extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarlayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gray_leaf_spot);

        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.gray_leaf_spot,null));
        slideModels.add(new SlideModel(R.drawable.gray_leaf_spot1,null));
        slideModels.add(new SlideModel(R.drawable.gray_leaf_spot2,null));
        imageSlider.setImageList(slideModels,true);

        tabLayout = (TabLayout) findViewById(R.id.tab_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new GrayLeafSpotSymptomFragment(),"Symptoms");
        adapter.AddFragment(new GrayLeafSpotTreatFragment(),"Treat");
        adapter.AddFragment(new GrayLeafSpotPreventionFragment(),"Prevention");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}