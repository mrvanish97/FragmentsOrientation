package com.uonagent.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*@SuppressLint("CommitTransaction")
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        MainFragment mainFragment = new MainFragment();
        fragmentTransaction.add(R.id.fragment_one, mainFragment);
        ButtonFragment buttonFragment = new ButtonFragment();
        fragmentTransaction.add(R.id.fragment_two, buttonFragment);*/
    }
}