package org.mdsd2016.android.dummymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_MAIN_ACTIVITY = "In-MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //this method inflates the layout
        //when doing menus, you have to do an inflator yourself

        final ImageView imageViewIcon = (ImageView) findViewById(R.id.image_view_icon_mainactivity);
        registerForContextMenu(imageViewIcon);

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
}



