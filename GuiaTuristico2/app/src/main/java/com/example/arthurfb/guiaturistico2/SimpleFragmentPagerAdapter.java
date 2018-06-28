package com.example.arthurfb.guiaturistico2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CuriosidadesFragment();
        } else if (position == 1) {
            return new OrlasFragment();
        } else if (position == 2) {
            return new ClubesFragment();
        } else {
            return new RestaurantesFragment();
        }
    }

    @Override
    public int getCount() {
        int tabAmount = 4;
        return tabAmount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getResources().getString(R.string.curiosidades_tab);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.orlas_tab);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.clubes_tab);
        } else {
            return mContext.getResources().getString(R.string.restaurante_tab);
        }

    }
}