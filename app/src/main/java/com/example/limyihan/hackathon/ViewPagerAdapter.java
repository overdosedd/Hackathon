package com.example.limyihan.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.support.v4.view.ViewPager;

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};

    @Override
    public int getCount(){
        return images.length;
    }

    public boolean isViewFromObject(View view, Object object){
        return view== object;
    }

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

       ViewPager vp = (ViewPager) container;
       vp.addView(view, 0);
       return view;

    }

    public void destroy(ViewGroup container, int  position, Object object){
        ViewPager vp =  (ViewPager) container;
        View view  = (View) object;
        vp.removeView(view);
    }
}
