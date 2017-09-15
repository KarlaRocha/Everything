package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GView extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gview);
        gridView = (GridView)findViewById(R.id.idMovieGrid);
        gridView.setAdapter(new ImageAdapter(this, AppData.DataList.MOVIES));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GView.this, AppData.DataList.MOVIE_TITLES[position],
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
