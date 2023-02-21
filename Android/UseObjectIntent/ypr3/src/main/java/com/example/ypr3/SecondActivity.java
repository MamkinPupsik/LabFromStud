package com.example.ypr3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bitmap bitmap = (Bitmap)getIntent().getParcelableExtra("Bitmap");
        ImageView image = (ImageView)findViewById(R.id.image);
        image.setImageBitmap(bitmap);
    }
}