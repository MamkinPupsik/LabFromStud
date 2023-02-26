package com.example.ypr4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    Fragment1 dialogFragment;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    public void showDialog(){
        dialogFragment = new Fragment1("Вы уверены, что хотите выйти?");
        //используем getSupportFragmentManager - потому что DialogFragment
        //взят из библиотеки поддержки!
        dialogFragment.show(getSupportFragmentManager(), "dialogFragment");
    }
    public void doPositiveClick(){
        this.finish();
    }
    public void doNegativeCLick(){}
}