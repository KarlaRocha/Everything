package com.rocha.karla.everything;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MultAutoComp extends AppCompatActivity {
    MultiAutoCompleteTextView autoCompleteTextView;
    Context context = MultAutoComp.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult_auto_comp);

        String[] texts = context.getResources().getStringArray(R.array.states);

        autoCompleteTextView = (MultiAutoCompleteTextView)findViewById(R.id.idAutoMultComTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, texts);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
