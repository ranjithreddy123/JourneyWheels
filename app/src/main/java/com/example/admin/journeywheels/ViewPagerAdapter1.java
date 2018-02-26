package com.example.admin.journeywheels;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.admin.journeywheels.R;

public class  ViewPagerAdapter1 extends PagerAdapter {

        private Context context1;
        private LayoutInflater layoutInflater1;
        private Integer [] images1 = {R.drawable.activa1,R.drawable.activa,R.drawable.activa2,R.drawable.activa3};

        public ViewPagerAdapter1(Context context) {
            this.context1 = context;
        }

        @Override
        public int getCount() {
            return images1.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, final int position) {

            layoutInflater1 = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View vie = layoutInflater1.inflate(R.layout.custom_layout, null);
            ImageView imageView1 = (ImageView) vie.findViewById(R.id.imageView);
            imageView1.setImageResource(images1[position]);

            ViewPager vpa = (ViewPager) container;
            vpa.addView(vie, 0);
            return vie;

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {

            ViewPager vp1 = (ViewPager) container;
            View view1 = (View) object;
            vp1.removeView(view1);

        }

    }
