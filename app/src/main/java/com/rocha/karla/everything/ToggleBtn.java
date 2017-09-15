package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleBtn extends AppCompatActivity {
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_btn);

        toggleButton = (ToggleButton)findViewById(R.id.idToggleBtn);
    }
    // Method called directly from xml file
    public void onToggleClick(View v){
        if (toggleButton.isChecked())
            Toast.makeText(getApplicationContext(), "Toggle ON", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(), "Toggle OFF", Toast.LENGTH_SHORT).show();
    }
}
