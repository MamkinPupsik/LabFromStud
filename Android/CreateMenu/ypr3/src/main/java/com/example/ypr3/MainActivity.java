package com.example.ypr3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final int IDM_OPEN = 1001;
    private static final int IDM_SAVE = 1002;
    private static final int IDM_EDIT = 1003;
    private static final int IDM_HELP = 1004;
    private static final int IDM_EXIT = 1005;

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = this.getActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(Menu.NONE, IDM_OPEN, 1, "Open")
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(Menu.NONE, IDM_SAVE, 1, "Save")
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(Menu.NONE, IDM_EDIT, 1, "EDIT")
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(Menu.NONE, IDM_HELP, 1, "HELP")
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(Menu.NONE, IDM_EXIT, 1, "EXIT")
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return(super.onCreateOptionsMenu(menu));
    }
}