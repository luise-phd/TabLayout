package com.ingluise.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private MyAdapter adapter;
    private TabLayout tl;
    private ViewPager2 vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl = findViewById(R.id.tabLayout);
        vp = findViewById(R.id.viewPager2);

        adapter = new MyAdapter(getSupportFragmentManager(), getLifecycle());
        vp.setAdapter(adapter);
        vp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tl.selectTab(tl.getTabAt(position));
            }
        });

        tl.setTabMode(TabLayout.MODE_SCROLLABLE);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
                    vp.setCurrentItem(tab.getPosition());
                }
                else if (tab.getPosition() == 1) {
                    Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                    vp.setCurrentItem(tab.getPosition());
                }
                else if (tab.getPosition() == 2) {
                    vp.setCurrentItem(tab.getPosition());
                }
                else if (tab.getPosition() == 3) {
                    vp.setCurrentItem(tab.getPosition());
                }
                else {
                    vp.setCurrentItem(tab.getPosition());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}