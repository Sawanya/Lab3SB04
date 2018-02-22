package com.example.user.mylab;

/**
 * Created by praew on 2/18/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment2 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //นำ XML Layout ที่จะใช้คู่กัน  มาใช้เป็นโครงร่างของ Fragment นี้
        View view = inflater.inflate(R.layout.fragment2, container, false);
        return view;
    }

}
