package com.example.limyihan.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewpageAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewpageAdapter);

    }
}
