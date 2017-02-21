package org.mdsd2016.android.dummymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //this method inflates the layout
        //when doing menus, you have to do an inflator yourself

    }

     public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
     //   MenuInflater mMenuInflater = this.getMenuInflater();
     //   mMenuInflater.inflate(R.menu.menu_main, menu);
         return true;

    }

}


