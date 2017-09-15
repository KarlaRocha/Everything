package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class SwitchExample extends AppCompatActivity {
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_example);

        aSwitch = (Switch)findViewById(R.id.idSwitch);
    }
    // Method called directly in xml file
    public void onSwitchClick(View v){
        if (aSwitch.isChecked())
            Toast.makeText(getApplicationContext(), "Toggle On", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(), "Toggle Off", Toast.LENGTH_SHORT).show();
    }
}
