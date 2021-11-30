package com.ingluise.TabLayout;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    final int totalTabs = 5;

    public MyAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                Log.i("Prueba", ""+position);
                return homeFragment;
            case 1:
                SportsFragment sportsFragment = new SportsFragment();
                return sportsFragment;
            case 2:
                MoviesFragment moviesFragment = new MoviesFragment();
                return moviesFragment;
            case 3:
                CarsFragment carsFragment = new CarsFragment();
                return carsFragment;
            case 4:
                SightseeingFragment sightseeingFragment = new SightseeingFragment();
                return sightseeingFragment;
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return totalTabs;
    }
}