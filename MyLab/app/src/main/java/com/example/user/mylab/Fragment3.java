package com.example.user.mylab;

/**
 * Created by praew on 2/18/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment3 extends Fragment {

    int aNumber = (int) (20 * Math.random()) + 1;

    private int mCounter = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment3, container, false);

        final TextView textSw = (TextView)view.findViewById(R.id.showText);
        Button clearButton = view.findViewById(R.id.button_clr);
        Button randomButton = view.findViewById(R.id.button_random);


        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                textSw.setText(mCounter+"");
            }
        });
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Random rnd = new Random();
                textSw.setText(aNumber+"");
            }
        });




        return view;
    }
}