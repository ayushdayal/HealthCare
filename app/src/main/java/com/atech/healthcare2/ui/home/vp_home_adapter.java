package com.atech.healthcare2.ui.home;


import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.atech.healthcare2.ui.home.pages.page_faq.Page_faq;
import com.atech.healthcare2.ui.home.pages.page_home.Page_home;
import com.atech.healthcare2.ui.home.pages.Page_stats;

class vp_home_adapter extends FragmentPagerAdapter {

    public vp_home_adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Page_stats();
            case 1:
                return new Page_home();
            default:
                return new Page_faq();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
