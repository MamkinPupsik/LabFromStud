package com.example.ypr7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int IDM_OPEN = 101;
    public static final int IDM_SAVE = 102;
    public static final int IDM_EDIT = 103;
    public static final int IDM_HELP = 104;
    public static final int IDM_EXIT = 105;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout edit = (LinearLayout)findViewById(R.id.root);
        registerForContextMenu(edit);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(Menu.NONE, IDM_OPEN, Menu.NONE, "Open");
        menu.add(Menu.NONE, IDM_SAVE, Menu.NONE, "Save");
        menu.add(Menu.NONE, IDM_EDIT, Menu.NONE, "Edit");
        menu.add(Menu.NONE, IDM_HELP, Menu.NONE, "Help");
        menu.add(Menu.NONE, IDM_EXIT, Menu.NONE, "Exit");
    }

    public boolean onContextItemSelected(MenuItem item){
        CharSequence message;
        switch (item.getItemId()){
            case IDM_OPEN:
                message = "Open item selected";
                break;
            case IDM_SAVE:
                message = "Save item selected";
                break;
            case IDM_HELP:
                message = "Help item selected";
                break;
            case IDM_EDIT:
                message = "Edit item selected";
                break;
            case IDM_EXIT:
                message = "Exit item selected";
                break;
            default:
                return super.onContextItemSelected(item);
        }
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
        return true;
    }
}
