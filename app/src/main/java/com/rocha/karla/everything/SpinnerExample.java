package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerExample extends AppCompatActivity {
    Spinner spinner;
    final String COUNTRY = "Country";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_example);

        final String[] countries = {COUNTRY, "India", "Australia", "Britain", "Ireland"};

        spinner = (Spinner)findViewById(R.id.idSpinner);

        final ArrayAdapter adapter = new ArrayAdapter(SpinnerExample.this, android.R.layout.simple_spinner_dropdown_item, countries);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);
                String text = item.toString();
                if(text != COUNTRY)
                    Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
