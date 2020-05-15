package com.atech.healthcare2.ui.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.atech.healthcare2.R;


public class HomeFragment extends Fragment {

    private static final String TAG = "as";
    private BottomNavigationView bb_home;
    private ViewPager vp_home;
    private MenuItem prevMenuItem;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        //        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        vp_home = view.findViewById(R.id.vp_home);
        bb_home = view.findViewById(R.id.bb_home);
        Log.d(TAG, "onViewCreated: setting adapter");
        vp_home.setAdapter(new vp_home_adapter(getChildFragmentManager()));
        Log.d(TAG, "onViewCreated: seted adapter");
        bb_home.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_stats:
                        vp_home.setCurrentItem(0);
                        break;
                    case R.id.item_home:
                        vp_home.setCurrentItem(1);
                        break;
                    case R.id.item_faq:
                        vp_home.setCurrentItem(2);
                        break;
                }
                return false;
            }
        });
        vp_home.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null)
                    prevMenuItem.setChecked(false);
                else
                    bb_home.getMenu().getItem(0).setChecked(false);
                bb_home.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bb_home.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

    }
}
