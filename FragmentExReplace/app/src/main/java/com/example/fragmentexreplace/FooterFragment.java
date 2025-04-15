package com.example.fragmentexreplace;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FooterFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // code here
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_footer, container, false);
// tìm điều khiển
        Button B1 = v.findViewById(R.id.button1);
        Button B2 = v.findViewById(R.id.button2);
        Button B3 = v.findViewById(R.id.button3);

        FragmentManager fragmentManager = getParentFragmentManager();

        // sự kện
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new Fragment1())
                        .commit();

            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// code
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new Fragment2())
                        .commit();
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // code
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new Fragment3())
                        .commit();
            }
        });
        return v;
    }
}