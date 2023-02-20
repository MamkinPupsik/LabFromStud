package com.example.ypr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editName;
    private EditText editPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Second Activity");
        setContentView(R.layout.activity_second);
        editName = (EditText) findViewById(R.id.editName);
        editPhone = (EditText) findViewById(R.id.editPhone);
        Bundle extras = getIntent().getExtras();
        editName.setText(extras.getString(MainActivity.NAME));
        editPhone.setText(extras.getString(MainActivity.PHONE));
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.bSave:
                Intent intent = new Intent();
                intent.putExtra(MainActivity.NAME, editName.getText().toString());
                intent.putExtra(MainActivity.PHONE, editPhone.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.bCancel:
                setResult(RESULT_CANCELED);
                finish();
                break;
        }
    }
}