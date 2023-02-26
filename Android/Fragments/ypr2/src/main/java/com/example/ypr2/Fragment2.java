package com.example.ypr2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment implements View.OnClickListener {

    private TextView text;
    private EditText edit;
    private Button bGet;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment2, container, false);
        return v;
    }
    @Override
    public void onStart(){
        super.onStart();{
            text = (TextView) getActivity().findViewById(R.id.text);
            edit = (EditText) getActivity().findViewById(R.id.edit);
            bGet = (Button) getActivity().findViewById(R.id.bGetText);
            bGet.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        text.setText(edit.getText());
    }
}
