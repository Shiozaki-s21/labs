package com.example.subarushiozaki.demonavigate;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.draw_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawer,
                toolbar,
                R.string.Open,
                R.string.Close
        );

        if(drawer != null) {
            drawer.addDrawerListener(toggle);
        }
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.draw_layout);
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.menu_import:
                drawer.closeDrawer(GravityCompat.START);
                displayToast(getString(R.string.menu_import_name));
                return true;
            case R.id.menu_Gallery:
                drawer.closeDrawer(GravityCompat.START);
                displayToast(getString(R.string.menu_gellary_name));
                return true;
            case R.id.menu_tools:
                drawer.closeDrawer(GravityCompat.START);
                displayToast(getString(R.string.menu_tools_name));
                return true;
            case R.id.menu_share:
                drawer.closeDrawer(GravityCompat.START);
                displayToast(getString(R.string.menu_share_name));
                return true;
            case R.id.menu_com:
                drawer.closeDrawer(GravityCompat.START);
                displayToast(getString(R.string.menu_Communicate_name));
                return true;
            default:
                return false;
        }
    }

    private void displayToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    /**
     * Inflates the options menu.
     * @param menu  Menu to inflate
     * @return      Returns true if menu is inflated.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_drawer, menu);
        return true;
    }

    /**
     * Handles a click on the Settings item in the options menu.
     * @param item  Item in options menu that was clicked.
     * @return      Returns true if the item was Settings.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
