package com.example.admin.journeywheels;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter2 extends PagerAdapter {

    private Context context2;
    private LayoutInflater layoutInflater2;
    private Integer [] images2 = {R.drawable.bike3,R.drawable.yamaha,R.drawable.yamaha1,R.drawable.yamaha2};

    public ViewPagerAdapter2(Context context) {
        this.context2 = context;
    }

    @Override
    public int getCount() {
        return images2.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater2 = (LayoutInflater) context2.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vie1 = layoutInflater2.inflate(R.layout.custom_layout, null);
        ImageView imageView1 = (ImageView) vie1.findViewById(R.id.imageView);
        imageView1.setImageResource(images2[position]);
        ViewPager vpa1 = (ViewPager) container;
        vpa1.addView(vie1, 0);
        return vie1;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp2 = (ViewPager) container;
        View view2 = (View) object;
        vp2.removeView(view2);

    }


}