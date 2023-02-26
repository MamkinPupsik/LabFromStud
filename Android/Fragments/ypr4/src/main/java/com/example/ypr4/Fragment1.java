package com.example.ypr4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Fragment1 extends DialogFragment {


    public Fragment1(String title){
        Bundle args = new Bundle();
        args.putString("title", title);
        setArguments(args);
    }

    public Dialog onCreateDialog(Bundle saveInstanceState){
        String title = getArguments().getString("title");
        return new AlertDialog.Builder(getActivity())
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(title)
                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int whichButton){
                        ((MainActivity)getActivity()).doPositiveClick();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int whichButton){
                        ((MainActivity)getActivity()).doNegativeCLick();
                    }
                }).create();
    }

  //  public void show() {
  //      Fragment1 dialogFragment;
    //    FragmentManager fragmentManager;
    //    dialogFragment = new Fragment1("Вы уверены, что хотите выйти?");
   //     dialogFragment.show(getFragmentManager(), "fragmentManager");
    //}
}
