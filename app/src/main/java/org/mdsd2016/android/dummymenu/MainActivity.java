package org.mdsd2016.android.dummymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements ActionMode.Callback, View.OnLongClickListener{
//three menus in app so far
    //regular options menu that can be shown with the menu button in all devices
    //second one includes the contextual action menu(floating in the  middle)
    //third one - is the contextual action bar

    //all three use the same layout
    //options menu shouldn't be the same as the contextual action menu

    private static final String TAG_MAIN_ACTIVITY = "In-MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //this method inflates the layout
        //when doing menus, you have to do an inflator yourself

        final ImageView imageViewIconBottom = (ImageView) findViewById(R.id.image_view_icon_bottomimageView2);
        imageViewIconBottom.setOnLongClickListener(this);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //   MenuInflater mMenuInflater = this.getMenuInflater();
        //   mMenuInflater.inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item1:
                Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Add option clicked");

                break;

            case R.id.item2:
                Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Like option clicked");

                break;

            case R.id.item3:
                Log.i(MainActivity.TAG_MAIN_ACTIVITY, "Dislike option clicked");

                break;

            default:

        }

        return  super.onOptionsItemSelected(item);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);
    }

     //reacts to the event of clicking on the action -- use the same menu as above.


    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.item1:
                Log.d(MainActivity.TAG_MAIN_ACTIVITY, "Add context option clicked");

                break;

            case R.id.item2:
                Log.d(MainActivity.TAG_MAIN_ACTIVITY, "Like context option clicked");

                break;

            case R.id.item3:
                Log.d(MainActivity.TAG_MAIN_ACTIVITY, "Dislike context option clicked");

                break;

            default:

        }

        return super.onContextItemSelected(item);

     }

    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu); // inflating menu
        return true;

        //we haven't defined which item has to be long clicked
    }

    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode mode) {

    }

    @Override
    public boolean onLongClick(View whichView) {

        if(whichView.getId() == R.id.image_view_icon_bottomimageView2){
            startSupportActionMode(this);
            return true;

        }
        return false;

    }
}

//two things happened
//floating action mode was onCreate
//actionmode bar - on top of app, need to define things manually, that's why we have two interfaces
//actionmode allows to implement callbacks.
//when we implemented the actionMode - we had option to implement from support library and from a non-support library
//difference between libraries is the support based on versions



