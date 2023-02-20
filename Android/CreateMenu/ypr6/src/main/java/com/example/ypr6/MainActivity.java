package com.example.ypr6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int IDM_OPEN = 1001;
    private static final int IDM_SAVE = 1002;
    private static final int IDM_EDIT = 1003;
    private static final int IDM_HELP = 1004;
    private static final int IDM_EXIT = 1005;
    private static final int IDM_SUBNEW = 1006;
    private static final int IDM_SUBOPEN = 1007;
    private static final int IDM_SUBSAVE = 1008;
    private static final int IDM_SUBCUT = 1009;
    private static final int IDM_SUBCOPY = 1010;
    private static final int IDM_SUBPASTE = 1011;

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = this.getActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu){
        SubMenu subMenuFile = menu.addSubMenu("File");
        subMenuFile.add(Menu.NONE, IDM_SUBOPEN, Menu.NONE, "Open");
        subMenuFile.add(Menu.NONE, IDM_SUBNEW, Menu.NONE, "New");
        subMenuFile.add(Menu.NONE, IDM_SUBSAVE, Menu.NONE, "Save");

        SubMenu subMenuEdit = menu.addSubMenu("Edit");
        subMenuEdit.add(Menu.NONE, IDM_SUBCUT, Menu.NONE, "Cut");
        subMenuEdit.add(Menu.NONE, IDM_SUBCOPY, Menu.NONE, "Copy");
        subMenuEdit.add(Menu.NONE, IDM_SUBPASTE, Menu.NONE, "Paste");


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

    public boolean onOptionsItemSelected(MenuItem item){
        CharSequence message = "DEF";
        switch (item.getItemId()){
            case  IDM_SUBOPEN:
                message="sub open item selected";
                break;
            case  IDM_SUBNEW:
                message="sub new item selected";
                break;
            case  IDM_SUBSAVE:
                message="sub save item selected";
                break;
            case  IDM_SUBCUT:
                message="sub cut item selected";
                break;
            case  IDM_SUBCOPY:
                message="sub copy item selected";
                break;
            case  IDM_SUBPASTE:
                message="sub paste item selected";
                break;
            case  IDM_OPEN:
                message="Open item selected";
                break;
            case  IDM_SAVE:
                message="Save item selected";
                break;
            case  IDM_HELP:
                message="Help item selected";
                break;
            case  IDM_EDIT:
                message="Edit item selected";
                break;
            case  IDM_EXIT:
                message="Exit item selected";
                break;
            default:
                return false;
        }
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0, 0);
        toast.show();
        return true;
    }
}