package com.example.ypr3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
    }

    public void onClick(View view){
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()){
            case R.id.button1:
                Fragment1 fragment1 = new Fragment1();
                fragmentTransaction.add(R.id.fragmentLayout, fragment1);
                break;
            case R.id.button2:
                Fragment2 fragment2 = new Fragment2();
                fragmentTransaction.add(R.id.fragmentLayout, fragment2);
                break;
        }
        fragmentTransaction.commit();
    }

}