package com.rocha.karla.everything;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;

public class AutoCom extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    Context context = AutoCom.this;
    ImageButton imgBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_com);

        imgBackBtn = (ImageButton) findViewById(R.id.menuBackButton);
        imgBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AutoCom.this, MainActivity.class));
            }
        });

        String[] texts = context.getResources().getStringArray(R.array.states);

        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.idAutoCompTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, texts);
        autoCompleteTextView.setAdapter(adapter);
    }
}
