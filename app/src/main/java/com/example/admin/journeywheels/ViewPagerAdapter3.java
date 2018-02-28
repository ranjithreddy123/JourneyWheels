package com.example.admin.journeywheels;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter3 extends PagerAdapter {

    private Context context3;
    private LayoutInflater layoutInflater3;
    private Integer [] images3 = {R.drawable.fz,R.drawable.fz1,R.drawable.fz2,R.drawable.fz4};

    public ViewPagerAdapter3(Context context) {
        this.context3 = context;
    }

    @Override
    public int getCount() {
        return images3.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater3 = (LayoutInflater) context3.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vie3 = layoutInflater3.inflate(R.layout.custom_layout, null);
        ImageView imageView1 = (ImageView) vie3.findViewById(R.id.imageView);
        imageView1.setImageResource(images3[position]);

        ViewPager vpa3 = (ViewPager) container;
        vpa3.addView(vie3, 0);
        return vie3;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp3 = (ViewPager) container;
        View view3 = (View) object;
        vp3.removeView(view3);

    }

}