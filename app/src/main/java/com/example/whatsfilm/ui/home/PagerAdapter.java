package com.example.whatsfilm.ui.home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager manager){
        super(manager);
    }
    private String [] titles_tab = {"Runing", "Upcoming", "Previous"};
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new RunningFragment();
            case 1:
                return new RunningFragment();
            case 2:
                return new RunningFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return titles_tab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return titles_tab[position];
    }
}
