package com.rocha.karla.everything;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Checkbox extends AppCompatActivity {

    CheckBox checkbox1, checkbox2, checkbox3;
    ImageButton imgBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        imgBackBtn = (ImageButton) findViewById(R.id.menuBackButton);
        imgBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Checkbox.this, MainActivity.class));
            }
        });

        Button btn = (Button)findViewById(R.id.button);
        checkbox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkBox3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickMe();
            }
        });

    }


    public void ClickMe(){
        if(checkbox1.isChecked() && checkbox2.isChecked() && checkbox3.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
        }else if (checkbox1.isChecked() && checkbox2.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
        }else if (checkbox1.isChecked() && checkbox3.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        }else if (checkbox1.isChecked() && checkbox3.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        }else if (checkbox2.isChecked() && checkbox3.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
        }else if (checkbox1.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
        }else if (checkbox2.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
        }else if (checkbox3.isChecked()){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
        }else{
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#000000"));
        }
    }
}
