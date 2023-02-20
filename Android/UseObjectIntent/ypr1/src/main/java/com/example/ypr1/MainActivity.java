package com.example.ypr1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.text);
        text.append("onCreate()\n");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        text.append("onRestart()\n");
    }
    @Override
    public void onStart(){
        super.onStart();
        text.append("onStart()\n");
    }
    @Override
    public void onResume(){
        super.onResume();
        text.append("onResume()\n");
    }
    @Override
    public void onPause(){
        super.onPause();
        text.append("onPause()\n");
    }
    @Override
    public void onStop(){
        super.onStop();
        text.append("onStop()\n");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        text.append("onDestroy()\n");
    }

    public void onClick(View arg0){
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), SecondActivity.class);
        startActivity(intent);
    }
}