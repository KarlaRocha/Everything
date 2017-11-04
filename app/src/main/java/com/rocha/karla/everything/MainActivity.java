package com.rocha.karla.everything;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Hashtable<String, Class> activities = new Hashtable<>();

        for (int i = 0; i < AppData.DataList.MAIN_TITLES.length; i++){
            activities.put(AppData.DataList.MAIN_TITLES[i], AppData.DataList.MAIN_ACTIVITIES[i]);
        }

        ListView listView = (ListView)findViewById(R.id.main_listview);

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                AppData.DataList.MAIN_TITLES);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object txtObject = parent.getItemAtPosition(position);
                Class classItem = activities.get(txtObject.toString());

                try{
                    startActivity(new Intent(MainActivity.this, classItem));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Not available",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        MenuItem menuItem = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return true;
    }
}
