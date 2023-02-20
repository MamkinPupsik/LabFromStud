package com.example.ypr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textName;
    private TextView textPhone;

    public final static String NAME = "Name";
    public final static String PHONE = "Phone";
    private final static int ACTION_EDIT = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = (TextView) findViewById(R.id.textName);
        textPhone = (TextView) findViewById(R.id.textPhone);
        textName.setText("Andrew Ivanov");
        textPhone.setText("123456789");
    }

    public void onClick(View arg0){
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra(NAME, textName.getText());
        intent.putExtra(PHONE, textPhone.getText());
        startActivityForResult(intent, ACTION_EDIT);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            textName.setText(extras.getString(NAME));
            textPhone.setText(extras.getString(PHONE));
            super.onActivityResult(requestCode, resultCode, data);
        }
        else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

}