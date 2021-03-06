package com.example.tourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FamousFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new ReligiousFragment();
        } else {
            return new DamFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_Famous);
        } else if (position == 1) {
            return mContext.getString(R.string.category_Food);
        } else if (position == 2) {
            return mContext.getString(R.string.category_Religion);
        } else {
            return mContext.getString(R.string.category_Dam);
        }
    }
}
