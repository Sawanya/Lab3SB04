package com.example.user.mylab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by praew on 2/18/2018.
 */

public class MyFragmentAdapter extends FragmentStatePagerAdapter {
    public MyFragmentAdapter(FragmentManager fm) {   //Constructor
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;    //จำนวนแท็บ
    }

    @Override
    public Fragment getItem(int position) {   //สร้างออบเจ็กต์ของ Fragment ในลำดับแท็บที่กำหนด
        switch(position) {
            case 0: return new Fragment1();
            case 1: return new Fragment2();
            case 2: return new Fragment3();
            default: return new Fragment1();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String[] tabs = {"Hello", "My profile", "My App"};   //รายชื่อแท็บ
        return tabs[position];   //ส่งชื่อแท็บในลำดับที่กำหนดกลับไป
    }
}

