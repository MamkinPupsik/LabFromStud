package com.example.ypr6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intentCam = new Intent();
    Intent intentMedia = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartCam(View view) {
        intentCam.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intentCam);
    }

    public void onStarMedia(View view){
        intentMedia.setAction(MediaStore.INTENT_ACTION_MEDIA_SEARCH);
        startActivity(intentMedia);
    }
}