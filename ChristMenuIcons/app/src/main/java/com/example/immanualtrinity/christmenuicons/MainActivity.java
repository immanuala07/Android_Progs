package com.example.immanualtrinity.christmenuicons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuinflater=getMenuInflater();
        menuinflater.inflate(R.menu.menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.menu_bookmark:
// Single menu item is selected do something
// Ex: launching new activity/screen or show alert message
                Toast.makeText(MainActivity.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_save:
                Toast.makeText(MainActivity.this, "Save is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_search:
                Toast.makeText(MainActivity.this, "Search is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_share:
                Toast.makeText(MainActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_delete:
                Toast.makeText(MainActivity.this, "Delete is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.comment:
                Toast.makeText(MainActivity.this, "Comment is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_refresh:
                Toast.makeText(MainActivity.this, "Refresh is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_preferences:
                Toast.makeText(MainActivity.this, "Preferences is Selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
